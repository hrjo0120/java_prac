package org.example;

public class prac_0604_function {
    static int a = 20;  //여기서 선언된 변수는 전역변수(why? 함수 밖에서 선언됨)

    public static void main(String[] args) {
        System.out.println(a);
        int a = 30;
        System.out.println(a);
        exam();
        계산기.합(10, 20);
        계산기.합(80, 90);

    }

    public static void exam() {
        System.out.println("exam 출력 a : " + a);

    }
}

class 계산기 {
    int a = 40;

    static void 합(int a, int b) {
        System.out.println("계산기 클래스 합 메서드 내부 a: " + a);
        System.out.println("계산기 클래스 합 메서드 내부 a: " + b);

    }
}

