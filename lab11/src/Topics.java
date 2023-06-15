import java.util.Locale;


import java.util.ResourceBundle;
import java.util.Set;

public class Topics {
    public static void printTopics(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("topics", locale);
        Set<String> keys = bundle.keySet();
        for (String key : keys) {
            String value = bundle.getString(key);
            System.out.println(key + " - " + value);
        }
    }
}