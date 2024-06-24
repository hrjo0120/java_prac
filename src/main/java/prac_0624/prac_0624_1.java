package prac_0624;

import java.util.stream.IntStream;

public class prac_0624_1 {
    public static void main(String[] args) {

        // 일반
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 스트림 1
        IntStream.rangeClosed(1, 10)
                .forEach(e -> {
                    System.out.println(e);
                });

        // 스트림 2
        IntStream.rangeClosed(1, 10)
                .forEach(e -> System.out.println(e));

        // 스트림 3
        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);
    }
}
