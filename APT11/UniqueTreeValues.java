import java.util.*;
public class UniqueTreeValues {
    HashSet<Integer> uniqueTreeNode = new HashSet<Integer>();
    public int[] unique(TreeNode root) {
    if(root==null){
    return new int[0];
    }
    uniqueTreeNode.add(root.info);

    unique(root.left);
    unique(root.right);

    List<Integer> list = new ArrayList<Integer>(uniqueTreeNode); 
    int[] outputArr = new int[uniqueTreeNode.size()];
    for(int i=0; i<uniqueTreeNode.size(); i++){
        outputArr[i]=list.get(i);
    }
        Arrays.sort(outputArr);
        return outputArr;

    }
}