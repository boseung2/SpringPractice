import org.junit.Test;

import static org.junit.Assert.*;

class Card {
    int kind;
    int number;

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    Card() {
        this(1, 1);
    }

    public String toString() {
        return String.format("[%d, %d]", kind, number);
    }
}

public class MainTest {
    public static String rankCheck(Card[] cArr) {
        int[] cntArr = new int[14];

        // cntArr에 카운트하기
        for (int i = 0; i < cArr.length; i++) {
            cntArr[cArr[i].number]++;
        }

        // 중복카드 몇장인지 확인(pair, double pair, three card, four card)
        int pairCount = 0;
        boolean isThreeCard = false;
        boolean isFourCard = false;
        for (int i = 0; i < cntArr.length; i++) {
            if (cntArr[i] == 2) {
                pairCount++;
            }
            if (cntArr[i] == 3) {
                isThreeCard = true;
            }
            if (cntArr[i] == 4) {
                isFourCard = true;
            }
        }


        //straight확인하기 - cntArr에 1이 5개인지 먼저
        int firstIndex = 0;
        boolean isStraight = true;
        int countOne = 0;
        for (int i = 0; i < cntArr.length; i++) {
            if (cntArr[i] == 1) {
                countOne++;
            }
        }

        // straight확인에서 cntArr[1] == 0일떄 1이 연속으로 5개있는지
        if (countOne == 5 && cntArr[1] == 0) {
            for (int i = 0; i < cntArr.length; i++) {
                if (cntArr[i] == 1) {
                    firstIndex = i;
                    break;
                }
            }
            for (int i = firstIndex; i < firstIndex + 5; i++) {
                if (cntArr[i] != 1) {
                    isStraight = false;
                    break;
                }
            }
            //straight확인에서 cntArr[1] == 1일때 0이 연속으로 8개있는지
        } else if (countOne == 5 && cntArr[1] == 1) {
            for (int i = 1; i < cntArr.length; i++) {
                if (cntArr[i] == 0) {
                    firstIndex = i;
                    break;
                }
            }
            for (int i = firstIndex; i < firstIndex + 8; i++) {
                if (cntArr[i] != 0) {
                    isStraight = false;
                    break;
                }
            }
            //numCount에 1이 5개가 아닐때는 당연 straight가아님
        } else {
            isStraight = false;
        }

        // true,false로 isStraight판별하기보단 카운트 해서 판별하는게 더 간결함
        //int straightCnt = 0;
        //for (int i = 0; i < cntArr.length; i++) {
        //if(cntArr[i]>1)
        //   break;
        //if(cntArr[i]==1) {
        //  for (int j = i+1; j <= i+4 && j < cntArr.length; j++) {
        //       if(cntArr[j]==1)
        //             straightCnt++;
        //       }
        //   }
        //}
        //isStraight = straightCnt==4;


        //FLUSH인지확인하기 - false로 먼저 초기화해줬는데 true로 하는거랑비교해봐야함
        boolean isFlush = true;
        int firstCardKind = cArr[0].kind;
        for (int i = 1; i < cArr.length; i++) {
            if (cArr[i].kind != firstCardKind) {
                isFlush = false;
                break;
            }
        }

        //먼저나온 변수가 더 우선순위 높게 return
        if (isFourCard) {
            return "FOUR CARD";
        }
        if (isThreeCard && pairCount == 1) {
            return "FULL HOUSE";
        }
        if (isFlush) {
            return "FLUSH";
        }
        if (isStraight) {
            return "STRAIGHT";
        }
        if (isThreeCard) {
            return "THREE CARD";
        }
        if (pairCount == 2) {
            return "2 PAIR";
        }
        if (pairCount == 1) {
            return "1 PAIR";
        }
        return "NOTHING";
    }

    @Test
    public void straightTest1() {
        Card[] cArr = {
                new Card(1, 1),
                new Card(2, 2),
                new Card(1, 3),
                new Card(4, 4),
                new Card(1, 5),
        };
        assertTrue(rankCheck(cArr).equals("STRAIGHT"));
    }

    @Test
    public void straightTest2() {
        Card[] cArr = {
                new Card(1, 2),
                new Card(1, 3),
                new Card(3, 4),
                new Card(1, 5),
                new Card(1, 6),
        };
        assertTrue(rankCheck(cArr).equals("STRAIGHT"));
    }

    @Test
    public void straightTest3() {
        Card[] cArr = {
                new Card(1, 7),
                new Card(2, 8),
                new Card(3, 5),
                new Card(1, 6),
                new Card(4, 4),
        };
        assertTrue(rankCheck(cArr).equals("STRAIGHT"));
    }

    @Test
    public void straightTest4() {
        Card[] cArr = {
                new Card(1, 13),
                new Card(1, 1),
                new Card(3, 2),
                new Card(1, 3),
                new Card(1, 4),
        };
        assertTrue(rankCheck(cArr).equals("STRAIGHT"));
    }

    @Test
    public void straightTest5() {
        Card[] cArr = {
                new Card(1, 12),
                new Card(1, 3),
                new Card(1, 1),
                new Card(3, 2),
                new Card(1, 13),
        };
        assertTrue(rankCheck(cArr).equals("STRAIGHT"));
    }

    @Test
    public void flushTest1() {
        Card[] cArr = {
                new Card(1, 3),
                new Card(1, 2),
                new Card(1, 3),
                new Card(1, 4),
                new Card(1, 8),
        };
        assertTrue(rankCheck(cArr).equals("FLUSH"));
    }

    @Test
    public void flushTest2() {
        Card[] cArr = {
                new Card(2, 1),
                new Card(2, 2),
                new Card(2, 7),
                new Card(2, 4),
                new Card(2, 10),
        };
        assertTrue(rankCheck(cArr).equals("FLUSH"));
    }

    @Test
    public void onePairTest1() {
        Card[] cArr = {
                new Card(2, 1),
                new Card(4, 2),
                new Card(2, 2),
                new Card(1, 4),
                new Card(2, 5),
        };
        assertTrue(rankCheck(cArr).equals("1 PAIR"));
    }

    @Test
    public void onePairTest2() {
        Card[] cArr = {
                new Card(2, 1),
                new Card(2, 8),
                new Card(1, 3),
                new Card(2, 4),
                new Card(3, 8),
        };
        assertTrue(rankCheck(cArr).equals("1 PAIR"));
    }

    @Test
    public void twoPairTest1() {
        Card[] cArr = {
                new Card(2, 1),
                new Card(4, 1),
                new Card(2, 3),
                new Card(1, 13),
                new Card(2, 13),
        };
        assertTrue(rankCheck(cArr).equals("2 PAIR"));
    }

    @Test
    public void threeCardTest1() {
        Card[] cArr = {
                new Card(2, 1),
                new Card(2, 2),
                new Card(2, 2),
                new Card(1, 2),
                new Card(2, 5),
        };
        assertTrue(rankCheck(cArr).equals("THREE CARD"));
    }

    @Test
    public void fourCardTest1() {
        Card[] cArr = {
                new Card(2, 1),
                new Card(4, 2),
                new Card(2, 2),
                new Card(1, 2),
                new Card(2, 2),
        };
        assertTrue(rankCheck(cArr).equals("FOUR CARD"));
    }

    @Test
    public void fullHouseTest1() {
        Card[] cArr = {
                new Card(2, 2),
                new Card(1, 2),
                new Card(2, 2),
                new Card(4, 5),
                new Card(2, 5),
        };
        assertTrue(rankCheck(cArr).equals("FULL HOUSE"));
    }

    @Test
    public void twoPairTest2() {
        Card[] cArr = {
                new Card(2, 1),
                new Card(2, 2),
                new Card(4, 2),
                new Card(2, 5),
                new Card(1, 5),
        };
        assertTrue(rankCheck(cArr).equals("2 PAIR"));
    }


}
