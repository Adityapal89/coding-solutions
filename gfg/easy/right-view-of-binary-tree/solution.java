/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(root.data);
        order(root,arr, 0);
        return arr;
    }
    
    public void order(Node root, ArrayList<Integer> arr, int level){
        if(root == null) return;
        if(level == arr.size()){
            arr.add(root.data);
        }
        order(root.right, arr, level + 1);
        order(root.left, arr, level + 1);
        
    }
}