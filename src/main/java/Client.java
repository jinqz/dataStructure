import java.util.*;

/**
 * Created by jinqiuzhi on 16/7/26.
 */
public class Client {
    public void methodA(String str, Integer... is){}
    public void methodA(String str, String... is){}

    public static void main(String[] args){
        Client client = new Client();
        String str = null;
        client.methodA("china", str);

    }

}
