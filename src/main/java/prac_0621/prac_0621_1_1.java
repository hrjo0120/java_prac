//package prac_0621;
//
//public class prac_0621_1_1 {
//    public static void main(String[] args) {
//        // 57강 문제풀이 - ver2. 배열 사용O
//        // 문제 : 아래가 실행되도록 해주세요.
//        // 문제점: 사람을 한명 더 추가하려면 인덱스가 초과되어 문제가 생긴다.
//        사람인력관리소 a사람인력관리소 = new 사람인력관리소();
//
//        a사람인력관리소.add사람("홍길순", 33);
//        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
//        a사람인력관리소.add사람("홍길동", 20);
//        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
//        a사람인력관리소.add사람("임꺽정", 30);
//        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.
//        a사람인력관리소.add사람("임꺽정22", 40);
//        // 나이가 40살인 4번째 사람(임꺽정22)이 추가되었습니다.
//        a사람인력관리소.add사람("임꺽정33", 50);
//        // 나이가 50살인 5번째 사람(임꺽정33)이 추가되었습니다.
//        // 사람을 한명 더 추가했을 때 문제가 생김.
//        //a사람인력관리소.add사람("임꺽정44", 60);
//        // 나이가 60살인 6번째 사람(임꺽정44)이 추가되었습니다.
//
//        사람 a사람1 = a사람인력관리소.get사람(1);    //get의 리턴타입은 사람 a사람1의 사람이 정함.
//        a사람1.자기소개();
//        // 저는 1번, 홍길순, 33살 입니다.
//
//        사람 a사람2 = a사람인력관리소.get사람(2);    //여기에 a사람2는 get사람의 리모컨을 받음..
//        a사람2.자기소개();
//        // 저는 2번, 홍길동, 20살 입니다.
//
//        사람 a사람3 = a사람인력관리소.get사람(3);
//        a사람3.자기소개();
//        // 저는 3번, 임꺽정, 30살 입니다.
//
//        사람 a사람4 = a사람인력관리소.get사람(4);
//        a사람4.자기소개();
//        // 저는 4번, 임꺽정22, 40살 입니다.
//
//        사람 a사람5 = a사람인력관리소.get사람(5);
//        a사람5.자기소개();
//        // 저는 5번, 임꺽정33, 50살 입니다.
//    }
//}
//
//class 사람인력관리소 {
//    // 전역변수여야 사용번위가 늘어남.
////    사람 a사람0;
////    사람 a사람1;
////    사람 a사람2;
////    사람 a사람3;
////    사람 a사람4;
//    사람 사람들[] = new 사람[5];
//
//
//    int 마지막_사람의_번호 = 0; //기억의 의미, 사람의 속성x
//
//    void add사람(String 이름, int 나이) {
//        //정보를 조립 =/ 저장 , 정보를 조립하는 부분
//        //똑같은 행위를 하는것 같지만, 전부 다 다른 행위를 하고있는것이다.
//        int 번호 = 마지막_사람의_번호 + 1;
//        사람 a사람 = new 사람();
//        a사람.번호 = 번호;
//        a사람.이름 = 이름;
//        a사람.나이 = 나이;
//
//        //정보를 저장하는 부분
//        사람들[번호 - 1] = a사람;
//
////        if (번호 == 1) {
////            a사람0 = a사람;
////        } else if (번호 == 2) {
////            a사람1 = a사람;
////        } else if (번호 == 3) {
////            a사람2 = a사람;
////        } else if (번호 == 4) {
////            a사람2 = a사람;
////        } else if (번호 == 5) {
////            a사람2 = a사람;
////        }
//
//
//
//        System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", 나이, 번호, 이름);
//        마지막_사람의_번호++;   //인스턴스 변수 값을 증가
//    }
//
//    사람 get사람(int 번호) {  //ex)종이, 정보를 저장하는 부분
////        if (번호 == 1) {
////            return a사람0;
////        } else if (번호 == 2) {
////            return a사람1;
////        } else if (번호 == 3) {
////            return a사람2;
////        } else if (번호 == 4) {
////            return a사람3;
////        } else if (번호 == 5) {
////            return a사람4;
////        }
////        return null;
//        return 사람들[번호 - 1];
//    }
//
//
//}
//
//class 사람 {
//    int 번호;
//    String 이름;
//    int 나이;
//
//    void 자기소개() {   //NullPointerException 오류가 발생, get사람이 null 이라서 뜨는 오류
//        System.out.printf("저는 %d번, %s, %d살 입니다.\n", this.번호, this.이름, this.나이);
//
//    }
//}
//
