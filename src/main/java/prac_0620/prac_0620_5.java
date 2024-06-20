package prac_0620;

public class prac_0620_5 {
    public static void main(String[] args) {
        String s = "*";
        String k = "*";

        //String 불변성
        s += "*";   //**
        s += "*";   //***
        s += "*";   //****
        s += "*";   //*****     별 5개를 출력하기 위해 하나씩 더하기 때문에 쓸데없는 메모리를 사용하게 된다.

        System.out.println(s);


        // StringBuilder
        StringBuilder sb = new StringBuilder(); //기본 생성자

        sb.append("*");     //문자열을 추가하는 메소드
        sb.append("*");
        sb.append("*");
        sb.append("*");

        System.out.println(sb); //****

    }
}
