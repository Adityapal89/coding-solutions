/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}*/

class Solution {
    public static int findMax(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        preOrder(root,arr);
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) > max){
                max = arr.get(i);
            }
        }
        return max;
        
    }

    public static int findMin(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        preOrder(root,arr);
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) < min){
                min = arr.get(i);
            }
        }
        return min;
        
    }
    public static void preOrder(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        arr.add(root.data);
        preOrder(root.left,arr);
        preOrder(root.right,arr);
    }
}