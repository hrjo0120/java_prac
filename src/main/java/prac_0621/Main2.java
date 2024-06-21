package prac_0621;

//백준 문제 - 꼬마 정민
//문제
//꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
//
//입력
//첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
//
//        출력
//A+B+C의 값을 출력한다.
//
//예제 입력 1
//        77 77 7777
//예제 출력 1
//        7931

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        long sum = 0;
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");

//        for(int i=0; i<inputs.length; i++){
//            sum += Long.parseLong(inputs[i]);
//        }

        //향상된 for문(for each문)
        // 배열 안에 들어있는 데이터를 나타내주는 것..?
        for(String inputData : inputs) {    // inputData에는 inputs[0] ~ 마지막데이터까지 배열의 각 요소가 순회하면서 들어감.

            sum += Long.parseLong(inputData);
        }

        System.out.println(sum);

    }
}
