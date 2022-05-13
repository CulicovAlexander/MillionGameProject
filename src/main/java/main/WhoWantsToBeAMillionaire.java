package main;

import answerQuestion.Answer;
import answerQuestion.Question;
import help.AudienceHelp;
import help.Helper5050;
import help.PhoneCall;
import java.util.Scanner;
import static Exceptions.GameLvlValidator.validateGameLvl;
import static Exceptions.ScoreValidator.validateScore;

public class WhoWantsToBeAMillionaire {

    static int generalScore;
    public static boolean isUsed5050 = true;
    public static boolean isUsedPhoneCall = true;
    public static boolean isUsedAudienceHelp = true;
    static boolean isGame = true;
    public static void main(String[] args) {

        QuestionInit game = new QuestionInit();

        int GameLvl = 1;
        Scanner scanner = new Scanner(System.in);


        while (GameLvl < 6 && isGame) {

            try{
                validateGameLvl(GameLvl);
            } catch (RuntimeException e) {
                System.out.println("Game level is out of bounds!");
            }

            try{
                validateScore(generalScore);
            } catch (RuntimeException e) {
                System.out.println("General score is out of bounds!");
            }


            System.out.println("=== Who Wants To Be A Millionaire ===");
            System.out.println("The level is - " + GameLvl);
            System.out.println("Your score is - " + generalScore);

            if(isUsed5050 || isUsedPhoneCall || isUsedAudienceHelp){
                System.out.print("Available help options - ");
            }

            if(isUsed5050){
                System.out.print("50/50 | ");
            }

            if(isUsedPhoneCall){
                System.out.print("Phone call |");
            }

            if(isUsedAudienceHelp){
                System.out.print("Audience Help" + "\n");
            }

            Question randomQuestion = game.getQuestionByLevel(GameLvl);

            System.out.println(randomQuestion.getQuestion() + "\n");

            for (Answer answer : randomQuestion.getAnswerList())
                System.out.println(answer.getAnswerSequence() + ":" +
                        answer.getAnswer());

            System.out.println("Your Answer is ?");
            String answer = scanner.nextLine().toUpperCase();

            if (answer.equals(randomQuestion.getCorrectAnswer(randomQuestion.getAnswerList()).getAnswerSequence().toString())) {
                System.out.println("Correct!");
                System.out.println("You earned - " + randomQuestion.getScore());
                generalScore += randomQuestion.getScore();
                GameLvl++;

            } else if (answer.equals("50/50") && isUsed5050) {

                System.out.println("Here are 50/50 options");

                Helper5050 helper5050 = new Helper5050();
                helper5050.getHelpAnswers(randomQuestion);

                System.out.println("Your Answer is ?");
                answer = scanner.nextLine().toUpperCase();

                if (answer.equals(randomQuestion.getCorrectAnswer(randomQuestion.getAnswerList()).getAnswerSequence().toString())) {
                    System.out.println("Correct!");
                    System.out.println("You earned - " + randomQuestion.getScore());
                    generalScore += randomQuestion.getScore();
                    GameLvl++;
                }else{
                    isGame = false;
                    System.out.println("Wrong!");
                    break;
                }

            }  else if (answer.equals("PHONE CALL") && isUsedPhoneCall) {

                PhoneCall phoneCall = new PhoneCall();
                phoneCall.getHelpAnswers(randomQuestion);

                System.out.println("Your Answer is ?");
                answer = scanner.nextLine().toUpperCase();

                if (answer.equals(randomQuestion.getCorrectAnswer(randomQuestion.getAnswerList()).getAnswerSequence().toString())) {
                    System.out.println("Correct!");
                    System.out.println("You earned - " + randomQuestion.getScore());
                    generalScore += randomQuestion.getScore();
                    GameLvl++;
                } else {
                    isGame = false;
                    System.out.println("Wrong!");
                    break;}

            } else if (answer.equals("AUDIENCE HELP") && isUsedAudienceHelp) {
                System.out.println("Here is audience opinions");
                AudienceHelp audienceHelp = new AudienceHelp();
                audienceHelp.getHelpAnswers(randomQuestion);

                System.out.println("Your Answer is ?");
                answer = scanner.nextLine().toUpperCase();

                if (answer.equals(randomQuestion.getCorrectAnswer(randomQuestion.getAnswerList()).getAnswerSequence().toString())) {
                    System.out.println("Correct!");
                    System.out.println("You earned - " + randomQuestion.getScore());
                    generalScore += randomQuestion.getScore();
                    GameLvl++;
                }else{
                    isGame = false;
                    System.out.println("Wrong!");
                    break;}
            }
            else {//(!answer.equals(randomQuestion.getCorrectAnswer(randomQuestion.getAnswerList()).getAnswerSequence().toString())){
                isGame = false;
                System.out.println("Wrong!");
                break;

            }
        }
        if (isGame) {
            System.out.println("Game over - you won!");
            System.out.println("Final score is - " + generalScore);
        }
    }
}
