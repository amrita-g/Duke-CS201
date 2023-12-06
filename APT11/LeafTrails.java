import java.util.*;
public class LeafTrails {
    TreeMap<Integer, String> leafmap;
    public void trail(TreeNode root, String pathSoFar) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            leafmap.put(root.info, pathSoFar);
            return;
        }
        trail(root.left, pathSoFar + "0");
        trail(root.right, pathSoFar + "1");
    }
    public String[] trails(TreeNode tree) {
        leafmap = new TreeMap<>();
        trail(tree, "");
        String[] ret = new String[leafmap.size()];
        int i = 0;
        for(String s: leafmap.values()) {
            ret[i] = s;
            i++;
        }
        return ret;
    }
}