import org.junit.Test;

import static org.junit.Assert.*;

public class MissionTest2 {
    int bingoCnt(int[][] arr) {
        int bingoCnt = 0;
        boolean isGaroZeroExist;
        boolean isSeroZeroExist;
        boolean isCrossZeroExist = false;
        boolean isCrossZeroExist2 = false;

        for (int i = 0; i < arr.length; i++) {
            //대각선2개 빙고인지 검사
            if (arr[i][i] == 0) {
                isCrossZeroExist = true;
            }
            if (arr[i][4 - i] == 0) {
                isCrossZeroExist2 = true;
            }
            //가로,세로 빙고인지 검사
            isGaroZeroExist = false;
            isSeroZeroExist = false;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    isGaroZeroExist = true;
                }
                if (arr[j][i] == 0) {
                    isSeroZeroExist = true;
                }
            }
            if (!isGaroZeroExist) bingoCnt++;
            if (!isSeroZeroExist) bingoCnt++;
        }
        if (!isCrossZeroExist) bingoCnt++;
        if (!isCrossZeroExist2) bingoCnt++;
        return bingoCnt;
    }

    @Test
    public void bingoTest1() {
        int[][] arr = {
                {1, 1, 1, 1, 1},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1},
        };
        assertTrue(bingoCnt(arr) == 2);
    }

    @Test
    public void bingoTest2() {
        int[][] arr = {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
        };
        assertTrue(bingoCnt(arr) == 12);
    }
}