public class HeightLabel {
        public TreeNode rewire(TreeNode t) {
            int l =0;
            int r = 0;
            if(t.left!=null){
                t.left = rewire(t.left);
                l = t.left.info;
            }
            if(t.right!=null){
                t.right = rewire(t.right);
                r = t.right.info;
            }
            int max = Math.max(l,r);
            t.info = 1+max;
            return t;
        }
    }
