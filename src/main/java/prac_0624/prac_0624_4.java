package prac_0624;
// Stream collect

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class prac_0624_4 {
    public static void main(String[] args) {
        int[] arr = {33, 2, 55, 4, 51, 6, 71, 18, 29, 10};  //배열 arr 생성

        List<Integer> resultAl = new ArrayList<>();

        //filter
        for (int n : arr) {
            if (n % 2 == 0) {
                resultAl.add(n);
            }
        }
        // 한줄로 표현해도 된다.(틀린 문법이 아님)
        //for (int n : arr) if (n % 2 == 0) resultAl.add(n);

        // map
        for (int i = 0; i < resultAl.size(); i++) { //5번 반복하면서
            int newValue = resultAl.get(i) * 2;     // 기존의 값을 꺼내서 *2를 한다.(집어 넣을 값을 계산)
            resultAl.set(i, newValue);    //i는 인덱스를 정해주고, newValue는 넣어줄 값
            //resultAl.set(i, resultAl.get(i) * 2);   //이 형태로 작성해도 되지만 보기 편하게 위와 같은 방법으로 넣는게 좋다.
        }

        System.out.println(resultAl);   //배열이 아니기 때문에 이렇게 출력해도 된다.

        // 스트림
        // 위 코드와 비교하면서 공부하기.
        arr = new int[]{33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        //아래 코드는 .으로 연결되어있어서 사실상 한줄이다. 가독성을 위해 줄바꿈을 하는 것.
        resultAl = Arrays.stream(arr)
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .boxed()  //써도 되고 안써도 되지만, no instance(s) type이 나오면 써주는 것이 좋다.
                .collect(Collectors.toList());
                //요소들을 integer형으로 수동으로 바꿔주는 것

        System.out.println(resultAl);

    }
}
