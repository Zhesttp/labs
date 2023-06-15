package task3;

import task3.domain.*;

import java.util.*;

public class Program {

    public static void main(String[] args) {
        Map<String, Pet> map = new HashMap<>();
        
        map.put("Барсик", new Cat("Барсик", 3));
        map.put("Бобик", new Dog("Бобик", 5));
        map.put("Кеша", new Parrot("Кеша", 2));
    
        printKeys(map);
      }
    
      public static void printKeys(Map<String, Pet> map) {
        for (String key : map.keySet()) {
          System.out.println(key);
        }
      }
}
