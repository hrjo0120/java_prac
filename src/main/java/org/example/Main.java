package org.example;

/*
public class Main {
    public static void main(String[] args) {

        // 표준 출력
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");


        //반복문
        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.println("안녕하세요");
        }
    }
}
*/


/*
// 문제: '안녕하세요.'를 10번 출력해주세요.

public class Main {
  public static void main(String[] args) {
    System.out.println("안녕하세요.");
    System.out.println("안녕하세요.");
    System.out.println("안녕하세요.");
    System.out.println("안녕하세요.");
    System.out.println("안녕하세요.");
    System.out.println("안녕하세요.");
    System.out.println("안녕하세요.");
    System.out.println("안녕하세요.");
    System.out.println("안녕하세요.");
    System.out.println("안녕하세요.");
  }
}
*/

/*
// 문제 : `안녕하세요.`를 10번 출력해주세요.
// 조건 : System.out.println은 딱 한번만 사용 가능

public class Main {
  public static void main(String[] args) {
    System.out.println("안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.");
  }
}
*/

/*
// 문제 : `안녕하세요.`를 10번 출력해주세요.
// 조건 : System.out.println은 딱 한번만 사용 가능
// 조건 : \를 활용해서 줄바꿈 해주세요.
// 힌트 : \n 은 줄바꿈을 의미합니다.

public class Main {
  public static void main(String[] args) {
    // `\` <= 백스페이스 좌측 키
    System.out.println("안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.");
  }
}
*/

/*
// 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요.

public class Main { // 메인클래스
    public static void main(String[] args) { // 메인 함수
        // `int a` => a라는 이름의 변수(즉 공간)을 만든다.
        // `int` => a라는 공간에는 정수만 담을 수 있다.
        // `;` => 문장이 끝남을 알린다.
        int a; // 예외, 변수선언
        a = 5;

        System.out.println(a);
        System.out.println(a + 10);

        int b = 10;

        // `+` => 문장과 문자을 합친다.
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // 여기서 부터
        a = 10;
        b = 5;
        // 여기까지 수정 가능

        System.out.println("a : " + a);
        // 출력 : a : 10
        System.out.println("b : " + b);
        // 출력 : b : 5
    }
}
*/


/*
// 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요. // 조건 : 숫자와 사칙연산 사용 금지

public class Main {
    public static void main(String[] args) {
        // `int a` => a라는 이름의 변수(즉 공간)을 만든다.
        // `int` => a라는 공간에는 정수만 담을 수 있다.
        // `;` => 문장이 끝남을 알린다.
        int a;
        a = 5;

        System.out.println(a);
        System.out.println(a + 10);

        int b = 10;

        // `+` => 문장과 문자을 합친다.
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // 여기서 부터
        // a=b; // a=10; a에 b의 값을 넣었기 때문에 a의 값이 10으로 변경됨
        // b=a; // b=10; 위에서 a의 값이 10으로 변경되었기 때문에, b에 a를 넣었을때 a의 값이 출력됨.
        // //변수에는 하나의 값만 넣을 수 있다.
        int c = a;
        a = b;
        b = c;
        // 여기까지 수정 가능
        // value swap의 가장 기본적인 방식
        // a=5, b=10, c=15, d=20일 때, 한 칸씩 미뤄보기


        System.out.println("a : " + a);
        // 출력 : a : 10
        System.out.println("b : " + b);
        // 출력 : b : 5
    }
}
 */

/*
// 문제 : 실행되는 출력문에는 참 그렇지 않으면 거짓 이라고 적어주세요.

class Main {
    public static void main(String[] args) {
        if ( true ) {
            System.out.println("참");
        }

        if ( false ) {
            System.out.println("거짓");
        }

        int a = 10;

        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println("참");
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println("거짓");
        }

        if ( a > 10 ) {
            System.out.println("거짓");
        }

        if ( a >= 10 ) {
            System.out.println("참");
        }

        int b = 10;

        if ( a == b ) {
            System.out.println("참");
        }

        // boolean c => c 에는 오직 true/false 만 담을 수 있다.
        boolean c = a != b;

        if ( c ) {
            System.out.println("거짓");
        }

        if ( c == false ) {
            System.out.println("참");
        }

        // `!` => 반전
        if ( !c ) {
            System.out.println("참");
        }

        // `!` => 반전
        if ( !(!c) ) {
            System.out.println("거짓");
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println("참");
        }

        if ( 20 > 2 && 10 > 3 && true != false && 10 != 10 ) {
            System.out.println("거짓");
        }

        if ( 10 != 10 || 10 < 2 ) {
            System.out.println("거짓");
        }
    }
}
 */


/*
// 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
// 조건 : 출력예시 처럼 출력되어야 합니다.
// 조건 : `구현시작` 부분만 수정 할 수 있습니다.
// 조건 : 4가지 이상의 방법으로 풀어야 합니다.
// 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다. <필요에 의해 넣고 빼고

public class Main {
    public static void main(String[] args) {
        int age = 15; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        // 구현시작
        // 방법 1 - 독립적인 if문
        if (age <= 19 || age >= 60) {
            System.out.println("할인 대상입니다.1");
        }
        if (age > 19 && age < 60) {
            System.out.println("할인 대상이 아닙니다.1");
        }

        // 방법 2 - 동시에 참일 수가 없음
        if (age <= 19 || age >= 60) {
            System.out.println("할인 대상입니다.2");
        } else if (age > 19 && age < 60) {
            System.out.println("할인 대상이 아닙니다.2");
        }

        // 방법 3 - if의 경우 아니면 나머지의 경우가 없기 때문에 가능 / 전형적인 2지선다
        if (age <= 19 || age >= 60) {
            System.out.println("할인 대상입니다.3");
        } else {
            System.out.println("할인 대상이 아닙니다.3");
        }

        // 방법 4 - &&(논리곱), ||(논리합) 제거
        if (age <= 19) {
            System.out.println("할인 대상입니다.4");
        }
        if (age >= 60) {
            System.out.println("할인 대상입니다.4");
        }

        if (age > 19 && age < 60) {
            System.out.println("할인 대상이 아닙니다.4");
        }

        // 방법 5 - 분리를 어떻게 시켰는가에 초점
        if (age <= 19) { // or을 썼을때는 따로, and를 썼을때는 중첩
            System.out.println("할인 대상입니다.5");
        }
        if (age >= 60) {
            System.out.println("할인 대상입니다.5");
        }
        if (age > 19) { // 동시에 만족해야하는 조건이기 때문에 중첩 if를 사용
            if (age < 60) {
                System.out.println("할인 대상이 아닙니다.5");
            }
        }

        // 방법 6 - if가 여러개이기 때문에 else if 사용하여 한 덩어리로 만듦
        if (age <= 19) {
            System.out.println("할인 대상입니다.6");
        } else if (age >= 60) {
            System.out.println("할인 대상입니다.6");
        } else if (age > 19) {
            if (age < 60) {
                System.out.println("할인 대상이 아닙니다.6");
            }
        }

        // 방법 7
        if (age <= 19) {
            System.out.println("할인 대상입니다.7");
        } else if (age >= 60) { // 이 부분에서 true가 되기 때문에 밑에 조건문은 실행되지 않음
            System.out.println("할인 대상입니다.7");
        } else if (age > 19) { // 서로 동시에 참일 수가 없음
            System.out.println("할인 대상이 아닙니다.7");
        }

        // 방법 8
        if (age <= 19) {
            System.out.println("할인 대상입니다.8");
        } else if (age >= 60) {
            System.out.println("할인 대상입니다.8");
        } else {
            System.out.println("할인 대상이 아닙니다.8");
        }

        // 방법 9
        if (age <= 19) {
            System.out.println("할인 대상입니다.9");
        } else {
            if (age >= 60) {
                System.out.println("할인 대상입니다.9");
            } else {
                System.out.println("할인 대상이 아닙니다.9");

            }
        }
        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
    }


}
*/

//0530
/*
class Main {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i);

        i = i + 1; // i의 값을 1증가 시킨다.
        System.out.println(i);

        i += 1; // i의 값을 1 증가 시킨다.
        System.out.println(i);

        i++;// i의 값을 1 증가 시킨다.
        System.out.println(i);

    }

}
*/

//구구단 8단을 출력해주세요. 반복문 사용 금지
// 문제 : 아래와 같이 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//        int i = 8;
//
//        System.out.println("8 * 1 = " + i);
//        i += 8;
//        System.out.println("8 * 2 = " + i);
//        i += 8;
//        System.out.println("8 * 3 = " + i);
//        i += 8;
//        System.out.println("8 * 4 = " + i);
//        i += 8;
//        System.out.println("8 * 5 = " + i);
//        i += 8;
//        System.out.println("8 * 6 = " + i);
//        i += 8;
//        System.out.println("8 * 7 = " + i);
//        i += 8;
//        System.out.println("8 * 8 = " + i);
//        i += 8;
//        System.out.println("8 * 9 = " + i);
//
//        System.out.println("=============");
//        System.out.println("8 * 1 = 8");
//        System.out.println("8 * 2 = 16");
//        System.out.println("8 * 3 = 24");
//        System.out.println("8 * 4 = 32");
//        System.out.println("8 * 5 = 40");
//        System.out.println("8 * 6 = 48");
//        System.out.println("8 * 7 = 56");
//        System.out.println("8 * 8 = 64");
//        System.out.println("8 * 9 = 72");
//
//        System.out.println("=============");
//
//        System.out.println("8 * 1 = 8\n8 * 2 = 16\n8 * 3 = 24");
//
//        System.out.println("=============");
//
//        //좋지 않은 예시 - 문장 하나 담으려고 변수 하나 만들었기 때문에
//        //String s = "8 * 1 = 8\n";
//        //String s2 = "8 * 2 = 16\n";
//        //String s3 = "8 * 3 = 24\n";
//        //System.out.println(s + s2);
//
//        String s = "8 * 1 = 8\n";
//        s = s + "8 * 2 = 16\n";
//        s += "8 * 3 = 24\n";   //이런 형태도 사용할 수 있다.(축약표현)
//
//        System.out.println(s);
//
//        // 출력
//    /*
//    8 * 1 = 8
//    8 * 2 = 16
//    8 * 3 = 24
//    8 * 4 = 32
//    8 * 5 = 40
//    8 * 6 = 48
//    8 * 7 = 56
//    8 * 8 = 64
//    8 * 9 = 72
//    */
//    }
//}

// 구구단 8단을 출력해주세요. dan 변수 활용
// 문제 : 아래와 같이 출력해주세요.
// 문제 : dan 변수의 값에 따라 첫번째로 곱하는 수가 변하게 해주세요.

//class Main {
//    public static void main(String[] args) {
//        int dan = 8;
//
//        System.out.println(dan + " * 1 = 8");
//        System.out.println(dan + " * 2 = 16");
//        System.out.println(dan + " * 3 = 24");
//        System.out.println(dan + " * 4 = 32");
//        System.out.println(dan + " * 5 = 40");
//        System.out.println(dan + " * 6 = 48");
//        System.out.println(dan + " * 7 = 56");
//        System.out.println(dan + " * 8 = 64");
//        System.out.println(dan + " * 9 = 72");
//
//        // 출력
//    /*
//    8 * 1 = 8
//    8 * 2 = 16
//    8 * 3 = 24
//    8 * 4 = 32
//    8 * 5 = 40
//    8 * 6 = 48
//    8 * 7 = 56
//    8 * 8 = 64
//    8 * 9 = 72
//    */
//    }
//}


//구구단 8단을 출력해주세요. dan 변수의 값에 따라 다른 단이 나올 수 있도록 해주세요.
// 문제 : 아래와 같이 출력해주세요.
// 문제 : dan 변수의 값에 따라 그에 해당하는 구구단이 출력 되도록 해주세요.

//class Main {
//    public static void main(String[] args) {
//        int dan = 8;
//
//        System.out.println(dan + " * 1 = " + dan * 1);
//        System.out.println(dan + " * 2 = " + dan * 2);
//        System.out.println(dan + " * 3 = " + dan * 3);
//        System.out.println(dan + " * 4 = " + dan * 4);
//        System.out.println(dan + " * 5 = " + dan * 5);
//        System.out.println(dan + " * 6 = " + dan * 6);
//        System.out.println(dan + " * 7 = " + dan * 7);
//        System.out.println(dan + " * 8 = " + dan * 8);
//        System.out.println(dan + " * 9 = " + dan * 9);
//
//        // 출력
//    /*
//    8 * 1 = 8
//    8 * 2 = 16
//    8 * 3 = 24
//    8 * 4 = 32
//    8 * 5 = 40
//    8 * 6 = 48
//    8 * 7 = 56
//    8 * 8 = 64
//    8 * 9 = 72
//    */
//    }
//}


//구구단 8단을 출력해주세요. 2 이상의 숫자를 사용할 수 없습니다.
// 문제 : 아래와 같이 출력해주세요.
// 문제 : 2부터 9까지의 숫자를 사용하지 않고 구구단 출력을 완성 해주세요.

//class Main {
//    public static void main(String[] args) {
//        int dan = 8;
//
//        // 수정가능지역 시작
//        int i = 1;
//
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i++; // [i = i + 1 , i += 1, i++] 3가지 다 가능함
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i++;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i++;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i++;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i++;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i++;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i++;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i++;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        // 수정가능지역 끝
//
//        // 출력
//    /*
//    8 * 1 = 8
//    8 * 2 = 16
//    8 * 3 = 24
//    8 * 4 = 32
//    8 * 5 = 40
//    8 * 6 = 48
//    8 * 7 = 56
//    8 * 8 = 64
//    8 * 9 = 72
//    */
//    }
//}

// 구구단 8단을 출력해주세요. 2 이상의 숫자를 사용할 수 없습니다.
// 문제 : 아래와 같이 출력해주세요.
// 문제 : 2부터 9까지의 숫자를 사용하지 않고 구구단 출력을 완성 해주세요.
// 조건 : * 1000 까지 출력해주세요.(for, while x)

//class Main {
//    public static void main(String[] args) {
//        int dan = 8;
//
//        // 수정가능지역 시작
//        int i = 1;
//
//        while (i <= 10) { // i가 1000 이하일때 출력하고 i의 값을 1 증가, 복붙을 계속 누르고 있는 경우 리미트 까지 알아서 출력
//            System.out.println(dan + " * " + i + " = " + dan * i);
//            i++;
//        }
//
//        if (i >= 1 && i <= 1000) {
//            System.out.println(dan + " * " + i + " = " + dan * i);
//            i++;
//        }
//
// 복붙하면서 숫자를 세고있음.  또는 ctrl + v를 계속 누르고 있음, 대충 누르고 있다가..
// 10개 단위로 끊어서..
// 나는 몇번 복붙했는지 세기 싫어, 세기 싫어서 누르고 있으면 어디까지 했는지 몰라..
// 내가 원하는 지점까지 어떻게 하면 할 수 있을까..
// hint : if 활용
//
//System.out.println(dan + " * " + i + " = " + dan * i);
//        i++; // [i = i + 1 , i += 1, i++] 3가지 다 가능함
//    }
//}

// 구구단 8단을 출력해주세요. 9까지가 아닌 1000까지 곱해주세요.
// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 * 1000까지 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//        int dan = 8;
//        int i = 1;
//        while(i <= 1000) {
//            System.out.println(dan + " * " + i + " = " + dan * i);
//            i++;
//        }

//        // 출력
//    /*
//    8 * 1 = 8
//    8 * 2 = 16
//    8 * 3 = 24
//    8 * 4 = 32
//    8 * 5 = 40
//    8 * 6 = 48
//    8 * 7 = 56
//    8 * 8 = 64
//    8 * 9 = 72
//    ...
//    8 * 1000
//    */
//    }
//}


// 문제 : 1부터 5까지 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//        // 출력
//        // 1
//        // 2
//        // 3
//        // 4
//        // 5

//        int i = 1;
//        while (i <= 5) {
//            System.out.println(i);
//            i++;
//        }
//    }
//}

// 문제 : -100부터 25까지 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//        // 출력
//        int i = -100;
//        while(i <= 25) {
//            System.out.println(i);
//            i++;
//        }
//    }
//}

// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 `* 1000`부터 `* 1`까지 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//        int dan = 8;
//        int i = 1000;
//        while( i >=1) {
//            System.out.println(dan + "*" + i + "=" + dan * i);
//            i--;
//        }
//        // 출력
//    /*
//    8 * 1000 = 8000
//    ...
//    8 * 1 = 8
//    */
//    }
//}

// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 `* 1000`부터 `* -500`까지 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//        int dan = 8;
//        int i = 1000;
//        while (i >= -500) {
//            System.out.println(dan + "*" + i + "=" + dan * i);
//            i--;
//        }
//        // 출력
//    /*
//    8 * 1000 = 8000
//    ...
//    8 * -500 = -4000
//    */
//    }
//}

// 1부터 5까지의 합을 더한 결과를 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        int sum = 0;  //값을 저장하는 변수,
//        int i = 1;
//        while (i <= 5) {
//            sum += i;         //실행문
//            i++;
//        }
//        System.out.println(sum);
//    }
//    //int sum = 1+2+3+4+5; <초반엔 이렇게 접근해서 단계별로 늘려나갈것.
//
//}

// -100부터 25까지의 합을 더한 결과를 출력해주세요.
//class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int sum = 0;
//        int i = -100;
//
//        while (i <= 25) {
//            sum += i;
//            i++;
//        }
//        System.out.println(sum);
//    }
//}


// 문제 : 1부터 3까지 출력하는 작업을 10번 해주세요.
// 조건 : 2중 while문 사용

//class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        int j = 1;
//        while (j <= 10) {
//            int i = 1;
//            while (i <= 3) {
//                System.out.println(i);
//                i++;
//            }
//            j++;
//        }

// 출력
// 1
// 2
// 3
// 1
// 2
// 3
// 1
// 2
// 3
// 1
// 2
// 3
// 1
// 2
// 3
// 1
// 2
// 3
// 1
// 2
// 3
// 1
// 2
// 3
// 1
// 2
// 3
// 1
// 2
// 3
//    }
//}

//while문 -> for문 사용

// 구구단 8단을 출력해주세요. 9까지가 아닌 1000까지 곱해주세요. (for문 사용)
// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 * 1000까지 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//        int dan = 8;
//        int i = 1;
//
//        for (i = 1; i <= 1000; i++) {
//            System.out.println(dan + " * " + i + " = " + dan * i);
//        }
//
//        // 출력
//    /*
//    8 * 1 = 8
//    8 * 2 = 16
//    8 * 3 = 24
//    8 * 4 = 32
//    8 * 5 = 40
//    8 * 6 = 48
//    8 * 7 = 56
//    8 * 8 = 64
//    8 * 9 = 72
//    ...
//    8 * 1000
//    */
//    }
//}

// 문제 : 1부터 5까지 출력해주세요. (for문 사용)
//
//class Main {
//    public static void main(String[] args) {
//        // 출력
//        // 1
//        // 2
//        // 3
//        // 4
//        // 5
//
//        int i = 1;
//
//        for (i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//    }
//}

// 문제 : -100부터 25까지 출력해주세요. (for문 사용)
//
//class Main {
//    public static void main(String[] args) {
//        // 출력
//        int i = -100;
//
//        for (i = -100; i <= 25; i++) {
//            System.out.println(i);
//        }
//
//    }
//}

// 문제 : 아래와 같이 출력해주세요. (for문 사용)
// 문제 : 단을 `* 1000`부터 `* 1`까지 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//        int dan = 8;
//        int i = 1000;
//
//        for (i = 1000; i >= 1; i--) {
//            System.out.println(dan + " * " + i + " = " + dan * i);
//        }
//        // 출력
//    /*
//    8 * 1000 = 8000
//    ...
//    8 * 1 = 8
//    */
//    }
//}

// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 `* 1000`부터 `* -500`까지 출력해주세요. (for문 사용)
//
//class Main {
//    public static void main(String[] args) {
//        int dan = 8;
//        int i = 1000;
//
//        for (i = 1000; i >= -500; i--) {
//            System.out.println(dan + " * " + i + " = " + dan * i);
//        }
//        // 출력
//    /*
//    8 * 1000 = 8000
//    ...
//    8 * -500 = -4000
//    */
//    }
//}

// 1부터 5까지의 합을 더한 결과를 출력해주세요. (for문 사용)
//
//class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        int sum = 0;  //값을 저장하는 변수,
//        int i = 1;
//
//        for (i = 1; i <= 5; i++) {
//            sum += i;
//        }
//
//        System.out.println(sum);
//    }
//    //int sum = 1+2+3+4+5; <초반엔 이렇게 접근해서 단계별로 늘려나갈것.
//
//}

// -100부터 25까지의 합을 더한 결과를 출력해주세요. (for문 사용)
//
//class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int sum = 0;
//        int i = -100;
//
//        for (i = -100; i <= 25; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//    }
//}


// 문제 : 1부터 3까지 출력하는 작업을 10번 해주세요. (for문 사용)
// 조건 : 2중 while문 사용

//class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int i = 1;
//        int j = 1;
//
//        for(j=1; j<=10; j++) {
//            for (i = 1; i <= 3; i++) {
//                System.out.println(i);
//            }
//        }

// 출력
// 1
// 2
// 3
// 1
// 2
// 3
// 1
// 2
// 3
// 1
// 2
// 3
// 1
// 2
// 3
// 1
// 2
// 3
// 1
// 2
// 3
// 1
// 2
// 3
// 1
// 2
// 3
// 1
// 2
// 3
//    }
//}


class Main {
    public static void main(String[] args) {
        // 아래의 코드를 따라 친 다음
        // 결과가 왜 저렇게 나오는가? 를 서술 (순차적으로, 한국어로)
//        int rows = 5; // 큰 반복문에서 종료조건으로 가능하다
//
//        for (int i = 1; i <= rows; i++) {     // 정수형 변수 i가 rows의 값인 5를 초과할 때까지 1을 증가시키면서 열바꿈을 5번 반복한다.
//            for (int k = 1; k <= i; k++) {    // 정수형 변수 k가 i의 값을 초과할 때 까지 1을 증가시키면서 반복한다.
            // i가 1일때, k의 값은 1, 따라서 * 을 하나 찍는다. 그러고 반복문을 빠져나와, 큰 반복문에 있는 줄바꿈을 만나 한 줄을 띄게 된다.
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // rows 라는 정수형 변수에 5의 값을 대입한다.

        // 정수형 변수 i가 rows의 값인 5를 초과할 때까지 1을 증가시키면서 열바꿈을 5번 반복한다.
        // 정수형 변수 k가 i의 값을 초과할 때 까지 1을 증가시키면서 반복한다.
        // i가 1일때, k의 값은 1, 따라서 * 을 하나 찍는다. 그러고 반복문을 빠져나와, 큰 반복문에 있는 줄바꿈을 만나 한 줄을 띄게 된다.
        // 줄바꿈을 하고 보니 큰 반복문의 끝을 만나 다시 큰반복문의 상단으로 가게된다.

        // 반복문을 한번 반복하면서 i의 값이 증가되었으므로 이 시점에서 i는 2이다. 따라서 2 <= 5이므로 하단에 있는 반복문을 다시 반복한다.
        // 새로 만난 반복문의 k의 초기값은 1, 조건은 k <= i인데 k는 1이지만, i는 반복문을 돌게되면서 2가 되었다. 따라서 1 <= 2이므로 반복문을 3번 반복하게 된다. (출력값: * * )
        // 반복문을 빠져나와 줄바꿈 출력문을 만나게 되어 한 줄을 띄게 된다.
        // 줄바꿈 이후 큰 반복문의 끝을 만나 다시 큰 반복문의 상단으로 가게 된다.

        // 반복문을 다시 만나게 되면서 i의 값이 증가되었으므로 이 시점에서 i는 3이다. 따라서 3 <= 5 이므로 하단에 있는 반복문을 다시 반복한다.
        // 새로 만난 반복문 k의 초기값은 1, 조건은 k <= i인데 k는 1이지만, i는 반복문을 돌게되면서 3이 되었다. 따라서 1 <= 3이므로 반복문을 3번 반복하게 된다. (출력값: * * * )
        // 반복문을 빠져나와 줄바꿈을 하게된다.
        // 줄바꿈 이후 큰 반복문의 끝을 만나 다시 큰 반복문의 상단으로 가게 된다.

        // 반복문을 다시 만나게 되면서 i의 값이 증가되었으므로 이 시점에서 i는 4이다. 따라서 4 <= 5이므로 하단에 있는 반복문을 다시 반복한다.
        // 새로 만난 반복문 k의 초기값은 1, 조건은  k <= i인데 k는 1이지만, i는 반복문을 돌게되면서 4가 되었다. 따라서 1 <= 4이므로 반복문을 4번 반복하게 된다. (출력값: * * * * )
        // 반복문을 빠져나와 줄바꿈을 하게된다.
        // 줄바꿈 이후 큰 반복문의 끝을 만나 다시 큰 반복문의 상단으로 가게 된다.

        // 반복문을 다시 만나게 되면서 i의 값이 증가되었으므로 이 시점에서 i는 5이다. 따라서 5 <= 5 이므로 하단에 있는 반복문을 다시 반복한다.
        // 새로 만난 반복문 k의 초기값은 1, 조건은  k <= i인데 k는 1이지만, i는 반복문을 돌게되면서 5가 되었다. 따라서 1 <= 5이므로 반복문을 5번 반복하게 된다. (출력값: * * * * * )
        // 반복문을 빠져나와 줄바꿈을 하게된다.
        // 줄바꿈 이후 큰 반복문의 끝을 만나 다시 큰 반복문의 상단으로 가게 된다.

        // 반복문을 다시 만나게 되면서 i의 값이 증가되었으므로 이 시점에서의 i는 6이다. 따라서 6 <= 5 이므로 조건에 부합하지 않아 반복문이 끝나게 된다.




//        int rows = 5;
//
//        for (int i = 1; i <= 5; i++) {
//            for (int k = 1; k <= i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}