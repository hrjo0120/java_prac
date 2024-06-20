package prac_0619;

public class prac_0619_2 {
    public static void main(String[] args) {
        //참고
        //int arr[] new int[3];

        //내용 숙지 할 것
        int[] arr = new int[10];

        Article[] articles = new Article[10];

        Article article1 = new Article();
        articles[0] = article1;
        System.out.println(article1.id);

        Article article2 = new Article();
        articles[1] = article2;
        // 0620은 여기부터 시작



////        int lastId = 0;
//
//        Article article1 = new Article();       // 생성자 1번 사용
////        lastId++;
////        article1.id = lastId;
//        System.out.println(article1.id);
//
//        Article article2 = new Article();       // 생성자 1번 사용
//        System.out.println(article2.id);
//
//        Article article3 = new Article();       // 생성자 1번 사용
//        System.out.println(article3.id);

//        Article article3 = new Article(3, "2024-12-12 12:12:12");   // 생성자 2번 사용
//        lastId++;
//        article3.id = lastId;       //덮어쓰기됨
//        System.out.println(article3.id);
    }
}

class Article {
    static int lastId;  //공공재, static 변수는 객체마다 존재하는게 아니라, 클래스 내부에 존재한다. 따라서 같은 클래스의 모든 객체가 접근 가능하다.

    int id;
    String regDate;

    static {        //static 변수를 초기화하는 생성자, 프로그램 실행과 동시에 실행된다. 설계도에 존재함
        lastId = 0;
    }

    // 기본 생성자의 형태, 생성자를 작성하지 않았어도 기본적으로 실행됨.
    // 우리는 생성자를 오버라이딩해서 사용하고 있는 것이다. (생성자도 하나의 메소드이기 때문에 메소드 오버라이딩이 가능함)
    // 생성자1
    Article() {
        this(lastId + 1, "2024-12-12 12:12:12");    //생성자 안에서 다른 생성자를 호출하려면 첫줄에서 호출 해야한다.(연쇄 생성자 호출)
        lastId++;       // 생성자가 실행될 때, lastId의 값이 1 증가한다. //연쇄 생성자 호출 시, 자동증가를 하기 위해 1 증가 시켜놓는다. 다음 게시글 작성시 번호가 1 증가해야 하기 때문이다. (객체가 생성될 때마다 자동으로 증가한다)
                        // 이게 없다면 계속 0만 뜬다.
        // this.id = lastId;   //this.id : 객체에 있는 id
    }

    //생성자2
    Article(int id, String regDate) {
        this.id = id;
        this.regDate = regDate;
    }

    //생성자 1, 2는 메소드 오버라이딩 된 것이다.
}
