import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionSample {
    public static void main(String[] args) {
        String[] colors = new String[3];
        colors[0] = "Red";
        colors[1] = "Green";
        colors[2] = "Yellow";

        for (var color : colors) {
            System.out.println(color);
        }

        List<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Yellow");

        for (String string : colorList) {
            System.out.println(string);
        }

        Map<String, String> items = new HashMap<>();
        items.put("red", "Red");
        items.put("blue", "Blue");
        items.put("yellow", "Yellow");

        for (String key : items.keySet()) {
            System.out.println("item is " + items.get(key));
        }

    }
    
}