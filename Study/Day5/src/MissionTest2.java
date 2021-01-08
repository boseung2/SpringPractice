import org.junit.Test;

import static org.junit.Assert.*;

public class MissionTest2 {
    int bingoCnt(int[][] arr) {
        int bingoCnt = 0;
        boolean isZeroExist;

        for(int i=0; i<arr.length; i++){
            //가로가 빙고인지 검사
            isZeroExist = false;
            for (int j=0; j<arr[i].length; j++) {
                if(arr[i][j] == 0){
                    isZeroExist = true;
                }
            }
            if(!isZeroExist) bingoCnt++;

            //세로가 빙고인지 검사
            isZeroExist = false;
            for (int j=0; j<arr[i].length; j++) {
                if(arr[j][i] == 0) {
                    isZeroExist = true;
                }
            }
            if(!isZeroExist) bingoCnt++;
        }

        //대각선(\)이 빙고인지 검사
        isZeroExist = false;
        for(int i=0; i<arr.length; i++) {
            if(arr[i][i] == 0) {
                isZeroExist = true;
            }
        }
        if(!isZeroExist) bingoCnt++;


        //대각선(/)이 빙고인지 검사
        isZeroExist = false;
        for(int i=0; i<arr.length; i++) {
            if(arr[i][4-i] == 0) {
                isZeroExist = true;
            }
        }
        if(!isZeroExist) bingoCnt++;


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