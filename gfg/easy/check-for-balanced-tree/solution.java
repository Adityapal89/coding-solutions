class Solution {
    // public boolean isBalanced(Node root) {
    //     // code here
    //     if(root == null) return true;
    //     int leftLevel = levels(root.left);
    //     int rightLevel = levels(root.right);
    //     if(Math.abs(leftLevel - rightLevel) > 1) return false;
    //     return isBalanced(root.left) && isBalanced(root.right);
    // }
    
    // public int levels(Node root){
    //     if(root == null) return 0;
    //     return 1+Math.max(levels(root.left), levels(root.right));
        
    // }
    
    static boolean flag;
    public boolean isBalanced(Node root){
        if(root == null) return true;
        flag = true;
        levels(root);
        return flag;
    }
    
    public int levels(Node root){
        if(root == null) return 0;
        int left = levels(root.left);
        int right = levels(root.right);
        if(Math.abs(left - right) > 1) flag = false;
        return 1 + Math.max(left, right);
        
    }
}