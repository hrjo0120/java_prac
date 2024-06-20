package prac_0620;

import java.util.ArrayList;
import java.util.List;

public class prac_0620_1 {
    public static void main(String[] args) {
        // 할당된 메모리 안에 들어있는 배열만 출력하고싶은 상황
        v2();
    }
    // 개선3 - 실사용방법
    static void v4() {

        System.out.println("==v4==");
        //실제로 사용하는 방법
        List<Article> articles = new ArrayList<>();

        articles.add(new Article());    //0
        articles.add(new Article());    //1
        articles.add(new Article());    //2
        articles.add(new Article());    //3

        for (int i=0; i<articles.size(); i++) {
            Article article = articles.get(i);
            System.out.println(article.id);
        }
    }

    // 개선2 - 제네릭 <>
    static void v3() {
        //저장소를 만들 때 Article 타입만 넣겠다고 설정해준 것 : 제네릭, 제네릭을 설정해서 다른 타입의 요소가 들어오는 것을 막는다.
        System.out.println("==v3==");
        ArrayList<Article> articles = new ArrayList<>();

        articles.add(new Article());    //0
        articles.add(new Article());    //1
        articles.add(new Article());    //2
        articles.add(new Article());    //3

        for (int i=0; i<articles.size(); i++) {
            Article article = articles.get(i);  //선언할 때부터 Article 이라고 작성해두었음으로 캐스팅할 필요가 없다.
            System.out.println(article.id);
        }
    }

    // 개선 후 - ArrayList
    static void v2() {
        System.out.println("==v2==");
        ArrayList articles = new ArrayList();   //저장소 만들기, 배열의 정적할당방식을 개선한 동적할당방식(ArrayList)

        //articles[0] = new Article();  //이 한 줄이 밑의 코드로 바뀐것이다.
        //articles.add(new Article());
        //ArrayList타입:??

        articles.add(new Article());    //0
        articles.add(new Article());    //1
        articles.add(new Article());    //2
        articles.add(new Article());    //3

        // 컨트롤+마우스클릭 해서 타고들어가서 공부할때 참고하기.
        for (int i=0; i<articles.size(); i++) {     //size()는 ArrayList 객체의 요소의 갯수를 반환해주는 함수.(int타입 리턴)
            Article article = (Article) articles.get(i);  // ArrayList articles = new ArrayList();를 했을 때, Article만 넣는다고 한 적이 없기 때문에 오류가 생긴다.
            // 따라서 당장 get해서 가져오는 것이 Article이 아닐수도 있으므로 (Article)를 사용하여 캐스팅을 해준다.
            System.out.println(article.id);
        }
    }

        // 개선 전  - 배열
        static void v1() {
            // 할당된 메모리 안에 들어있는 배열만 출력하고싶은 상황
            System.out.println("==v1==");
            Article[] articles = new Article[100];      //유한적임. 이걸 무한적이게 만들어 줄것(ArrayList)

//        Article article1 = new Article();
//        articles[0] = article1;
//        //상단의 코드를 하단의 코드로 작성할 수 있음
//        articles[0] = new Article();

            int articlesSize = 0;

            articles[0] = new Article();
            articlesSize++;
            articles[1] = new Article();
            articlesSize++;
            articles[2] = new Article();
            articlesSize++;
            articles[3] = new Article();

            for(int i=0; i<articlesSize; i++) {
                System.out.println(articles[i].id);
            }
        }

        //이 경우엔 articles.length의 크기가 100이기 때문에 반복문에 articles.length를 사용하게 되면 100개를 출력하게된다.
        // 따라서 할당된 메모리 안에 들어있는 배열만 출력하고 싶은것과 맞지 않는다.
/*        for(int i=0; i<articles.length; i++) {
            System.out.println(articles[i].id);
        }
 */

}

class Article {
    static int lastId;

    int id;
    String regDate;

    static {
        lastId = 0;
    }

    // 생성자1
    Article() {
        this(lastId + 1, "2024-12-12 12:12:12");
        lastId++;
    }

    //생성자2
    Article(int id, String regDate) {
        this.id = id;
        this.regDate = regDate;
    }

}
