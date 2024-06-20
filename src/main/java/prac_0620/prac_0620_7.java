package prac_0620;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class prac_0620_7 {
    public static void main(String[] args) {
        //철수나이 20
        //영희나이 22
        //영수나이 33

        // 1
        int 철수나이 = 20;
        int 영희나이 = 22;
        int 영수나이 = 33;

        // 2
        int[] ages = new int[3];
        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 33;

        // 3
        Ages ages2 = new Ages();
        ages2.철수_나이 = 20;
        ages2.영희_나이 = 22;
        ages2.영수_나이 = 33;

        // 4. ArrayList
        List<Integer> ages3 = new ArrayList<>();    //ArrayList를 활용했다.
        // 집어 넣은 순서가 바뀔 경우, 인덱스 번호를 바꾸어야함.
        // 순서가 바뀔 경우, 꽤나 복잡해지게 된다
        ages3.add(20);  // index: 0
        ages3.add(23);  // 1
        ages3.add(33);  // 2

        ages3.remove(1);    //20, 33

        System.out.println("철수 나이 : " + ages3.get(0));
        System.out.println("영수 나이 : " + ages3.get(2));
        System.out.println("영희 나이 : " + ages3.get(1));

        // add가 순차적으로 들어가면서 인덱스를 0, 1, 2로 붙이기 때문에 어느 데이터가 누구꺼인지 판별하기 힘들다.
        // 중간값을 하나 지울 경우, 이후에 나오는 모든 데이터의 인덱스가 1씩 줄어들게 되어, 데이터가 많아질수록 문제가 커진다.
        // 순서를 상관하지 않는 경우엔 관련 없지만, 순서가 필요한 경우엔 다른 방식을 사용해야한다.

        ages3.add(1,55);    //1에 55를 넣을 경우 중간에 값이 삽입이 되어 20, 55, 33이 된다.

        // add는 완벽하지가 않다. 중간에 값을 넣을경우 뒤로 또 밀리는 경우가 생기기 때문이다.
        //List는 넣을때 좋고, 가져올때 귀찮다.

        // 5. HashMap
        Map<String, Integer> agesMap = new HashMap<>();  //Map은 HashMap 의 상위클래스
        //<Key값, Hash값> => 쌍으로 이루어진 데이터,
        // 김철수-001234 : <String-Integer>, 1, 123: <Integer, Integer>
        // <> 안에는 짝지어진 데이터의 값을 써주면 된다.

        agesMap.put("철수", 20);  // index : 철수(Key)
        agesMap.put("영희", 22);
        agesMap.put("영수", 33);

        System.out.println("철수 나이 : " + agesMap.get("철수"));
        System.out.println("영수 나이 : " + agesMap.get("영수"));
        System.out.println("영희 나이 : " + agesMap.get("영희"));

        //List와 Map는 같이 비교하면서 공부하면 좋다.
        //List는 넣을때 좋고, 가져올때 귀찮다.
        //Map은 넣을때 귀찮고, 가져올때 좋다

    }
}

class Ages {
    int 철수_나이;
    int 영희_나이;
    int 영수_나이;
}
