package org.example;

import java.awt.*;
import java.util.Arrays;

public class prac_0617 {
    public static void main(String[] args) {
        //greet 함수에 Jin 값을 주어, String형 변수 msg에 넣겠다
        String msg = greet("Jin");
        //msg를 출력, 실행결과:  Hello Jin!
        System.out.println(msg);

        //createPoint 함수에 포인트값 (5, 10)을 주어 Point형 참조타입변수 point에 넣겠다.
        Point point = createPoint(5, 10);
        //포인트 출력, 실행결과: Point create at (5, 10), 이때 point.x와 point y는 상단에서 넣어준 인자가 이에 해당한다.
        System.out.println("Point create at (" + point.x + ", " + point.y + ")");
        //firstNEvenNembers 함수에 5라는 n값을 주어 int만 들어갈수 있는 배열 evens에 넣겠다.
        int[] evens = firstNEvenNumbers(5);
        //배열 출력, 실행결과: first 5 even numbers : 2, 4, 6, 8, 10 , firstNEvenNumbers 함수가 실행되어 그에 맞는 리턴값이 Arrays.toString(evens)으로 출력된다. ??
        System.out.println("first 5 even numbers : " + Arrays.toString(evens));
    }

    // 정적함수(static 키워드, 별도의 객체생성 없이 바로 사용 가능함)
    // 정적함수 이면서, String 타입을 리턴값으로 갖는 greet 함수 생성, 매개변수는 String name
    public static String greet(String name) {
        // 함수 사용 시 "Hello, " + name + "!" 형태로 리턴된다. name에는 함수 호출 시 넣는 값(=인자)이 들어간다.
        return "Hello, " + name + "!";
    }

    // 정적함수 이면서, Point 타입(사용자 정의 함수)을 리턴값으로 갖는 createPoint 함수 생성, 매개변수는 정수형 변수 x, y
    public static Point createPoint(int x, int y) {
        // 함수 사용 시 새로운 객체의 x, y 의 형태로 리턴된다. 리턴 값 x, y에는 함수 호출 시 넣는 숫자 2개(=인자)가 들어간다.
        return new Point(x, y);
    }

    //정적함수 이면서, 정수형 배열을 리턴값으로 갖는 firstNEbenNumber 함수 생성, 매개변수는 정수형 숫자 n
    public static int[] firstNEvenNumbers(int n) {
        // 객체 생성, n개의 배열이 들어갈 수 있는 객체 생성
        int[] evenNumbers = new int[n];

        //반복문, i의 값은 0, n의 값은 2부터 시작, i의 값이 n의 값보다 적은 횟수만큼 반복문이 실행됨, 반복문이 한번 씩 실행될 때 마다 num은 2씩 증가된다.
        for (int i = 0, num = 2; i < n; i++, num += 2) {
            // 반복문을 돌면서 num의 값을 evenNumbers에 저장한다.
            evenNumbers[i] = num;
        }
        // 배열 evenNumbers 를 리턴값으로 내보낸다.
        return evenNumbers;
    }

}
