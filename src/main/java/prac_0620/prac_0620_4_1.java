package prac_0620;

public class prac_0620_4_1 {
    public static void main(String[] args) {
        Person p1 = new Person(13);
        Person p2 = new Person(13);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("p1 == p2 : " + (p1 == p2));         //false : 리모콘끼리 비교, 객체의 주소값 비교이기 때문에 당연히 false
        System.out.println("p1.equals(p2) : " + p1.equals(p2)); //false : 객체끼리 비교, 하지만 여기서는 Person클래스에 equals 메서드를 오버라이드 하지 않아서 false
        // 즉 객체 비교를 하려면 해당 클래스에 equals 메서드를 오버라이드 해야한다.

        String s1 = "하하";   // 문장 객체 생성됨
        String s2 = "하하";   // 여기서는 기존의 객체의 리모콘만 리턴, why? 메모리 절약하려고

        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);

        System.out.println("s1 == s2 : " + (s1 == s2));         //true: 메모리를 절약하기위해 같은 공간을 재활용해서 true로 뜬다.
        System.out.println("s1.equals(s2) : " + s1.equals(s2)); //true

        //String 끼리 겹치면 같은 공간을 재활용한다.

        String s3 = new String("하하"); // 재활용 x
        String s4 = new String("하하"); // 재활용 x

        System.out.println("s3 : " + s3);   //하하
        System.out.println("s4 : " + s4);   //하하

        System.out.println("s3 == s4 : " + (s3 == s4));         //false, 서로 다른 객체의 주소값 비교이기 때문에 false이다.
        System.out.println("s3.equals(s4) : " + s3.equals(s4)); //true


    }
}

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}
