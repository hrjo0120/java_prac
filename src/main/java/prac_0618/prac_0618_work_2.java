package prac_0618;

public class prac_0618_work_2 {
    public static void main(String[] args) {
        //문제2: 사람이 a왼팔 이라는 변수를 가질 수 있게 해주세요.
        사람 a사람 = new 사람();  //리모콘 하나 가지고 타고 타고 가는 것

        a사람.나이 = 20;
        a사람.a왼팔 = new 팔();  //사람 안에 팔 리모콘 연결

        a사람.a왼팔.길이 = 100;
    }
}

class 사람 {
    // 클래스안에 변수를 정의 할 수 있다.
    int 나이;
    팔 a왼팔;
}

class 팔 {
    int 길이;
}
