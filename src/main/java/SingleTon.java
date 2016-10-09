/**
 * Created by jinqiuzhi on 16/7/24.
 */
public class SingleTon {
    public static void main(String[] args){
        String[] strings = {"jute", "hemp", "nylon"};
        UnaryFunction<String> sameString = identityFunction();
        for(String s : strings){
            System.out.println(sameString.apply(s));
        }


    }
    private static UnaryFunction<Object> IDENTITY_FUNCTION = new UnaryFunction<Object>(){
        public Object apply(Object arg){return arg;}
    };

    public static <T> UnaryFunction<T> identityFunction() {
        return (UnaryFunction<T>) IDENTITY_FUNCTION;
    }
}
