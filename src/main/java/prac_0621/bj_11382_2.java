package prac_0621;
//백준 문제 - 꼬마 정민
// stream 사용해서 풀기

import java.util.Arrays;
import java.util.Scanner;

public class bj_11382_2 {
    public static void main(String[] args) {
        //long sum = 0;
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");

        //스트림 사용
        long sum = Arrays.stream(inputs)
                .mapToLong(e -> Long.parseLong(e))
                .sum();
        //스트림도 어떤 연산을 하기에 편한 형태로 바꾸어준다.
        //mapToLong => 원래의 inputs(String)를 Long으로 매칭함(1:1 매칭)
        //e: 요소 하나 하나를 선택
        //parseLong으로 바뀌는 대상은 inputs에서 하나하나 꺼내오는 것
        //-> : 함수 실행

        //향상된 for문 사용했을 경우
//        long sum = 0;
//        for(String inputData : inputs) {    // inputData에는 inputs[0] ~ 마지막데이터까지 배열의 각 요소가 순회하면서 들어감.
//            sum += Long.parseLong(inputData);   //문자열을 숫자로 바꾸고 더함
//        }

        System.out.println(sum);

    }
}
