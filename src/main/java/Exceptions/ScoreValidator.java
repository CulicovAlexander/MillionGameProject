package Exceptions;

public class ScoreValidator {

    public static void validateScore(int generalScore) throws RuntimeException{
        if (generalScore < 0){
            throw new RuntimeException("InvalidScoreException");
        }
    }
}
