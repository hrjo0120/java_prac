package prac_0620;

public class prac_0620_4 {
    public static void main(String[] args) {
//        System.out.println((int) '가');
//        System.out.println((int) '힣');
//
//        System.out.println(isHanguel('안'));

        //자바에서 헷갈리기 쉬운것
        String s = "하"; // 모든 문장은 객체이며 new String() 가 생략되어있는 것이다. ex) String s = new String("하");
        char c = '하';
        // 위의 두개는 완전히 다른 것이며, String는 사실 객체이다.

        // String은 사실 객체이며 new String() 가 생략되어있는것이라고 위에서 얘기했다.
        // s1과 s2는 서로 다른 객체를 가르켜서 만든 객체이다.
        String s1 = "하";
        s1 += "하";

        String s2 = "하하";

        System.out.println(s1);     //출력: 하하    // 출력은 같을지언정 서로 다른 객체를 사용해서 생성되었기 때문에
        System.out.println(s2);     //출력: 하하    // s1과 s2를 비교하면 다른 것이라고 나온다.

        System.out.println(s1 == s2);       // 출력: false    //주소값끼리 비교. s1과 s2 는 객체이기 때문에 == 를 통해 비교하게 될 경우
                                            // s1의 주소와 s2의 주소를 비교하게 된다. 따라서 비교를 했을때 당연히 false가 나올수 밖에 없다.
        System.out.println(s1.equals(s2));  // 출력: true    //.equals로 비교를 해야 s1의 주소값 안에 저장된 값과 s2의 주소값 안에 저장된 값을 비교하게 된다.

        //일반 값을 비교할때는 == 으로 하지만, 주소값을 비교할때는 .equals 를 사용한다. 외우기 !!




    }

//    static boolean isHanguel(char c) {
//        return c >= '가' && c <= '힣';
//    }

}
