<div align="center">

# 🔤 Minimum Window Substring

[![LeetCode](https://img.shields.io/badge/LeetCode-0076-orange?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/problems/minimum-window-substring/)
![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red?style=for-the-badge)
![Topics](https://img.shields.io/badge/Topics-Hash%20Table%20%7C%20String%20%7C%20Sliding%20Window-blue?style=for-the-badge)
![Acceptance](https://img.shields.io/badge/Acceptance-~46%25-yellow?style=for-the-badge)

🔗 [View on LeetCode](https://leetcode.com/problems/minimum-window-substring/)

</div>

---

## 📋 Problem Statement

Given two strings `s` and `t` of lengths `m` and `n`, return the **minimum window substring** of `s` such that every character in `t` (including duplicates) is included in the window.

If there is no such substring, return an empty string `""`.

The test cases will be generated such that the answer is **unique**.

---

## 🧪 Examples

### Example 1

```text
Input:  s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"

Explanation:
The substring "BANC" contains all characters 'A', 'B', and 'C'.
```

### Example 2

```text
Input:  s = "a", t = "a"
Output: "a"
```

### Example 3

```text
Input:  s = "a", t = "aa"
Output: ""

Explanation:
There are two 'a' characters required, but s contains only one.
```

---

## ⚙️ Constraints

| Constraint | Value |
|---|---|
| String Length | `m == s.length`, `n == t.length` |
| Length Range | `1 <= m, n <= 10⁵` |
| Characters | `s` and `t` consist of uppercase and lowercase English letters |

---

## 🏷️ Tags

`Hash Table` &nbsp;&nbsp; `String` &nbsp;&nbsp; `Sliding Window` &nbsp;&nbsp; `Hard`

---

<div align="center">

**[⬅️ Back to Problems](../README.md)**
<br/>

*Happy Coding! 🚀*

</div>
