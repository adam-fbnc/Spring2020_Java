package Day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LongCountries {
    public static void main(String[] args) {
        ArrayList<String>   list = new ArrayList<>();
        list.addAll(Arrays.asList("Kyrgyzstan", "Combodia", "China", "France", "United States", "Canada", "Russian Federation", "Germany"));
        list.removeIf(p-> Collections.frequency(list, p.length())>8);
        System.out.println(list);

    }
}
