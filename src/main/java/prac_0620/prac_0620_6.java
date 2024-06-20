package prac_0620;

public class prac_0620_6 {
    public static void main(String[] args) {
        사람1 a사람1 = new 사람1("김철수", 22);
        사람1 a사람2 = new 사람1("홍길동", 23);

        System.out.println(a사람1);

        System.out.println(a사람2);

    }
}

class 사람1 extends Object {  //최상위 클래스인 Object 를 상속받으면 Object가 가진 모든 기능을 사용할 수 있다.
    String name;
    int age;

    @Override   // at sign // 어노테이션 //알림용,주석 - 안써도 상관 없다.
    public String toString() {      // toString 메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
                                    // 마우스 우클릭 - Generate - toString() 에서 자동으로 만들 수 있다.
        return "사람1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //객체가 문장형으로 취급되어야 할 때 자바에서 알아서 표출을 해준다.

    사람1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}



