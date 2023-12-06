 public class TreeCount {
        public int count(TreeNode tree) {
            if(tree==null) return 0;
            int lhs = count(tree.left);
            int rhs = count(tree.right);

            return 1+lhs+rhs;
        }
    }