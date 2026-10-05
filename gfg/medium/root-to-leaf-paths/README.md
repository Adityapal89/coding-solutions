# Root to Leaf Paths

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a Binary Tree, you need to find all the possible paths from the root node to all the leaf nodes of the binary tree.

 **Note** : The paths should be returned such that paths from the left subtree of any node are listed first, followed by paths from the right subtree.

 **Examples:** 

```
Input: root = [1, 2, 3, 4, 5, N, N]

Output: [[1, 2, 4], [1, 2, 5], [1, 3]]
Explanation: All the possible paths from root node to leaf nodes are: 1 -> 2 -> 4, 1 -> 2 -> 5 and 1 -> 3
```

```
Input: root = [1, 2, 3]

Output: [[1, 2], [1, 3]] 
Explanation: All the possible paths from root node to leaf nodes are: 1 -> 2 and 1 -> 3

```

```
Input: root = [10, 20, 30, 40, 60, N, N]

Output: [[10, 20, 40], [10, 20, 60], [10, 30]]
Explanation: All the possible paths from root node to leaf nodes are: 10 -> 20 -> 40, 10 -> 20 -> 60 and 10 -> 30
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T18:47:35.102Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/root-to-leaf-paths/1)