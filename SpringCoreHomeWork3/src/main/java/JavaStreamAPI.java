import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamAPI {


    public static void main(String[] args) throws IOException {


        //1
        List<String> list = Arrays.asList("Xenia", "Maxim", "Juliaa");


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> listBuffered = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            String line = bufferedReader.readLine();
            listBuffered.add(line);
        }


        //1
        list.stream().map(String::toLowerCase)
                .forEach(System.out::println);



        //2

        list.stream().filter(s -> s.length() %2 != 0).forEach(System.out::println);

        //3 list.stream().map(x -> x).collect(Collectors.joining(" | "));
        System.out.println(list.stream().collect(Collectors.joining("-")));

        //4
        long count = listBuffered.stream().filter(s->s.length() > 0).count();

        System.out.println(count);
    }


}
