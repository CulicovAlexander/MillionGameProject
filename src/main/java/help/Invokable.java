package help;

import answerQuestion.Answer;
import answerQuestion.Question;

@FunctionalInterface
public interface Invokable {

   Answer[] getHelpAnswers (Question question);

}
