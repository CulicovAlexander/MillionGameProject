package answerQuestion;

public class Answer {

    private String answer;
    private boolean isCorrect;
    private AnswerSequence answerSequence;

    public Answer (String answer, boolean isCorrect, AnswerSequence answerSequence) {
        this.answer = answer;
        this.isCorrect = isCorrect;
        this.answerSequence = answerSequence;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean getIsCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public AnswerSequence getAnswerSequence() {
        return answerSequence;
    }

    public void setAnswerSequence(AnswerSequence answerSequence) {
        this.answerSequence = answerSequence;
    }
}