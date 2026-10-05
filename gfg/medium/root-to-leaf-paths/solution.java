class Solution {
    public ArrayList<ArrayList<Integer>> paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(root,arr, list);
        return arr;
    }
    
    public void helper(Node root, ArrayList<ArrayList<Integer>> arr, List<Integer> list){
        if(root == null) return;
        list.add(root.data);
        if(root.left == null && root.right == null){
            arr.add(new ArrayList<>(list));
        } else{
            helper(root.left, arr, list);
            helper(root.right, arr, list);
        }
        list.remove(list.size()-1);
    }
}