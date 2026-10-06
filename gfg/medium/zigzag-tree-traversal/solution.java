class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null) return arr;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++){
                Node temp = q.remove();
                list.add(temp.data);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            
            if(!leftToRight){
                Collections.reverse(list);
            }
            
            arr.addAll(list);
            leftToRight = !leftToRight;
            
        }
        return arr;
        
    }
}