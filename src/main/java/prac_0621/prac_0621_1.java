//package prac_0621;
//
//// 57강 문제풀이 - ver1. 배열 사용X
//// 문제 : 아래가 실행되도록 해주세요.
//// 조건 : 배열을 사용할 수 없습니다.
//// 문제점: 사람이 추가됐을때 전부 다 추가를 해줘야 한다.
//public class prac_0621_1 {
//    public static void main(String[] args) {
//        사람인력관리소 a사람인력관리소 = new 사람인력관리소();
//
//        a사람인력관리소.add사람("홍길순", 33);
//        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
//        a사람인력관리소.add사람("홍길동", 20);
//        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
//        a사람인력관리소.add사람("임꺽정", 30);
//        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.
//
//        사람 a사람1 = a사람인력관리소.get사람(1);    //get의 리턴타입은 사람 a사람1의 사람이 정함.
//        a사람1.자기소개();
//        //저는 1번, 홍길순, 33살 입니다.
//
//        사람 a사람2 = a사람인력관리소.get사람(2);    //여기에 a사람2는 get사람의 리모컨을 받음..
//        a사람2.자기소개();
//        // 저는 2번, 홍길동, 20살 입니다.
//
//        사람 a사람3 = a사람인력관리소.get사람(3);
//        a사람3.자기소개();
//        // 저는 3번, 임꺽정, 30살 입니다.
//    }
//}
//
//class 사람인력관리소 {
//    // 전역변수여야 사용번위가 늘어남.
//
//    사람 a사람0;
//    사람 a사람1;
//    사람 a사람2;
//
//    int lastId = 0; //기억의 의미, 사람의 속성x
//
//    void add사람(String name, int age) {
//        //정보를 조립 =/ 저장 , 정보를 조립하는 부분
//        //똑같은 행위를 하는것 같지만, 전부 다 다른 행위를 하고있는것이다.
//        int number = lastId + 1;
//        사람 a사람 = new 사람();  //사람 객체를 생성, why? 사람 1명을 집어넣어 저장해야하기때문
//        a사람.number = number;  //사람객체의 번호는 lastID를 1증가시킨것을 넣어줌
//        a사람.name = name;        //사람객체의 이름은 인자로 받은 name을 넣어줌
//        a사람.age = age;          //사람객체의 나이는 인자로 받은 age를 넣어줌
//        System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", age, number, name);
//        //this.lastId = a사람.number;   //이 lastId에는 a사람.null을 넣어줌
//        lastId++;
//
//        //정보를 저장하는 부분
//        if (number == 1) {
//            a사람0 = a사람;
//        } else if (number == 2) {
//            a사람1 = a사람;
//        } else if (number == 3) {
//            a사람2 = a사람;
//        }
//    }
//
//    사람 get사람(int number) {  //ex)종이, 정보를 저장하는 부분
//        if (number == 1) {
//            return a사람0;
//        } else if (number == 2) {
//            return a사람1;
//        } else if (number == 3) {
//            return a사람2;
//        } else if (number == 4) {
//            return a사람3;
//        }
//
//        return null;
//    }
//
//}
//
//class 사람 {
//    int number;
//    String name;
//    int age;
//
//    void 자기소개() {   //그대로 실행했을 때, NullPointerException 오류가 발생, get사람이 null 이라서 뜨는 오류
//        System.out.printf("저는 %d번, %s, %d살 입니다.\n", this.number, this.name, this.age);
//
//    }
//}
//
//
