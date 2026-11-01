class Solution {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(root.data);
        if(root.left == null && root.right == null) return arr;
        leftboundary(root.left, arr);
        leafnode(root, arr);
        rightboundary(root.right, arr);
        return arr;
    }
    
    public void leftboundary(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        arr.add(root.data);
        if(root.left != null) leftboundary(root.left, arr);
        else leftboundary(root.right, arr);
    }
    
    public void leafnode(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        if(root.left == null && root.right == null) arr.add(root.data);
        leafnode(root.left, arr);
        leafnode(root.right, arr);
    }
    
    public void rightboundary(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        if(root.right != null) rightboundary(root.right, arr);
        else rightboundary(root.left, arr);
        arr.add(root.data);
    }
}