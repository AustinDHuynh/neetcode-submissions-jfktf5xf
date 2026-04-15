/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> myList = new ArrayList<>();
        Queue <TreeNode> myQueue = new LinkedList<>();

        myQueue.add(root);

        while(!myQueue.isEmpty()){
            ArrayList<Integer> tempList = new ArrayList<>();
            int levelSize = myQueue.size();
            for(int i = 0; i < levelSize; i++){
                TreeNode curr = myQueue.remove();
                if(curr != null){
                    tempList.add(curr.val);
                    myQueue.add(curr.left);
                    myQueue.add(curr.right);
                }
            }
            if(tempList.size() > 0){
                myList.add(tempList);
            }
        }
        return myList;
    }
}
