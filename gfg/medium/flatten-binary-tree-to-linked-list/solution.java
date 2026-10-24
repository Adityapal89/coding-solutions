class Solution {
    public static void flatten(Node root) {
        // code here
        ArrayList<Node> arr = new ArrayList<>();
        Node temp = root;
        preorder(temp, arr);
        for(int i=1; i<arr.size(); i++){
            root.left = null;
            root.right = arr.get(i);
            root = root.right;
        }
        root.left = null;
        root.right = null;
        
    }
    
    public static void preorder(Node root, ArrayList<Node> arr){
        if(root == null) return;
        arr.add(root);
        preorder(root.left, arr);
        preorder(root.right, arr);
    }
    
}