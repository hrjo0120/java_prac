//0603

package org.example;

public class prac_0603 {
    public static void main(String[] args) {
//        //*필기*
//        int a0 = 1;
//        int a1 = 2;
//        int a2 = 3;
//        // ...
//        int a99 = 100;
//        //  int sim = a1 + a2 + ... + a99; // 다 더할래
//
//        int[] arr = new int[100];
//        for (int i = 0; i <= 99; i++) {
//            arr[i] = i + 1;
//        }
//        int sum2 = 0;
//        for (int i = 0; i <= 99; i++) {
//            sum2 += arr[i]; //다 더할래
//        }
//
//        System.out.println("sum : " + sum2);
//
//
//        //*문제*
//        1. arr1 변수에 [true, false, true] 연결
//        2. arr2 변수에 [3.14. 7.77, 11.11] 연결
//        3. arr3 변수에 [1~10] 연결
//         - 객체 안에 데이터 넣기
//         - 해당 객체가 가지고 있는 데이터 전부 출력
//         - 3번은 반복문 사용
//         - 자바 기본타입

//        //강사님 풀이
//        boolean[] arr1 = new boolean[10];
//        arr1[0] = true;
//        arr1[1] = false;
//        arr1[2] = true;
//
//        System.out.println(arr1.length);
//        System.out.println(arr1[0]);
//        System.out.println(arr1[1]);
//        System.out.println(arr1[2]);

//        arr1 = new boolean[4];  //리모컨이 있는데 덮어쓰기 하려고하는 것
//        System.out.println(arr1.length);    //출력 시 배열의 길이가 나옴.
//        System.out.println(arr1);           //출력 시 리모콘(주소값)이 나옴.
//        System.out.println(arr1[0]);  //false
//        System.out.println(arr1[1]);  //false
//        System.out.println(arr1[2]);  //false

//        double[] arr2 = new double[3];
//
//
//        int[] arr3 = new int[233];
//        //i를 여러번 사용할 수 있는 이유: for 문의 재료로 사용되기 때문에, for문 안에서 생성되어 for 문이 끝나면 삭제되기 때문에
//        // 이 예제에서 봐야할 부분: 내가 손대는 부분 줄이기 ex) 배열 사이즈 arr3.length로 선언하기
//        for (int i = 0; i < arr3.length; i++) {
//            arr3[i] = i + 1;
//            System.out.println(arr3[i]);
//        }

//        //내 풀이
//        boolean[] arr1 = new boolean[]{true, false, true};
//        double[] arr2 = new double[]{3.14, 7.77, 11.11};
//        int[] arr3 = new int[10];

//        int i = 0;
//        for (i = 0; i < 10; i++) {
//            arr3[i] = i + 1;
//        }
//
//        for(i=0; i<3; i++){
//            System.out.println("arr1 : " + arr1[i]);
//        }
//
//        for(i=0; i<3; i++){
//            System.out.println("arr2 : " + arr2[i]);
//        }
//
//        for(i=0; i<10; i++){
//            System.out.println("arr3 : " + arr3[i]);
//        }

        //*필기*
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;

        int[][] arr2 = new int[2][3];
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;
        arr2[1][0] = 4;
        arr2[1][1] = 5;
        arr2[1][2] = 6;

    }

}
