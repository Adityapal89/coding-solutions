// class Solution {
//     public ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
//         // code here
        
        
//     }
// }

class Solution {
    public void dfs(Node root, int s, int sum, ArrayList<Integer> path,
                    ArrayList<ArrayList<Integer>> ans) {
        if (root == null) return;

        path.add(root.data);
        sum += root.data;

        if (sum == s) ans.add(new ArrayList<>(path));

        dfs(root.left, s, sum, path, ans);
        dfs(root.right, s, sum, path, ans);

        path.remove(path.size() - 1);
    }

    public ArrayList<ArrayList<Integer>> printPaths(Node root, int s) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        dfs(root, s, 0, new ArrayList<>(), ans);
        return ans;
    }
}