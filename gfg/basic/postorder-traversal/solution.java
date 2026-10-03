/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        postorder(root,arr);
        return arr;
    }
    
    public void postorder(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        postorder(root.left,arr);
        postorder(root.right,arr);
        arr.add(root.data);
    }
}