/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        order(root, arr, 0);
        return arr;
    }
    
    public void order(Node root, ArrayList<Integer> arr, int levels){
        if(root == null) return;
        if(levels == arr.size()){
            arr.add(root.data);
        }
        
        order(root.left, arr, levels+1);
        order(root.right, arr, levels+1);
    }
}