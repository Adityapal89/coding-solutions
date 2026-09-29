# Check if the Sentence Is Pangram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A  **pangram**  is a sentence where every letter of the English alphabet appears at least once.

Given a string `sentence` containing only lowercase English letters, return `true` *if* `sentence` *is a  **pangram**, or* `false` *otherwise.* 

 

 **Example 1:** 

```
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

```

 **Example 2:** 

```
Input: sentence = "leetcode"
Output: false

```

 

 **Constraints:** 

- 1 <= sentence.length <= 1000
- sentence consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 59.60%)  
**Memory:** 43.1 MB (beats 33.24%)  
**Submitted:** 2026-09-29T13:58:44.823Z  

```java
class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];
        for(int i=0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            freq[ch - 'a']++;
        }
        for(int val : freq){
            if(val == 0){
                return false;
            }
            
        }
        return true;
    }
    
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)