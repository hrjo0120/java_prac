package prac_0620;

public class prac_0620_2 {
    public static void main(String[] args) {
        사람 a사람 = new 사람();

        a사람.setId(20);
//        a사람.id = 20;
//        System.out.println("번호: " + a사람.id);
        System.out.println("번호: " + a사람.getId());   //이렇게 하게되면 id가 private이더라도 외부에서 값에 접근할 수 있게 된다.
        System.out.println("나이: " + a사람.getAge());
    }
}

class 사람 {
    // 기본적으로 생성하면 public이다. (아무것도 없으면 public이 생략된 것), private를 유지하는게 낫다.
    // 접근제한자를 private으로 지정하면 내부에서는 접근이 가능하고, 외부에서는 접근이 불가능하다.
    // 클래스의 외부에서는 접근이 불가능하지만 void hi()에서의 id 접근은 가능하다. why? 같은공간에 있어서.
    // class 의 변수는 private로 설정하는 것이 관례이다.
    // 외부에서 값을 접근할수가 없어서 값을 넣울수도 뺼수도 없었다.
    private int id;
    private int age = 20;

    //Getter/Setter가 없을 경우, (마우스우클릭-Generate-Getter and Setter)로 자동으로 만들 수 있다.
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //Getter :
    public int getId() {    // 값을 꺼내서 돌려주변 되는것
        return this.id;
    }

    //Setter :
    public void setId(int id) {     //인자로 이 값을 셋팅해주는 메소드
        //System.out.println(id); //
        this.id = id;
    }

}




