<div align="center">

# 🔍 Shifting Letters

[![LeetCode](https://img.shields.io/badge/LeetCode-0848-orange?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/problems/shifting-letters/)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange?style=for-the-badge)
![Topics](https://img.shields.io/badge/Topics-Array%20%7C%20String%20%7C%20Prefix%20Sum-blue?style=for-the-badge)
![Acceptance](https://img.shields.io/badge/Acceptance-~44%25-yellow?style=for-the-badge)

🔗 [View on LeetCode](https://leetcode.com/problems/shifting-letters/)

</div>

---

## 📋 Problem Statement

You are given a string `s` of lowercase English letters and an integer array `shifts` of the same length.

For each `shifts[i] = x`, shift the **first `i + 1` letters** of `s`, `x` times.

In one shift:

- `'a'` becomes `'b'`
- `'b'` becomes `'c'`
- ...
- `'y'` becomes `'z'`
- `'z'` becomes `'a'`

Return the **final string** after performing all shifts.

---

## 🧪 Examples

### Example 1

```text
Input:  s = "abc", shifts = [3,5,9]
Output: "rpl"

Explanation:
After shifting the first 1 letter 3 times: "dbc"
After shifting the first 2 letters 5 times: "igc"
After shifting the first 3 letters 9 times: "rpl"
```

### Example 2

```text
Input:  s = "aaa", shifts = [1,2,3]
Output: "gfd"
```

---

## ⚙️ Constraints

| Constraint | Value |
|---|---|
| String Length | `1 <= s.length <= 2 × 10⁴` |
| Array Length | `shifts.length == s.length` |
| Shift Value | `0 <= shifts[i] <= 10⁹` |

---

## 🏷️ Tags

`Array` &nbsp;&nbsp; `String` &nbsp;&nbsp; `Prefix Sum` &nbsp;&nbsp; `Medium`

---

<div align="center">

**[⬅️ Back to Problems](../README.md)**
<br/>

*Happy Coding! 🚀*

</div>
