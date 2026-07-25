# 14. Longest Common Prefix

**Difficulty:** 🟢 Easy

**Problem Link:** https://leetcode.com/problems/longest-common-prefix/

---

## 📖 Problem Statement

Write a function to find the **longest common prefix** string amongst an array of strings.

If there is no common prefix, return an empty string `""`.

---

## 📝 Examples

### Example 1

**Input**
```text
strs = ["flower","flow","flight"]
```

**Output**
```text
"fl"
```

---

### Example 2

**Input**
```text
strs = ["dog","racecar","car"]
```

**Output**
```text
""
```

**Explanation**

There is no common prefix among the input strings.

---

## 📌 Constraints

- `1 <= strs.length <= 200`
- `0 <= strs[i].length <= 200`
- `strs[i]` consists of only lowercase English letters if it is non-empty.

---

## 💡 Approach

- Compare characters of every string from left to right.
- Stop when a mismatch is found or any string ends.
- Return the matched prefix.

---

## ⏱️ Complexity

| Time | Space |
|:----:|:-----:|
| **O(n × m)** | **O(1)** |

> **n** = Number of strings  
> **m** = Length of the shortest string
