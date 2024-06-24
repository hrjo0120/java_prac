package prac_0624;
// Stream
import java.util.Arrays;

public class prac_0624_2 {
    public static void main(String[] args) {
        //일반
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i<arr.length; i++){  //2의 배수로 출력
            arr[i] *= 2;
        }

        //for문 (1~10출력){
//        for(int i = 0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }

        System.out.println(Arrays.toString(arr));

        // 스트림
        arr = new int[]{1,2,3,4,5,6,7,8,9,10};
//        int[] rsArray = Arrays.stream(arr)
//                .map(e -> {
//                    return e * 2;
//                }).toArray();

        // 스트림을 더 줄이면 이런 식으로 사용할 수 있다.
        int[] rsArray = Arrays.stream(arr)
                .map(e -> e * 2).toArray();

        System.out.println(Arrays.toString(rsArray));
    }
}
