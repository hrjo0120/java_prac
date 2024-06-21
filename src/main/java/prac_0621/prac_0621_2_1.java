package prac_0621;

import java.util.Scanner;

// Scanner 연습 - 문자열 쪼개기(split),
public class prac_0621_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String input = sc.nextLine().split(" ");    // split로 쪼갤경우 복수개가 돼서 배열로 만들어줘야한다.
        String[] input = sc.nextLine().split(" ");
        // 스프링 배열로 만들어주어야한다. why? 문자열을 쪼갤경우 복수개가 되기 때문에.
        // 문자열이 나누어 지는 기준은 split() 안에 쓴 것을 기준으로 나누어 지게 된다.(" " => 공백, "," => , 을 기준으로 나누어짐)


        //System.out.println(input);  //이렇게 출력하게 되면 주소값을 출력한다. 따라서 인덱스로 출력해줘야함.
        System.out.println("형변환 전");
        System.out.println(input[0]);   //1
        System.out.println(input[1]);   //2
        //System.out.println(input[2]);

        System.out.println(input[0]+input[1]);  //12
        //만약에 숫자 1 2 를 입력했을 경우, 연산이 되지 않고 12 로 출력된다.
        // why? 단순히 문자열을 붙였기 때문이다. 정수 연산을 하려면 형변환을 해주어야한다.

        System.out.println("형변환 후");
        int n1 = Integer.parseInt(input[0]);    //문장을 숫자로 바꿔주는 코드
        int n2 = Integer.parseInt(input[1]);

        System.out.println(input[0]);   //1
        System.out.println(input[1]);   //2
        System.out.println(n1 + n2);    //3


        sc.close();
    }
}
