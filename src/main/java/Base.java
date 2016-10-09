import java.util.HashSet;
import java.util.Set;

/**
 * Created by jinqiuzhi on 16/7/7.
 */
public class Base {
    public void A(){
        System.out.println("Base A method");
    }

    public void B(){
        A();
        System.out.println("Base B method");
    }
    private class InBase {
        public void test(){
            A();
            Set<?> set = new HashSet<Object>();

        }
    }
}
