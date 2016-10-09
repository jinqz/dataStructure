/**
 * Created by jinqiuzhi on 16/7/7.
 */
public class MyBase extends Base {
    @Override
    public void A(){
        System.out.println("MyBase A method");
    }
    
    @Override
    public void B(){
        super.B();
        System.out.println("MyBase B method");
    }
}
