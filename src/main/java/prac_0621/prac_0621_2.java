package prac_0621;

import java.util.InputMismatchException;
import java.util.Scanner;

//Scanner 연습 - 숫자 하나 입력받기 => 숫자가 잘못 입력되었을 경우 다시 입력받기
public class prac_0621_2 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);    //System.in을 받는 생성자가 있는 것.

//        System.out.printf("숫자 : "); //숫자 외에 다른 것을 입력했을 때 InputMismatchException가 뜬다. why? 정수만 입력받을 수 있는데 다른것을 입력해서.

//        int a = sc.nextInt();   //대기, 숫자를 입력할 때까지
        // 멈추고싶지 않고, 숫자를 똑바로 입력할 때까지 하고싶을땐 어떻게 할까? try를 활용해야한다.

        int a = 0;

        while (true) {  // true가 될때까지 무한반복.
            System.out.printf("숫자 : "); //입력을 원할때마다 보여줘야하기 때문에 while문 안에 써야한다.

            try {
                a = sc.nextInt();
                sc.nextLine();  //외워야함! 현재의 사용 목적은 버퍼를 비운다는 뜻. => 여기서 한번
                                //이 부분에선 없어도 문제가 되진 않는다. 다만 다음 입력을 받기 위해 비워주는 것이 좋다.
                break;
            } catch (InputMismatchException e) {    // InputMismatchException이 발견됐을때 처리해주는 구간., 정수를 입력한 것이 아니면 문제가 발생한다.
                sc.nextLine();  //외워야함! 현재의 사용 목적은 버퍼를 비운다는 뜻. => 여기서 한번 해주어야한다. 총 2번.
                                // 입력받은 잘못된 값을 계속해서 가지고 있기 때문에 비워줘야 한다.
                                // 이 부분에서 비워주지 않으면 무한반복한다.
                System.out.println("숫자를 똑바로 입력해");

            }
        }

//        try {
//            //int a = sc.nextInt();   // 변수를 선언하면서 값을 입력받는 코드를 여기다 사용하게 될 경우, System.out.printf("입력된 숫자: %d" , a);코드에서 a 변수를 찾지 못하게 된다.
//                                      // 따라서 try구문 밖에서 변수를 선언해줘야함.
//            a = sc.nextInt();
//        } catch (InputMismatchException e) {    // InputMismatchException이 발견됐을때 처리해주는 구간.
//            System.out.println("숫자를 똑바로 입력해");  //그럼 다시 쓰려면 어떻게 해야할까 ? continue를 사용한다.
//                                                         // 근데 continue는 반복문에서만 사용이 가능하다. 따라서 반복문을 만들어주면 된다.
//        }


        System.out.printf("입력된 숫자: %d" , a);

        sc.close();
    }
}

