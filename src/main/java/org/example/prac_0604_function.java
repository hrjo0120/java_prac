package org.example;

public class prac_0604_function {
//    static int a = 20;  //여기서 선언된 변수는 전역변수(why? 함수 밖에서 선언됨)

    public static void main(String[] args) {
//        System.out.println(a);
//        int a = 30;
//        System.out.println(a);
//        exam();
//        계산기.합(10, 20);
//        계산기.합(80, 90);
//        int rs = 10 + 30;
//        System.out.println("rs : " + rs);
//
//        int rs2 = 계산기.합(10,20);
//        System.out.println("rs2 : "+ rs2);
//    }
//
//    public static void exam() {
//        System.out.println("exam 출력 a : " + a);
//    }

        //===
        // 함수의 기본 사용법
        int rs = 계산기.합(10, 20);
        System.out.println(rs);

        boolean rs2 = 계산기.is_a_bigger_than_b(10, 20);   // 사실 이문장은 꽤 많은 것을 담고있다. 리턴타입, 클래스명,메소드명,매개변수 갯수 등등

        System.out.println(rs2);
        rs2 = 계산기.is_a_bigger_than_b(240, 20);
        System.out.println(rs2);
        rs2 = 계산기.is_a_bigger_than_b(20, 20);
        System.out.println(rs2);

    }

    class 계산기 {

//    static int 합(int a, int b) {
//        System.out.println(a + b);
//        return 10;
//    }

        static int 합(int a, int b) {
            return a + b;
        }

        static boolean is_a_bigger_than_b(int a, int b) {
            if(a > b) {
                return true;
            }

            return false;

        }
    }

}


