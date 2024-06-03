//0603
//오전
package org.example;

public class prac_0603 {
    public static void main(String[] args) {
//        //오전
//        *필기*
//        int a0 = 1;
//        int a1 = 2;
//        int a2 = 3;
//        // ...
//        int a99 = 100;
//        //  int sim = a1 + a2 + ... + a99; // 다 더할래
//
//        int[] arr = new int[100];
//        for (int i = 0; i <= 99; i++) {
//            arr[i] = i + 1;
//        }
//        int sum2 = 0;
//        for (int i = 0; i <= 99; i++) {
//            sum2 += arr[i]; //다 더할래
//        }
//
//        System.out.println("sum : " + sum2);
//
//
//        //*문제*
//        1. arr1 변수에 [true, false, true] 연결
//        2. arr2 변수에 [3.14. 7.77, 11.11] 연결
//        3. arr3 변수에 [1~10] 연결
//         - 객체 안에 데이터 넣기
//         - 해당 객체가 가지고 있는 데이터 전부 출력
//         - 3번은 반복문 사용
//         - 자바 기본타입

//        //강사님 풀이
//        boolean[] arr1 = new boolean[10];
//        arr1[0] = true;
//        arr1[1] = false;
//        arr1[2] = true;
//
//        System.out.println(arr1.length);
//        System.out.println(arr1[0]);
//        System.out.println(arr1[1]);
//        System.out.println(arr1[2]);

//        arr1 = new boolean[4];  //리모컨이 있는데 덮어쓰기 하려고하는 것
//        System.out.println(arr1.length);    //출력 시 배열의 길이가 나옴.
//        System.out.println(arr1);           //출력 시 리모콘(주소값)이 나옴.
//        System.out.println(arr1[0]);  //false
//        System.out.println(arr1[1]);  //false
//        System.out.println(arr1[2]);  //false

//        double[] arr2 = new double[3];
//
//
//        int[] arr3 = new int[233];
//        //i를 여러번 사용할 수 있는 이유: for 문의 재료로 사용되기 때문에, for문 안에서 생성되어 for 문이 끝나면 삭제되기 때문에
//        // 이 예제에서 봐야할 부분: 내가 손대는 부분 줄이기 ex) 배열 사이즈 arr3.length로 선언하기
//        for (int i = 0; i < arr3.length; i++) {
//            arr3[i] = i + 1;
//            System.out.println(arr3[i]);
//        }

//        //내 풀이
//        boolean[] arr1 = new boolean[]{true, false, true};
//        double[] arr2 = new double[]{3.14, 7.77, 11.11};
//        int[] arr3 = new int[10];

//        int i = 0;
//        for (i = 0; i < 10; i++) {
//            arr3[i] = i + 1;
//        }
//
//        for(i=0; i<3; i++){
//            System.out.println("arr1 : " + arr1[i]);
//        }
//
//        for(i=0; i<3; i++){
//            System.out.println("arr2 : " + arr2[i]);
//        }
//
//        for(i=0; i<10; i++){
//            System.out.println("arr3 : " + arr3[i]);
//        }

//        //*필기*
//        int[] arr = new int[6];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;
//        arr[5] = 6;
//
//        int[][] arr2 = new int[2][3];
//        arr2[0][0] = 1;
//        arr2[0][1] = 2;
//        arr2[0][2] = 3;
//        arr2[1][0] = 4;
//        arr2[1][1] = 5;
//        arr2[1][2] = 6;

        //오후
        //*필기*

//        // 사람1 -> 학생
//        int person1_num = 1;     //사람 1의 학번, 변수명 num1_0 -> person1_num 으로 변경
//        int person1_age = 12;    //사람 1의 나이
//        int person1_height = 170;   // 사람 1의 키
//
//        // 사람2 -> 학생
//        int person2_num = 2;
//        int person2_age = 15;
//        int person2_height = 175;
//
//        // 객체 도입 : 단수의 묶음(복수)
//        int[] person1 = new int[3]; //person1 변수에는 이런 모양의 객체랑 연결이 될거야..
//        person1[0] = 1;     //변수명에서 보이던 이름(num, age, height)이 객체로 묶이면서 사라지게 되어 불편함을 느낌.
//        person1[1] = 12;
//        person1[2] = 170;
//
//        int[] person2 = new int[3]; //person1 변수에는 이런 모양의 객체랑 연결이 될거야..
//        person2[0] = 1;     //
//        person2[1] = 12;
//        person2[2] = 170;
//
//        // 사람1(김철수, 22, 170.2, 60, 010~~, 결혼여부)
//        //int[] person1 = new int[3]; 의 모양으로는 상단에 쓰인 정보를 담을 수 없다.
//        //문제점: 다양한 타입을 담을 수 없고, 데이터의 의미를 알수 없다.
//        int[] aa = new int[3];
//        aa[0] = 12;
//        aa[1] = 13;
//        aa[2] = 14;
//
//        IntArr3 bb = new IntArr3();
//        bb.철수의_나이 = 12;
//        bb.영수의_나이 = 13;
//
//        철수 a = new 철수();
//        a.이름 = "김철수";   //클래스에 아무것도 없을 경우, 없는 공간에다가 값을 넣고 있는 것
//        a.나이 = 23;
//        a.키 = 163.5;


//        // 다양한 타입으로 구성되어 있는 myObject 객체를 만들고, 임의의 값(데이터)를 넣은 후
//        //  객체 내부의 데이터(인스턴스 변수)의 값들을 전부 출력하기
//        myObject mo = new myObject();       //
//        mo.char1 = 'A';
//        mo.int1 = 13;
//        mo.double1 = 15.1;
//        mo.boolean1 = true;
//
//        new myObject().int1 = 10;
//        System.out.println(new myObject().int1);  //이 부분에서 new 키워드로 객체가 또 새로 생성되었기 때문에 0으로 뜬다.

//        System.out.println(mo.char1);
//        System.out.println(mo.int1);
//        System.out.println(mo.double1);
//        System.out.println(mo.boolean1);
//
//        // 24강. 클래스 관련 문제
//        // 문제2 : 자동차 객체를 담을 변수를 만들어주세요.
//        car car1; //변수 생성
//
//        // 문제3 : 자동차 객체를 만들고 변수에 담아주세요.
//        car car1 = new car(); //객체 생성
//
//        // 문제4 : 자동차 객체마다 서로 다른 최고속력를 가지도록 해주세요.
//        car car1 = new car();
//        car car2 = new car();
//
//        car1.max_speed = 150;
//        car2.max_speed = 140;
//        System.out.println("car1의 최고속력 : " + car1.max_speed + "km/h");
//        System.out.println("car2의 최고속력 : " + car2.max_speed + "km/h");
//
//        // 문제5 : 1개의 자동차가 3번 달리게 해주세요.
//        car car1 = new car(); //객체 생성
//        car1.run();
//        car1.run();
//        car1.run();
//
//        // 문제6 - 객체를 사용하지 않고 두번째 플레이어를 만들어주세요.
//        player player1 = new player();
//        player1.name = "홍길동";
//
//        String player2 = "홍길순";
//
//        System.out.println(player1.name);
//        System.out.println(player2);
//
//        // 문제7 : 3개의 자동차가 각각 1번씩 달리게 해주세요.
//        car car1 = new car();
//        car car2 = new car();
//        car car3 = new car();
//
//        car1.run();
//        car2.run();
//        car3.run();
//
//        // 문제8 : 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.
//        // 구현시작
//        car car1 = new car();
//        car car2 = new car();
//
//        car1.max_speed = 230;
//        car2.max_speed = 210;
//        // 구현끝
//
//        car1.run();
//        // 출력 => 자동차가 최고속력 230km로 달립니다.
//
//        car2.run();
//        // 출력 => 자동차가 최고속력 210km로 달립니다.
//
//        // 문제9 : 번호가 다른 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.
//        // 구현시작
//        car car1 = new car();
//        car car2 = new car();
//
//        car1.car_num = 1;
//        car1.max_speed = 230;
//
//        car2.car_num = 2;
//        car2.max_speed = 210;
//        // 구현끝
//
//        car1.run();
//        // 출력 => 1번 자동차가 최고속력 230km로 달립니다.
//
//        car2.run();
//        // 출력 => 2번 자동차가 최고속력 210km로 달립니다.

//        사람 a = new 사람();
//
//        a.age = 22;
//        a.name = "김철수";
//        a.isMarried = true;
//        a.age = 33;     // 클래스 안에 값이 지정되어 넣어져있어도, 생성하자마자 불러들여 덮어쓰기 되었음으로 33이 출력된다.
//
//
//        System.out.println(a.age);      //22
//        System.out.println(a.name);     //김철수
//        System.out.println(a.isMarried);//true
//
//        //값이 없을 경우엔, 디폴트 값이 출력된다.

//        사람 b = new 사람();
//
//        System.out.println(b.age);      //0
//        System.out.println(b.name);     //null
//        System.out.println(b.isMarried);//false

        사람 a = new 사람();
        a.age = 23;   //빈 공간을 채워넣으려고 만들어 둔것
        a.name = "김철수";
        a.isMarried = true;
        a.introduce(); // 실행하면 끝

    }
}
//class 철수 {      //설계도
//    String 이름;
//    int 나이;
//    double 키;
//}
//
//class IntArr3 {
//    int 철수의_나이;
//    int 영수의_나이;
//}

//class myObject {
//    char char1;
//    int int1;
//    double double1;
//    boolean boolean1;
//}

//class car {
//    int car_num;
//    int max_speed;
//
//    // 문제7 함수
//    // void run() {
//    //   System.out.println("자동차가 달립니다");
//    // }
//
//    // 문제8 함수
//    // void run() {
//    //   System.out.println("자동차가 최고속력 " + max_speed + "km로 달립니다.");
//    // }
//
//    // 문제9 함수
//    // void run() {
//    //   System.out.println(car_num + "번 자동차가 최고속력 " + max_speed + "km로 달립니다.");
//    // }
//}
//
//class player {
//    String name;
//}

class 사람 {
    int age;
    String name;
    boolean isMarried;
    //boolean isMarried = true;     //이렇게 작성할 경우엔 항상 true로 뜬다. //
    // 객체 만들어질때 바로 선언됨

    void introduce() {
        System.out.println("introduce 실행됨");
        System.out.println("안녕, 나는 23살 기혼, 김철수야");
    }


}






