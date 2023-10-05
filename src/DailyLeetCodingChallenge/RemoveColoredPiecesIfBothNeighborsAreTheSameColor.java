package DailyLeetCodingChallenge;

public class RemoveColoredPiecesIfBothNeighborsAreTheSameColor {
    public boolean winnerOfGame(String colors) {
        int bonCnt = 0, aliceCnt = 0, bob = 0, alice = 0;
        for (char i : colors.toCharArray()) {
                if (i == 'A') {
                    aliceCnt++;
                    if (aliceCnt >= 3) {
                        alice++;
                    }
                    bonCnt = 0;
                } else {
                    bonCnt++;
                    if (bonCnt >= 3) {
                        bob++;
                    }
                    aliceCnt = 0;
                }
        }
        return alice > bob;
    }
}
