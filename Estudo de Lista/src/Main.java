import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Gabriel");
        list.add("Miguel");
        list.add("Anna");
        list.add("Jennifer");
        list.add("Adriel");
        list.add("Alex");
        list.add(2, "Marco");

        list.remove("Anna");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------");
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------");
        System.out.println("Index of Jennifer: " + list.indexOf("Jennifer"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);


    }
}