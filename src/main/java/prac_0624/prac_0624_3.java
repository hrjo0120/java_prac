package prac_0624;
// Stream filter
import java.util.Arrays;

public class prac_0624_3 {
    public static void main(String[] args) {
        int[] arr = {33, 2, 55, 4, 51, 6, 71, 18, 29, 10};  //배열 arr 생성
        int rsArrLen = 0;   // 홀수를 걸러내고 짝수만 담을 새로운 배열의 길이를 파악할 변수 생성
        for (int n : arr) {
            if (n % 2 == 0) {
                rsArrLen++;
            }
        }

        int[] rsArr = new int[rsArrLen];    // 새로 배열 rsArr 생성
        int rsArrLastIndex = -1;    // 밑에서 +1 해서 저장하기 때문에 lastindex가 -1이다.

        //여기서 하는 일을 파악해서 스트림으로 다시 써보기
        for (int n : arr) {     // 원래 배열을 순회시킴
            if (n % 2 != 0) {   // 짝수가 아닐경우(홀수일 경우)
                continue;       // 넘어가고
            }
            rsArr[++rsArrLastIndex] = n;    //rsArr배열에 마지막 인덱스에 +1 해서 n의 값을 넣는다.    // 요소를 집어넣음. 짝수만 집어넣는다.
        }

        System.out.println(Arrays.toString(rsArr)); //짝수가 아닐경우 continue 되었기 때문에 짝수인 값만 들어가게 된다. // 짝수만 집어넣은 배열 출력

        // 스트림 변경 예시 설명
        arr = new int[]{33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        rsArr = Arrays.stream(arr)  //arr의 스트림 생성
                .filter(e -> e % 2 == 0)    //arr의 요소중 짝수만 거른다
                .map(e -> e * 2)    // +추가) filter로 짝수만 걸렀기 때문에 *2를 하더라도 어차피 짝수이다. 따라서 걸러지는 것이 없다.
                .toArray(); //다시 배열로 만들어서 rsArr에 저장한다.

        System.out.println(Arrays.toString(rsArr)); //rsArr 을 *2 했기 때문에, [4, 8, 12, 36, 20]이 출력된다.

    }
}

