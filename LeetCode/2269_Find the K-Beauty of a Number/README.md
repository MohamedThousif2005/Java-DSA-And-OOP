<div align="center">

# 🔍 Find the K-Beauty of a Number

[![LeetCode](https://img.shields.io/badge/LeetCode-2269-orange?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/problems/find-the-k-beauty-of-a-number/)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Topics](https://img.shields.io/badge/Topics-Math%20%7C%20String%20%7C%20Sliding%20Window-blue?style=for-the-badge)
![Acceptance](https://img.shields.io/badge/Acceptance-~61%25-yellow?style=for-the-badge)

🔗 [View on LeetCode](https://leetcode.com/problems/find-the-k-beauty-of-a-number/)

</div>

---

## 📋 Problem Statement

The **k-beauty** of an integer `num` is defined as the number of substrings of length `k` of `num` (when read as a string) that satisfy the following conditions:

- The substring represents an integer **without leading sign**.
- The integer is **not equal to `0`**.
- `num` is **divisible** by this integer.

Return the **k-beauty** of `num`.

---

## 🧪 Examples

### Example 1

```text
Input:  num = 240, k = 2
Output: 2

Explanation:
Substrings of length 2 are "24" and "40".
240 is divisible by both 24 and 40.
Therefore, the k-beauty is 2.
```

### Example 2

```text
Input:  num = 430043, k = 2
Output: 2

Explanation:
Substrings are "43", "30", "00", "04", and "43".
Only the two occurrences of "43" divide 430043 evenly.
Substrings representing 0 are ignored.
```

---

## ⚙️ Constraints

| Constraint | Value |
|---|---|
| Number Range | `1 <= num <= 10⁹` |
| Window Size | `1 <= k <= num.length` (`num.length` is the number of digits in `num`) |

---

## 🏷️ Tags

`Math` &nbsp;&nbsp; `String` &nbsp;&nbsp; `Sliding Window` &nbsp;&nbsp; `Easy`

---

<div align="center">

**[⬅️ Back to Problems](../README.md)**
<br/>

*Happy Coding! 🚀*

</div>
