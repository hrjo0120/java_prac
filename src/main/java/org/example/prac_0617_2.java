package org.example;


//문제 풀이
public class prac_0617_2 {
    public static void main(String[] args) {

        // 문제 : 1부터 n까지 소수의 갯수를  출력하는 함수를 만들어주세요.
        // 2,3,5,7,11,13,17,19 - true

//        boolean rs = Math.isPrimeNumber(1);
//        System.out.println("1은(는) 소수인가? : " + rs);
//        // false
//        rs = Math.isPrimeNumber(2);
//        System.out.println("2은(는) 소수인가? : " + rs);
//        // true
//        rs = Math.isPrimeNumber(4);
//        System.out.println("4은(는) 소수인가? : " + rs);
//        // false
//        rs = Math.isPrimeNumber(5);
//        System.out.println("5은(는) 소수인가? : " + rs);
//        // true
//        rs = Math.isPrimeNumber(121);
//        System.out.println("121은(는) 소수인가? : " + rs);
//        // false

// 문제 : 1부터 n까지 소수의 갯수를  출력하는 함수를 만들어주세요.
        // 2,3,5,7,11,13,17,19 - true
        // ex) 5까지라고 하면 2,3,5, 총 3개가 나와야함.
        // 약수를 찾고 그 약수의 갯수를 카운트.
        int rs = Math.one_to_n_prime_numbers_count(10);
        System.out.println("rs : " + rs);
        // rs : 4
        rs = Math.one_to_n_prime_numbers_count(13);
        System.out.println("rs : " + rs);
        // rs : 6

    }

}

class Math {
    static int one_to_n_prime_numbers_count(int n) {

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrimeNumber(i)) {
                count++;
            }
        }
        return count;

        // 약수 찾기
//        if (n <= 1) {
//            return false;
//        }
//        int count = 0;
//
//        for (int i = 1; i <= n; i++) {  //약수 카운트할때 1과 n도 세야하기때문에  범위를 포함해준다. 소수는 자기 자신과 n만 약수이기 때문에. 전부 다 해봐야하기 때문에 비효율적
//            if (n % i == 0) {
//                count++;
//            }
//        }
//        return count == 2;
    }

    static boolean isPrimeNumber(int n) {

        // 121일 경우엔 true로 뜨기때문에 수정해야함
//        if (n == 1) {
//            return false;
//        } else if (n == 2) {
//            return true;
//        } else if (n >= 3 && a % 2 == 0) {   //3 이상이고 a를 2로 나누었을때 나머지가 0 이면 소수가 아님
//            return false;
//        } else if (n >= 3 && a % 3 == 0) {   //3 이상이고 a를 3으로 나누었을때 나머지가 0 이면 소수가 아님
//            return false;
//        }
//        return true;

        // 코드 줄이기
        // 방법 1: 약수 더 찾기
        // 1과 n말고 그 사이의 값중에 나누어 지는 것이 있는지 알아봐야하기 때문에 범위를 2와 n을 포함하지 않게 정한다.
        if (n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
//
//        // 방법 2: 어떤 수의 약수의 개수가 2개일때 소수라고 함.
//        if (n <= 1) {
//            return false;
//        }
//        int count = 0;
//
//        for (int i = 1; i <= n; i++) {  //약수 카운트할때 1과 n도 세야하기때문에  범위를 포함해준다. 소수는 자기 자신과 n만 약수이기 때문에. 전부 다 해봐야하기 때문에 비효율적
//            if (n % i == 0) {
//                count++;
//            }
//        }
//        if(count == 2) {
//            return true;
//        }
//        else {
//            return false;
//        }

//        //위의  축약버전
//        return count == 2;
//
//        //방법 3: 소수의 특징: 약수를 모두 더했을때 자기자신 + 1이다. 전부 다 해봐야하기 때문에 비효율적
//        if (n <= 1) {
//            return false;
//        }
//        int sum = 0;
//
//        for (int i = 1; i <= n; i++) {  //약수 카운트할때 1과 n도 세야하기때문에  범위를 포함해준다. 소수는 자기 자신과 n만 약수이기 때문에.
//            if (n % i == 0) {
//                sum += i;
//            }
//        }
//        return sum == n + 1;


    }
}



