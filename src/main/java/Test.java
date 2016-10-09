import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

/**
 * Created by jinqiuzhi on 16/6/26.
 */
public class Test {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeNode head = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        head.left = node1;
        head.right = node2;
        node1.left = node3;
        node2.left = node4;

        String s = solution.Serialize(head);
        System.out.println(s);
        TreeNode myHead = solution.Deserialize(s);


    }

}
