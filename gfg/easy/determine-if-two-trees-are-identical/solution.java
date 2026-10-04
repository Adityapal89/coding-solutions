/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    public boolean isIdentical(Node r1, Node r2) {
        // code here
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        preorder1(r1,arr1);
        preorder2(r2,arr2);
        if(arr1.equals(arr2)) return true;
        
        return false;
    
    }
    
    public void preorder1(Node r1, ArrayList<Integer> arr1){
        if(r1 == null) return;
        arr1.add(r1.data);
        preorder1(r1.left, arr1);
        preorder1(r1.right, arr1);
    }
    
    public void preorder2(Node r2, ArrayList<Integer> arr2){
        if(r2 == null) return;
        arr2.add(r2.data);
        preorder2(r2.left, arr2);
        preorder2(r2.right, arr2);
    }
    
}