
import java.util.*;

public class HuffmanDecoding {

    public class TreeNode {
        String info;
        TreeNode left;
        TreeNode right;
        TreeNode(String x){
            info = x;
        }
        TreeNode(String x, TreeNode lNode, TreeNode rNode){
            info = x;
            left = lNode;
            right = rNode;
        }
    }
      public String decode(String archive, String[] dictionary) {
            String output_string = "";
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            TreeNode root = new TreeNode(dictionary[0], null, null);
            TreeNode root2 = root;
            TreeNode next = root; //pointer 
            for(int i=1; i<dictionary.length; i++){ // parses through the dictionary 
                 for(int j=0; j<dictionary[i].length(); j++){
                  if(dictionary[i].substring(j,j+1).equals("0")){
                        next.left = new TreeNode(dictionary[i], null, null);
                        next = next.left;
                  }
                  else{
                        next.right = new TreeNode(dictionary[i], null, null);
                        next = next.right;
                  }
           }
      }// created a tree 
      for(int i=0; i<archive.length();i++){
            String pathValue = ""; //while archive has not ended 
            if(archive.substring(i,i+1).equals("0")){
                pathValue = iterateTree(root.left, "0");
            } 
            else {
                pathValue = iterateTree(root.right, "1");
            }
            
            for(int j=0;j<dictionary.length;j++){
                if(pathValue.equals(dictionary[j])){
                    output_string += alphabet.substring(j,j+1);
                }
            }
      }
            return output_string;
      }
      private String iterateTree(TreeNode root, String path, int i){
        if(root==null){
            return path;
        }
        if(root.left==null && root.right==null){
            return path;
        } 
        else {
            iterateTree(root.left, path+"0");
            iterateTree(root.right, path+"1");
        }
        return path;
      }

}