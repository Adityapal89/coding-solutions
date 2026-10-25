# Paths from Root with Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary tree and an integer  **s**, print all paths starting from the root such that the sum of the node values along each path equals s.

A path does not necessarily have to end at a leaf node.

 **Examples:** 

```
Input : s = 8, root[] = [1, 20, 3, N, N, 4, 15, 6, N, N, N, N, N]
             
Output : [[1, 3, 4]]
Explanation : Sum of path 1, 3, 4 = 8. 
      
```

```
Input : s = 38, root[] = [10, 28, 13, N, N, 14, 15, 21, 22, 23, 24, N, N, N, N, N, N, N, N]
        

Output : [[10, 28], [10, 13, 15]] 
Explanation : Sum of path 10, 28 = 38 and Sum of path 10, 13, 15 = 38.
        
```

 **Constraints :** 
1 ≤ n ≤ 2*103, where n is the number of nodes in the binary tree
-103 ≤ s ≤ 103
-103 ≤ Node.value ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T18:27:29.381Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/paths-from-root-with-a-specified-sum/1)