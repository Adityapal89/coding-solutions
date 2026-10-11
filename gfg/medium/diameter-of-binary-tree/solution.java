/*Structure of binary tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
};*/

class Solution {
    public int diameter(Node root) {
        // code here
        if(root == null) return 0;
        int a = levels(root.left) + levels(root.right);
        int b = diameter(root.left);
        int c = diameter(root.right);
        return Math.max(a,Math.max(b,c));
    }
    
    public int levels(Node root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }
}