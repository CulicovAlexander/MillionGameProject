import answerQuestion.Answer;
import answerQuestion.Question;
import help.AudienceHelp;
import help.Helper5050;
import help.PhoneCall;
import main.QuestionInit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class HelpersTest {

    @Test
    void AudienceHelp_generic(){
        Random rand = new Random();
        int range = rand.nextInt(2);

        QuestionInit game = new QuestionInit();
        Question question = game.getQuestionByLevel(range);

        AudienceHelp audienceHelp = new AudienceHelp();
        Answer[] answers = audienceHelp.getHelpAnswers(question);

        Assertions.assertTrue(answers[3].getIsCorrect());
        Assertions.assertFalse(answers[0].getIsCorrect());
        Assertions.assertFalse(answers[1].getIsCorrect());
        Assertions.assertFalse(answers[2].getIsCorrect());
    }
    @Test
    void Helper5050_generic(){
        Random rand = new Random();
        int range = rand.nextInt(2);

        QuestionInit game = new QuestionInit();
        Question question = game.getQuestionByLevel(range);

        Helper5050 helper5050 = new Helper5050();
        Answer[] answers = helper5050.getHelpAnswers(question);

        Assertions.assertNotNull(answers[0]);
        Assertions.assertNotNull(answers[1]);
    }
    @Test
    void PhoneCall_generic(){
        Random rand = new Random();
        int range = rand.nextInt(2);

        QuestionInit game = new QuestionInit();
        Question question = game.getQuestionByLevel(range);

        PhoneCall phoneCall = new PhoneCall();
        Answer[] answer = phoneCall.getHelpAnswers(question);

        Assertions.assertTrue(answer[0].getIsCorrect());

    }
}
