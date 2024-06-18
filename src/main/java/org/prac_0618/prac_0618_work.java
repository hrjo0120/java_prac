package org.prac_0618;

public class prac_0618_work {
    public static void main(String[] args) {
//        //올바른 리턴타입으로 메서드를 만들어주세요.   ??
//        int i = 로봇.get정수();
//        boolean b = 로봇.get논리();
//        사람 a사람 = 로봇.get사람();
//        사람 a사람2 = 로봇.get사람2();
//        사람 a사람3 = 로봇.get사람3();
//        사람 a사람4 = 로봇.get사람4();
//        사람 a사람5 = 로봇.get사람5(123, false);
//        로봇.get사람6(123, false);

        //문제: 사람이 a왼팔 이라는 변수를 가질 수 있게 해주세요.
        사람 a사람 = new 사람();

        a사람.나이 = 20;
        a사람.a왼팔 = new 팔();

    }
}

// 문제1
//class 사람 {
//
//}
//
//class 로봇 extends 사람 {
//    static int get정수() {
//        return 0;
//    }
//
//    static boolean get논리() {
//        return true;
//    }
//
//    static void get사람() {
//    }
//
//    static void get사람2() {
//    }
//
//    static void get사람3() {
//    }
//
//    static void get사람4() {
//    }
//
//    static void get사람5(int a, boolean b) {
//    }
//
//    static void get사람6(int a, boolean b) {
//
//    }
//
//
//}

class 사람 {
    // 클래스안에 변수를 정의 할 수 있다.
    int 나이;
}
