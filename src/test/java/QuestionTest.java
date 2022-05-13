import answerQuestion.Answer;
import answerQuestion.Question;
import main.QuestionInit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class QuestionTest {

    @Test
    void getCorrectAnswer_generic(){
        Random rand = new Random();
        int range = rand.nextInt(2);

        QuestionInit game = new QuestionInit();
        Question question = game.getQuestionByLevel(range);

        Answer answer = question.getCorrectAnswer(question.getAnswerList());

        Assertions.assertTrue(answer.getIsCorrect());
    }

    @Test
    void getWrongAnswer_generic(){
        Random rand = new Random();
        int range = rand.nextInt(2);

        QuestionInit game = new QuestionInit();
        Question question = game.getQuestionByLevel(range);

        Answer[] answer = question.getWrongAnswer(question.getAnswerList());

        int i = 0;

        for(answer[i].getIsCorrect(); i<3; i++) {
            System.out.println("Obj is - " + answer[i].getIsCorrect());
            Assertions.assertFalse(answer[i].getIsCorrect());
        }
    }
}
