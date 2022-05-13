package help;

import answerQuestion.Answer;
import answerQuestion.Question;

import static main.WhoWantsToBeAMillionaire.isUsedPhoneCall;

public class PhoneCall implements Invokable{

    @Override
    public Answer[] getHelpAnswers(Question question) {


            Answer[] phoneCallAnswer = new Answer[1];
            Answer answer = question.getCorrectAnswer(question.getAnswerList());
            phoneCallAnswer[0] = answer;
            System.out.println("The suggested correct answer is - " + phoneCallAnswer[0].getAnswerSequence() + ":"
                    + phoneCallAnswer[0].getAnswer());

            isUsedPhoneCall = false;
            return phoneCallAnswer;
    }
}
