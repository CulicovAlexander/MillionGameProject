package help;

import answerQuestion.Answer;
import answerQuestion.Question;
import java.util.*;
import static main.WhoWantsToBeAMillionaire.isUsedAudienceHelp;

public class AudienceHelp implements Invokable{

    @Override
    public Answer[] getHelpAnswers(Question question) {


            int correctVariant1 = 50;
            Random firstInstance = new Random();
            int firstInstanceInt = firstInstance.nextInt(25);
            Random secondInstance = new Random();
            int secondInstanceInt = secondInstance.nextInt(25);
            int thirdInstance = 50 - firstInstanceInt - secondInstanceInt;

            Answer[] audienceHelpList = new Answer[4];
            int i = 0;

            for (Answer answer : question.getWrongAnswer(question.getAnswerList())) {
                audienceHelpList[i] = answer;
                i++;
            }
            Answer answer = question.getCorrectAnswer(question.getAnswerList());
            audienceHelpList[3] = answer;

            System.out.println(audienceHelpList[3].getAnswerSequence() + " : " + correctVariant1 + "%");
            System.out.println(audienceHelpList[0].getAnswerSequence() + " : " + firstInstanceInt + "%");
            System.out.println(audienceHelpList[1].getAnswerSequence() + " : " + secondInstanceInt + "%");
            System.out.println(audienceHelpList[2].getAnswerSequence() + " : " + thirdInstance + "%");

            isUsedAudienceHelp = false;
            return audienceHelpList;

    }
}
