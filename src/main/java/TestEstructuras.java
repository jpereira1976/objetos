import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestEstructuras {

    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(10000);
        integers.add(1);
        integers.add(2);
        integers.add(1);
        integers.add(3);
        integers.add(10000);

        for (Integer value : integers)
            System.out.println(value);


        Map<String, String> map = new HashMap<>();
        map.put("1", "Javier");
        map.put("2", "Juan");
        map.put("3", "Julieta");

        System.out.println(map.get("3"));
    }
}
