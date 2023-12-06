public class PathSum {
    public int hasPath(int target, TreeNode tree){
            if(hasPathSum(tree, target)) return 1;
            else return 0;
    }
    public boolean hasPathSum(TreeNode tree, int target){
            if(tree == null) return false;
            boolean ans = false;
            int newtarget = target - tree.info;
            if(newtarget==0 && tree.left ==null && tree.right == null){
                return (ans = true);
            } 
            if(tree.left !=null){
                ans = ans || hasPathSum(tree.left, newtarget);
            }
            if(tree.right!=null){
                ans = ans || hasPathSum(tree.right, newtarget);
            }
            return ans;
    }
}
