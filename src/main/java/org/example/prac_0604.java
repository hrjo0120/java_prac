//0604
//오전
package org.example;

//public class prac_0604 {
//    public static void main(String[] args) {    //메인메소드가 실행 기준
        //오전
//        사람 a = new 사람();
//        a.age = 23;
//        a.name = "김철수";
//        a.isMarried = true;
//        a.introduce();
//
//        사람 b = new 사람();
//        b.age = 33;
//        b.name = "박영수";
//        b.isMarried = false;
//        b.introduce();
//        System.out.println(b.age);

//        //오후
//        //지금부터 하는 내용 중요함
//        //계산기.합();    //계산기 클래스 안에 있는 합이라는 메소드를 실행하겠다.
//        계산기.합(10, 20);    //출력: 30  소괄호 안에 값을 넣어줌. 소괄호 안은 요청사항으로 보면 됨
//        계산기.합(20, 50);    //출력: 70
//        계산기.합(30, 40);
//
////        //안되는 예시
////        //계산기.합();  //값을 안줘서 오류
////        //계산기.합(true, 40);  //타입이 안맞아서 오류
////        //계산기.합(30, 40, 40);  //갯수가 안맞아서 오류
//        계산기.합(9);
//
//        //System.out.println(a + b);  //a, b의 수명 , 메인 메소드 안에서는 a, b가 뭔지 알아 차릴 수 있는 능력이 없다.
//
//    }
//}
//
////오후
//class 계산기 {
//    static void 합(int c) {
//        System.out.println(c);
//    }
//
//    static void 합(int a, int b) {
////        int a = 30;     // 70밖에 출력이 안되는 이유: a와 b의 값이 고정이라서.
////        int b = 40;
////        int a;  //초기화 된 적이 없기때문에 문제가 된다.
////        int b;
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);
//    }
//    // 위에있는 두가지를 묶어 메소드 오버로딩 이라고 한다. (다형성의 한 종류)
//
////    static void print_a_and_b() {
////        System.out.println(a);  // 안되는 이유: 합 메소드의 지역변수로 a,b가 있기 때문에 알아차릴 수 있는 능력이 없다.
////        System.out.println(b);
////    }
//
//
//}


//오전
//class 사람 {
//    //필드(저장용)
//    int age;
//    String name;
//    boolean isMarried;
//
//    //메소드(실행용)
//    void introduce() {
//        System.out.println("introduce 실행됨");
//        System.out.println("안녕, 나는 23살 기혼, 김철수야");

//        System.out.println("==자기소개==");
//        System.out.printf("이름 : %s \n", "김철수");     //이렇게 작성할 경우 인스턴스 변수 안의 데이터를 활용을 못한 것
//        System.out.printf("나이 : %d\n", 22);
//        System.out.printf("이름 : %s\b", true);

//        //int age = 22; // 중괄호로 감싸져 있기 때문에 영역이 달라서 상관없다.
//        int age = this.age; //필드에 있는 값을 this를 거쳐 인스턴스 변수의 값에 접근함.
//        String name = this.name;    //이렇게 하면 변수에 한번 저장하는 것이고 일회성이라
//        boolean isMarried = this.isMarried;
//        System.out.printf("이름 : %s \n", name);     //이렇게 작성할 경우 인스턴스 변수 안의 데이터를 활용을 못한 것
//        System.out.printf("나이 : %d\n", age);
//        System.out.printf("이름 : %s\b", isMarried);
//    }
//}

//인스턴스 변수 안에 있는 데이터들을 메소드 안쪽에서 활용을 해야한다.
//인스턴스 변수 안에 있는
