package help;

import answerQuestion.Answer;
import answerQuestion.Question;
import java.util.Random;
import static main.WhoWantsToBeAMillionaire.isUsed5050;

public class Helper5050 implements Invokable {

    @Override
    public Answer[] getHelpAnswers(Question question) {



            Random print = new Random();
            int printRand = print.nextInt(2);
            Random randWrong = new Random();
            int rangeWrong = randWrong.nextInt(3);
            Answer[] fiftyFiftyAnswerList = new Answer[2];
            Answer answer = question.getCorrectAnswer(question.getAnswerList());
            Answer[] wrongAnswerList = question.getWrongAnswer(question.getAnswerList());
            fiftyFiftyAnswerList[0] = answer;
            fiftyFiftyAnswerList[1] = wrongAnswerList[rangeWrong];


            System.out.println("The correct one - " + fiftyFiftyAnswerList[printRand].getAnswerSequence() +
                    ":" + fiftyFiftyAnswerList[printRand].getAnswer());

            if (printRand == 0) {
                System.out.println("The wrong one - " + fiftyFiftyAnswerList[1].getAnswerSequence() +
                        ":" + fiftyFiftyAnswerList[1].getAnswer());
            } else {
                System.out.println("The wrong one - " + fiftyFiftyAnswerList[0].getAnswerSequence() +
                        ":" + fiftyFiftyAnswerList[0].getAnswer());
            }
            isUsed5050 = false;
            return fiftyFiftyAnswerList;

    }
}