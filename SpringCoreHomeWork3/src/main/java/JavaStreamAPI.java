import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaStreamAPI {


    public static void main(String[] args) {


        //1
        List<String> list = Arrays.asList("Xenia", "Maxim", "Juliaa");

//        list.stream().map(String::toLowerCase)
//                .forEach(System.out::println);



        //2

//        list.stream().filter(s -> s.length() %2 != 0).forEach(System.out::println);

        //3 list.stream().map(x -> x).collect(Collectors.joining(" | "));
        list.stream().map(x -> x).collect(Collectors.joining(" - "));
    }


}
