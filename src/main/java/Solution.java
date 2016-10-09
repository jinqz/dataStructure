/**
 * Created by jinqiuzhi on 16/9/8.
 */
public class Solution {
    int index = -1;
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if(root == null){
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val).append(",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }
    TreeNode Deserialize(String str) {
        if(str == null){
            return null;
        }
        index = -1;
        String[] treeNodes = str.split(",");
        return DeserializeDLR(treeNodes);
    }

    TreeNode DeserializeDLR(String[] DLRseq) {
        index++;
        TreeNode leave = null;
        if(!DLRseq[index].equals("#")){
            leave = new TreeNode(Integer.valueOf(DLRseq[index]));
            leave.left = DeserializeDLR(DLRseq);
            leave.right = DeserializeDLR(DLRseq);
        }
        return leave;
    }



}


