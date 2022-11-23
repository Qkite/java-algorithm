package com.likelion.algorithm1123;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 파스칼의 삼각형
// 맨 처음과 맨 뒤는 1로 고정되어 있음
// 3번째 줄 2번 - 2번째줄 1,2 번의 함
// 3번째 줄 3번 - 2번째줄 2,3 번의 합
// 4번재 줄 2번 - 3번째줄 1,2 번의 합
// 4번재 줄 3번 - 3번째줄 2,3 번의 합
// 4번재 줄 4번 - 3번째줄 3,4 번의 합
public class CodeUp1858 {

    public int[] pascalsTriangle1(int num) {

        if (num == 1) {
            return new int[]{1};
        } else if (num == 2) {
            return new int[]{1, 1};
        } else {
            int[] row = new int[num];

            row[0] = 1;
            row[num - 1] = 1;

            int[] previousRow = pascalsTriangle1(num - 1);

            for (int i = 1; i < num - 1; i++) {
                row[i] = previousRow[i - 1] + previousRow[i];
            }
            // 반복문 사용해서 안됨

            return row;
        }
    }

    // n번째 행, r번째 열 숫자를 직접 구하는 방법으로 하는 것이 좋을 듯
    // 3번째 줄 2번 - 2번째줄 1,2 번의 합 - 2번째 줄 1번, 1번째줄 1번, 1번째줄 1번의 합

    public int pascalsTriangle(int n, int r) {

        if (r == 1) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else if (n == r) {
            return 1;
        } else {
            return pascalsTriangle(n - 1, r - 1) + pascalsTriangle(n - 1, r);
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = bufferedReader.readLine().split(" ");

        int rowNum = Integer.parseInt(inputs[0]);
        int colNum = Integer.parseInt(inputs[1]);

        CodeUp1858 codeUp1858 = new CodeUp1858();
//        int[] array = codeUp1858.pascalsTriangle1(rowNum);
//        System.out.println(array[colNum-1]);

        System.out.println(codeUp1858.pascalsTriangle(rowNum, colNum));

    }


}
