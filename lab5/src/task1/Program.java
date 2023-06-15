package task1;

import task1.domain.Product;
import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void printEntrySet(Map<String, Product> map) {
        for (Map.Entry<String, Product> entry : map.entrySet()) {
          System.out.println(entry.getKey() + ": " + entry.getValue());
        }
      }

      public static void printKeySet(Map<String, Product> map) {
        for (String key : map.keySet()) {
          System.out.println(key);
        }
      }

      public static void printValues(Map<String, Product> map) {
        for (Product value : map.values()) {
          System.out.println(value);
        }
      }

    public static void main(String[] args) {

        Map<String, Product> map = new HashMap<>();

        map.put("Кубик", new Product("Кубик", 10.0));
        map.put("Мяч", new Product("Мяч", 15.0));
        map.put("Кукла", new Product("Кукла", 20.0));
    
        printEntrySet(map);
        printKeySet(map);
        printValues(map);
    }
}
