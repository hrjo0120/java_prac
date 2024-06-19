package org.prac_0618;

public class prac_0618_work_4 {
    public static void main(String[] args) {
        // 문제4: 전사가 들고 있는 무기에 의해서 서로 다른 공격형태를 보이도록 해주세요.
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
        a전사.이름 = "철수";  //이름을 바꿔줌
        a전사.공격();
        // 출력 : 철수가 칼로 공격합니다.
    }
}

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
        //과정
        //System.out.println("카니가" + a무기 +"로 공격합니다.");    //일단 쓰고 보기 a무기의 형태:org.prac_0618.활@6acbcfc0 라서 의미가 없다.
        a무기.작동(this.이름);
    }
}
class 무기 {
    void 작동(String 공격자이름) {

    }

    void 방어 () {    // 오버라이드 선택
        System.out.println("무기 방어");
    }
}

class 칼 extends 무기 {
    void 작동(String 공격자이름) {     //구상메소드, 매개변수 명은 달라도 상관없음, 근데 같아야 어떤 데이터가 넘어왔는지 알 수 있음. 기본적으로 매개변수 타입만 같으면 됨.
        System.out.println(공격자이름 + "가 칼로 공격합니다.");
    }

    void 방어 () {
      System.out.println("칼 방어");
    }
}

class 활 extends 무기 {
    void 작동(String 공격자이름) {
        System.out.println(공격자이름 + "가 활로 공격합니다.");
    }




//abstract class 무기 {
//    abstract void 작동(String 공격자이름);    //버튼 유지용으로 만들어 놓은 것, 오버라이드 필수
//        //어차피 오버라이드 해서 쓰기 때문에 쓸 필요 없다. 문법적으로 막은 것이 abstract(추상메소드)
//        //abstract를 가진 메소드는 abstract 클래스여야한다.
//
//    void 방어 () {    // 오버라이드 선택
//        System.out.println("무기 방어");
//    }
//}

//abstract class 무기 { //추상메소드만으로 이루어진 추상클래스일때 abstract 키워드를 빼고 interface로 사용할 수 있다.
//    abstract void 작동(String 공격자이름); //abstract가 붙을 경우 구현부가 없어 자식클래스에서 무조건 오버라이드하여 사용해야한다.
//}

//interface 무기 {  //
//    void 작동(String 공격자이름);
//}
//
//interface 무기2 {
//    void 작동(String 공격자);
//}
//
//class 칼 implements 무기, 무기2 {    //interface는 다중상속이 가능하다. why? 무조건 오버라이드해서 사용해야하게 때문에 헷갈릴 일이 없다.
//    public void 작동(String 공격자이름) {
//        System.out.println(공격자이름 + "가 칼로 공격합니다.");
//    }
//}
//
//class 활 implements 무기 {
//    public void 작동(String 공격자이름) {
//        System.out.println(공격자이름 + "가 활로 공격합니다.");
//    }
//}

//class 칼 extends 무기 {
//    void 작동(String 공격자이름) {     //구상메소드, 매개변수 명은 달라도 상관없음, 근데 같아야 어떤 데이터가 넘어왔는지 알 수 있음. 기본적으로 매개변수 타입만 같으면 됨.
//        System.out.println(공격자이름 + "가 칼로 공격합니다.");
//    }
//
//    void 방어 () {
//      System.out.println("칼 방어");
//    }
//}
//
//class 활 extends 무기 {
//    void 작동(String 공격자이름) {
//        System.out.println(공격자이름 + "가 활로 공격합니다.");
//    }

}


