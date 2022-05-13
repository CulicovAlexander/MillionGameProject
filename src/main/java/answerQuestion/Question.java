package answerQuestion;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Question {

    private String question;
    private int lvl;
    private int score;
    List<Answer> AnswerList;

    public Question (String question, int lvl, int score, List answerList){
        this.question = question;
        this.lvl = lvl;
        this.score = score;
        this.AnswerList = answerList;

    }

    public Answer getCorrectAnswer (List<Answer> answerList) {

        List<Answer> correctList =  answerList.stream()
                .filter(answer -> answer.getIsCorrect()).collect(Collectors.toList());

        return correctList.get(0);

//        for (Answer answer : answerList)
//            if (answer.getIsCorrect()) {
//                return answer;
//            }
//        return null;
    }

//    int i = 0;
    public Answer[] getWrongAnswer (List<Answer> answerList) {

        List<Answer> wrongList =  answerList.stream()
                .filter(answer -> !answer.getIsCorrect()).collect(Collectors.toList());

        return wrongList.toArray(new Answer[0]);
//        Answer[] wrongAnswersList = new Answer[3];
//        for (Answer answer : answerList) {
//            if (!answer.getIsCorrect()) {
//                wrongAnswersList[i] = answer;
//                i++;
//            }
//        }
//        return wrongAnswersList;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public List<Answer> getAnswerList() {
        return AnswerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        AnswerList = answerList;
    }

}
