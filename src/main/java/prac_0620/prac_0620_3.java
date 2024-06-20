package prac_0620;

public class prac_0620_3 {
    public static void main(String[] args) {
        System.out.println(123);

        try {
            int rs = 계산기.나누다(15, 0);
            System.out.println(rs);
        } catch (ArithmeticException e) {   // 0으로 나누려고 했을때 예외가 발생한다. 이때 예외처리를 해주면 된다.
            System.out.println("0으로 못나눠");
        } catch (Exception e) {
            System.out.println("알 수 없는 예외상황 발생");
        }
    }
}

class 계산기 {
    static int 나누다(int a, int b) throws ArithmeticException {   //나누다라는 메소드를 쓸때, 이걸 조심해 라고
        int rs = 0;

        rs = a / b;

//        try {
//            rs = a / b;
//
//        } catch (ArithmeticException e) {   // 0으로 나누려고 했을때 예외가 발생한다. 이때 예외처리를 해주면 된다.
//            System.out.println("0으로 못나눠");
//            return 0;
//        }
        return rs;
    }
}


//클래스 내에서 트라이캐치를 해도 되고, 메인해서 해도 되는데
// 메인에서 할 경우 유의해야할 점을 클래스에 throws 를 사용해서 적어준다.

