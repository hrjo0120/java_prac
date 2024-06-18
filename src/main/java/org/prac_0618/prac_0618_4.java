package org.prac_0618;

public class prac_0618_4 {
    public static void main(String[] args) {
//        문제1 - 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.
//        System.out.println("문제1");
//        전사 a전사 = new 전사();
//
//        a전사.공격("브라이언", "칼");
//        // 브라이언이(가) 칼(으)로 공격합니다.
//
//        a전사.공격("필립", "창");
//        // 필립이(가) 창(으)로 공격합니다.
//
//        a전사.공격("마크", "지팡이");
//        // 마크(가) 지팡이(으)로 공격합니다.

//        문제2 - 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요, 마지막 공격방식을 기억
        System.out.println("문제2");
        전사 a전사 = new 전사();

        a전사.공격("브라이언", "칼");
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.재공격();
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.공격("필립", "창");
        // 필립이(가) 창(으)로 공격합니다.

        a전사.공격("마크", "지팡이");
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.
    }
}

class 전사 {
    // 인스턴스 변수가 만들어지는 위치
    String lastname;
    String lastWeapon;

    void 공격 (String name, String weapon) {
        System.out.println(name + "이(가) " + weapon + "(으)로 공격합니다.");
        this.lastname = name;   //
        this.lastWeapon = weapon;
    }

    void 재공격() {    // 마지막 공격방식을 기억
        System.out.println(this.lastname + "이(가) " + this.lastWeapon + "(으)로 공격합니다.");
    }


}
