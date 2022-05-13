package Exceptions;

public class GameLvlValidator {

    public static void validateGameLvl(int GameLvl) throws RuntimeException {
        if (GameLvl < 0 || GameLvl > 15) {
            throw new RuntimeException("InvalidLevelException");
        }
    }
}
