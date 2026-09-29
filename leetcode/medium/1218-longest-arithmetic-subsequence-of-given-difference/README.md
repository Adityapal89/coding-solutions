# Longest Arithmetic Subsequence of Given Difference

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `arr` and an integer `difference`, return the length of the longest subsequence in `arr` which is an arithmetic sequence such that the difference between adjacent elements in the subsequence equals `difference`.

A  **subsequence**  is a sequence that can be derived from `arr` by deleting some or no elements without changing the order of the remaining elements.

 

 **Example 1:** 

```
Input: arr = [1,2,3,4], difference = 1
Output: 4
Explanation: The longest arithmetic subsequence is [1,2,3,4].
```

 **Example 2:** 

```
Input: arr = [1,3,5,7], difference = 1
Output: 1
Explanation: The longest arithmetic subsequence is any single element.

```

 **Example 3:** 

```
Input: arr = [1,5,7,8,5,3,4,2,1], difference = -2
Output: 4
Explanation: The longest arithmetic subsequence is [7,5,3,1].

```

 

 **Constraints:** 

- 1 <= arr.length <= 105
- -104 <= arr[i], difference <= 104

## Solution

**Language:** Java  
**Runtime:** 39 ms (beats 61.92%)  
**Memory:** 79.8 MB (beats 39.23%)  
**Submitted:** 2026-09-29T14:52:30.518Z  

```java
class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : arr) {
            int prev = num - difference;
            int len = map.getOrDefault(prev, 0) + 1;
            map.put(num, len);
            ans = Math.max(ans, len);
        }
        return ans;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/)