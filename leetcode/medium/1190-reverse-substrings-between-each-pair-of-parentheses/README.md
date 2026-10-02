# Reverse Substrings Between Each Pair of Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` that consists of lower case English letters and brackets.

Reverse the strings in each pair of matching parentheses, starting from the innermost one.

Your result should  **not**  contain any brackets.

 

 **Example 1:** 

```
Input: s = "(abcd)"
Output: "dcba"

```

 **Example 2:** 

```
Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.

```

 **Example 3:** 

```
Input: s = "(ed(et(oc))el)"
Output: "leetcode"
Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.

```

 

 **Constraints:** 

- 1 <= s.length <= 2000
- s only contains lower case English characters and parentheses.
- It is guaranteed that all parentheses are balanced.

## Solution

**Language:** Java  
**Runtime:** 10 ms (beats 24.07%)  
**Memory:** 43.1 MB (beats 57.36%)  
**Submitted:** 2026-10-02T06:25:54.799Z  

```java
class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(res.length());
            }else if(ch == ')'){
                int l = st.pop();
                reverse(res, l,res.length()-1);
            }else{
                res.append(ch);
            }
        }
        return res.toString();
    }

    public void reverse(StringBuilder res, int i, int j){
        while(i < j){
            char temp = res.charAt(i);
            res.setCharAt(i,res.charAt(j));
            res.setCharAt(j,temp);
            i++;
            j--;
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/)