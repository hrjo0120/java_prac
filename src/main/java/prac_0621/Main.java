package prac_0621;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // * 찍기 예제
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {   //전체 횟수를 반복
//            for (int j = 1; j <= i; j++) {   // * 찍는 갯수를 반복
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 오른쪽에 * 찍기 예제 (미완)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {   //전체 횟수를 반복
            for (int j = 1; j <= i; j++) {   // * 찍는 갯수를 반복
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


