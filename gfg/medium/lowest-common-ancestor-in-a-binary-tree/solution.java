class Solution {
    Node lca(Node root, int p, int q) {
        // code here
        if(root == null) return null;
        if(root.data == p || root.data ==  q) return root;
        boolean left = exists(root.left, p);
        boolean right = exists(root.left, q);
        if(left && right) return lca(root.left,p, q);
        else if(!left && !right) return lca(root.right, p,q);
        else return root;
        
    }
    
    public boolean exists(Node root, int val){
        if(root == null) return false;
        if(root.data == val) return true;
        return exists(root.left, val) || exists(root.right, val);
    }
}