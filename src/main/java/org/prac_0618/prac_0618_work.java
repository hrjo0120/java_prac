package org.prac_0618;

public class prac_0618_work {
    public static void main(String[] args) {
//        //문제1: 올바른 리턴타입으로 메서드를 만들어주세요.
//        int i = 로봇.get정수();
//        boolean b = 로봇.get논리();
//        사람 a사람 = 로봇.get사람();
//        사람 a사람2 = 로봇.get사람2();
//        사람 a사람3 = 로봇.get사람3();
//        사람 a사람4 = 로봇.get사람4();
//        사람 a사람5 = 로봇.get사람5(123, false);
//        로봇.get사람6(123, false);

//        //문제2: 사람이 a왼팔 이라는 변수를 가질 수 있게 해주세요.
//        사람 a사람 = new 사람();
//
//        a사람.나이 = 20;
//        a사람.a왼팔 = new 팔();

//        //문제3: 전사가 가지고 있는 변수 a무기가 칼과 활에 모두 호환되게 해주세요.
//        // 문제 : 아래가 실행되도록 해주세요.
//
//        전사 a전사 = new 전사();
//
//        a전사.나이 = 20;
//        a전사.a무기 = new 활();
//        a전사.a무기 = new 칼();

        //문제4: 전사가 들고 있는 무기에 의해서 서로 다른 공격형태를 보이도록 해주세요.
        전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 카니가 활로 공격합니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 카니가 칼로 공격합니다.
    }
}

//class 사람 { }
//
//class 로봇 extends 사람 {
//    public static int get정수() {
//        return 1;
//    }
//
//    public static boolean get논리() {
//        return true;
//    }
//
//    public static 사람 get사람() {
//        return new 사람();
//    }
//
//    public static 사람 get사람2() {
//        return new 사람();
//    }
//
//    public static 사람 get사람3() {
//        return new 사람();
//    }
//
//    public static 사람 get사람4() {
//        return new 사람();
//    }
//
//    public static 사람 get사람5(int a, boolean b) {
//        return new 사람();
//    }
//
//    public static 사람 get사람6(int a, boolean b) {
//        return new 사람();
//    }
//}


//// 문제2: 사람이 a왼팔 이라는 변수를 가질 수 있게 해주세요.
//class 사람 {
//    // 클래스안에 변수를 정의 할 수 있다.
//    int 나이;
//    팔 a왼팔;
//}
//
//class 팔 {
//}

//문제3: 전사가 들고 있는 무기에 의해서 서로 다른 공격형태를 보이도록 해주세요.
// class 전사 {
//   int 나이;
//   무기 a무기;
// }

// class 무기 {

// }

// class 활 extends 무기{

// }

// class 칼 extends 무기{

// }

//문제4: 전사가 들고 있는 무기에 의해서 서로 다른 공격형태를 보이도록 해주세요.
class 전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    int 나이;
    // 인스턴스 변수
    무기 a무기;

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }

    void 공격() {


    }
}

class 무기 {
    void 사용(String 사용자) {
    }
}

class 칼 extends 무기 {
    void 사용(String 사용자) {
        System.out.println(사용자 + "가 칼로 공격합니다.");
    }
}

class 활 extends 무기 {
    void 사용(String 사용자) {
        System.out.println(사용자 + "가 활로 공격합니다.");
    }
}
