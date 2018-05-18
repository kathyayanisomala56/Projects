import java.util.*;
 
public class Solution{
    public class Node {
     int val;
    Node left;
 Node right;
 Node(int x) 
 { 
    val = x; 
}
  }
 public class Solution {
    public static ArrayList<ArrayList<Integer>> arr1;
    
     public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
    arr1 = new ArrayList<ArrayList<Integer>>();
          path(root, sum, new ArrayList<Integer>());
             return arr1;
    }
    
    public void path(TreeNode curr, int sum, ArrayList<Integer> path) {
        if(curr.left == null && curr.right == null && curr.val == sum) {
               path.add(curr.val);
              arr1.add(new ArrayList<Integer>(path));
           path.remove(path.size() - 1);
            return;
        }
        path.add(curr.val);
        if(curr.left != null) {
            path(curr.left, sum - curr.val, path);
        }
        if(curr.right != null) {
            path(curr.right, sum - curr.val, path);
        }
        path.remove(path.size() - 1);
    }
}