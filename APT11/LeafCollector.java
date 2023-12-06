import java.util.*;
public class LeafCollector {
    public String[] getLeaves(TreeNode tree) {
        ArrayList<ArrayList<String>> rounds = new ArrayList<>();
        ArrayList<String> thisLeaf = new ArrayList <>();
        while(tree.left != null || tree.right != null) {
            thisLeaf = new ArrayList<>();
            findLeaf(tree, thisLeaf);
            rounds.add(thisLeaf);
        }
        thisLeaf = new ArrayList<>();
        thisLeaf.add(String.valueOf(tree.info));
        rounds.add(thisLeaf);
        String[] ret = new String[rounds.size()];
        for (int i = 0; i < rounds.size(); i++) {
            ArrayList<String> round = rounds.get(i);
            ret[i] = String.join(" ", round);
        }
        return ret;
    }
    public void findLeaf(TreeNode root, ArrayList<String> thisLeaf) {
        if(root == null) return;
        if(root.left != null && isLeaf(root.left)) {
            thisLeaf.add(String.valueOf(root.left.info));
            root.left = null;
        } 
        else findLeaf(root.left, thisLeaf);
        if(root.right != null && isLeaf(root.right)) {
            thisLeaf.add(String.valueOf(root.right.info));
            root.right = null;
        } 
        else findLeaf(root.right, thisLeaf);
    }

    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}