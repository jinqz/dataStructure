import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;

/**
 * Created by jinqiuzhi on 16/7/26.
 */
public class MutiMapTest {
    public static void main(String[] args){
        Multimap<String, String> myMultimap = ArrayListMultimap.create();
        myMultimap.put("Fruits", "Banana");
        myMultimap.put("Fruits", "Apple");
        myMultimap.put("Fruits", "Pear");
        myMultimap.put("Fruits", "Pear");
        myMultimap.put("Vegetables", "Carrot");

        System.out.println(myMultimap.size());

        Collection<String> fruits = myMultimap.get("Fruits");
        System.out.print(fruits);


    }
}
