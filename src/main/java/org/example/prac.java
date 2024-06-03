//0531

package org.example;

// 배열 안의 값의 총 합, 평균 출력
public class prac {
    public static void main(String[] args) {

        int a = 10;     //오직 정수만 들어갈 수 있는 변수  a에 10이라는 값을 넣겠다.

        //int[] arr = new int[5]; //new 설계도;
        // '정수들'(int[])모양으로 만들어진 객체의 리모컨만 들어갈 수 있는 arr라는 변수를 만들자 마자
        // arr라는 변수에 int[4] 모양으로 객체를 만든 뒤 리모컨을 넣겠다.

        int [] arr;
        arr = new int[4];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println(arr.length);     //arr.length(배열의 길이)를 사용하게 되면 배열의 길이가 길어질 때 마다 숫자 변경을 안해도 된다.

        //int sum  = arr[0] + arr[1] + arr[2];
        //int avg = sum / arr.length;

        // for문을 활용할 경우
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int avg = sum / arr.length;
        //

        System.out.println("총합 : " + sum);
        System.out.printf("총합 : %d\n", sum);

        System.out.println("평균 : " + avg);
        System.out.printf("평균 : %d\n", avg);

//        for (int i = 0; i <= 2; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);

        System.out.println("Hello");


    }
}

// 코드업 문제 - Replit로 실행시켰기 때문에 클래스 네임 안맞을 수 있음.
//import java.util.Scanner;

// // 기초1. 출력문
// // 1001
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello");
//     }
// }

// //1002
// public class Main {
//   public static void main(String[] args) {
//      System.out.println("Hello World");
//   }
// }

// //1003
// public class Main {
//   public static void main(String[] args) {
//      System.out.println("Hello\nWorld");
//   }
// }

// //1004
// public class Main {
//   public static void main(String[] args) {
//      System.out.println("'Hello'");
//   }
// }

// //1005
// public class Main {
//   public static void main(String[] args) {
//      System.out.println("\"Hello World\"");
//   }
// }

// //1006
// public class Main {
//   public static void main(String[] args) {
//      System.out.println("\"!@#$%^&*()\"");
//   }
// }

//1007
// public class Main {
//   public static void main(String[] args) {
//      System.out.println("\"C:\\Download\\hello.cpp\"");
//   }
// }

//1101
// public class Main {
//   public static void main(String[] args) {
//     System.out.println("Hello, World!");
//   }
// }

//1102
// public class Main {
//   public static void main(String[] args) {
//     System.out.println("Hello,\nWorld!");
//   }
// }

//1103
// public class Main {
//   public static void main(String[] args) {
//     System.out.println("\"c:\\test\"");
//   }
// }

//1106 - 미해결
// public class Main {
//   public static void main(String[] args) {

//     System.out.println("\"c:\\test\"");

//   }
// }

// 1731
// public class Main {
//   public static void main(String[] args) {
//     System.out.println("special characters");
//     System.out.println("[\\n,\\\",\\\\] is very important.");
//   }
// }

// // 기초2. 입출력문 및 연산자
//1010
// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     System.out.println(n);
//   }
// }

//1011- scanner은 String타입으로만 입력을 받기 때문에 char타입을 입력받을 수 없다. 따라서 charAt()를 사용하여 첫번째 문자를 꺼내오면 된다.
// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     char n = sc.next().charAt(0);
//     System.out.println(n);
//   }
// }

//1012
// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     float f = sc.nextFloat();
//     System.out.printf("%.6f", f);
//   }
// }

//1013
// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     System.out.printf("%d %d" , a, b);
//   }
// }

//1014
// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     char a = sc.next().charAt(0);
//     char b = sc.next().charAt(0);

//     System.out.printf("%c %c" , b, a);
//   }
// }

//1015
// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     float a = sc.nextFloat();

//     System.out.printf("%.2f" , a);
//   }
// }

//1017
// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();

//     System.out.printf("%d %d %d" , a, a, a);
//   }
// }

//1018 - 시간 입력받아 그대로 출력하기
// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     String[] time = sc.nextLine().split(":");

//     int hour = Integer.parseInt(time[0]);
//     int minute = Integer.parseInt(time[1]);

//     System.out.printf("%d:%d", hour, minute);

//     // for(int i=0; i<time.length; i++) {
//     // }
//     //   System.out.println(time[0] + ":" +time[1]);

//   }
// }

//1019 - 연월일 입력받아 그대로 출력하기
// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     String[] birth = sc.nextLine().split("\\.");

//     int year = Integer.parseInt(birth[0]);
//     int month = Integer.parseInt(birth[1]);
//     int date = Integer.parseInt(birth[2]);

//      System.out.printf("%04d.%02d.%02d" , year, month, date);
//   }
// }

// 1020 - 주민번호 입력받아 형태바꿔 출력하기
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String[] number = sc.nextLine().split("-"); // -를 기준으로 나눠서 배열에 저장
//        String front_number = number[0];
//        String back_number = number[1];
//
//        System.out.printf("%s%s", front_number, back_number);
//    }
//}

// 1021 - 단어 1개 입력받아 그대로 출력하기



