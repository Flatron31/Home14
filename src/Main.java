import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(2);
//        list.add(1);
//        list.add(7);
//        list.add(8);
//        list.add(4);
//        list.add(0);
//        list.add(2);
//        list.add(7);
//
//        List<Integer> newList = list.stream()
//                .filter(value-> value % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println(newList);
//
//        List<Integer> newList1 = list.stream()
//                .skip(3)
//                .filter(value-> value % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println(newList1);
//
//
//        List<Integer> newList2 = list.stream()
//                .skip(3)
//                .limit(3)
//                .filter(value-> value % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println(newList2);
//
//
//        List<Integer> newList3 = list.stream()
//                .distinct()
//                .limit(3)
//                .collect(Collectors.toList());
//        System.out.println(newList3);
//
//
//        long dfdfgtdds = list.stream()
//                .filter(value -> value % 2==0)
//                .count();
//        System.out.println(dfdfgtdds);
//
//
//        Optional<Integer> min = list.stream()
//                .filter(value -> value % 2==0)
//                .min(Integer::compareTo);
//        min.ifPresent(System.out::println);
//
//        System.out.println("----------");
//        list.stream()
//                .forEach(value -> System.out.println(value));

//--------------------------------------------------------------------------------------------------------------------

        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));

        }
        System.out.println(list);

        long nChet = list.stream()
                .filter(x -> x % 2 == 0)
                .count();
        System.out.println(nChet);

        List<Integer> newlist1 = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(newlist1);

        List<Integer> newlist2 = list.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println(newlist2);

        Optional<Integer> max = list.stream()
                .max(Integer::compareTo);
        max.ifPresent(System.out::println);  // в классе

        Optional<Integer> min = list.stream()
                .min(Integer::compareTo);
        if (min.isPresent()) {
            System.out.println(min.get());
        }

        List<Integer> newlist4 = list.stream()
                .filter(x -> x > 20)
                .sorted()
                .map(x -> x * 10)
                .collect(Collectors.toList());
        System.out.println(newlist4);

        Optional<Integer> newlist5 = list.stream()
                .skip(5)
                .limit(10)
                .distinct()
                .max(Integer::compareTo);
        if (max.isPresent()) {
            System.out.println(max.get());
        }

        List<Integer> newlist6 = list.stream()
                .skip(5)
                .limit(10)
                .map(x -> x * 10)
                .sorted((a, b) -> b.compareTo(a))
                .map(x -> x + 5)
                .collect(Collectors.toList());
        System.out.println(newlist6);

    }
}
