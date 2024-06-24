package prac_0618;

// 문제 : 고무오리, 고무2오리, 흰오리, 청둥오리 객체를 만들고 날게 해주세요. 단 고무오리 계열은 날 수 없습니다.
// 조건 : 메서드는 중복될 수 없습니다.

public class prac_0618_1 {
    public static void main(String[] args) {

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();

        청둥오리 a청둥오리  = new 청둥오리();
        a청둥오리.날다();

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();

        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();
    }
}

//class 오리 {
//    void 날다() {
//        System.out.println("오리가 날개로 날아갑니다.");
//    }
//}
//
//class 흰오리 extends 오리 {
//}
//
//class 청둥오리 extends 오리 {
//}
//
//class 고무오리 extends 오리 {
//    void 날다() {
//        System.out.println("저는 날 수 없어요.");
//    }
//}
//
//class 고무2오리 extends 오리 {
//    void 날다() {     //해결해야함
//        System.out.println("저는 날 수 없어요.");
//    }
//}
//
//class 로봇오리 extends 오리 {
//
//}



