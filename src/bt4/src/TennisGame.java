public class TennisGame {
    public static final String MINUS = "-";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";

    public static String getScore(String firstNameOfPlayer, String SecondNameOfPlayer, int FirstScore, int SecondScore) {
        String score = "";
        int tempScore = 0;
        final boolean isFirstScoreEqualSecondScore = FirstScore == SecondScore;
        if (isFirstScoreEqualSecondScore) {
            switch (FirstScore) {
                case 0:
                    score = LOVE + MINUS + "All";
                    break;
                case 1:
                    score = FIFTEEN + MINUS + "All";
                    break;
                case 2:
                    score = THIRTY + MINUS + "All";
                    break;
                case 3:
                    score = FORTY + MINUS + "All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else {
            final boolean isFirstScoreEqualOrBigger4 = FirstScore >= 4;
            final boolean isSecondScoreEqualOrBigger4 = SecondScore >= 4;
            if (isFirstScoreEqualOrBigger4 || isSecondScoreEqualOrBigger4) {
                int minusResult = FirstScore - SecondScore;
                final boolean isMinusResultEqual1 = minusResult == 1;
                final boolean isMinusResultBiggerOrEqual2 = minusResult >= 2;
                if (isMinusResultEqual1) score = "Advantage player1";
                else if (isMinusResultEqual1) score = "Advantage player2";
                else if (isMinusResultBiggerOrEqual2) score = "Win for player1";
                else score = "Win for player2";
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) tempScore = FirstScore;
                    else {
                        score += MINUS;
                        tempScore = SecondScore;
                    }
                    switch (tempScore) {
                        case 0:
                            score += LOVE;
                            break;
                        case 1:
                            score += FIFTEEN;
                            break;
                        case 2:
                            score += THIRTY;
                            break;
                        case 3:
                            score += FORTY;
                            break;
                    }
                }
            }

        }
        return score;
    }
}



