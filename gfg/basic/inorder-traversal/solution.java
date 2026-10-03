/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        inorder(root,arr);
        return arr;
    }
    
    public void inorder(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }
}