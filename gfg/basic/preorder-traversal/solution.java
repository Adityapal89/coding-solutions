/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        preorder(root,arr);
        return arr;
    }
    
    public void preorder(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        arr.add(root.data);
        preorder(root.left, arr);
        preorder(root.right, arr);
    }
}