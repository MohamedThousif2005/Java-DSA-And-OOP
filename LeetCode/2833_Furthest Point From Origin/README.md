<div align="center">

# 🔍 Furthest Point From Origin

[![LeetCode](https://img.shields.io/badge/LeetCode-2833-orange?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/problems/furthest-point-from-origin/)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Topics](https://img.shields.io/badge/Topics-String%20%7C%20Greedy%20%7C%20Math-blue?style=for-the-badge)
![Acceptance](https://img.shields.io/badge/Acceptance-~82%25-yellow?style=for-the-badge)

🔗 [View on LeetCode](https://leetcode.com/problems/furthest-point-from-origin/)

</div>

---

## 📋 Problem Statement

You are given a string `moves` consisting of the characters:

- `'L'` — move one unit to the **left**.
- `'R'` — move one unit to the **right**.
- `'_'` — can be replaced by either `'L'` or `'R'`.

Initially, you are standing at position `0` on an infinite number line.

Return the **maximum possible distance** from the origin after performing all the moves.

---

## 🧪 Examples

### Example 1

```text
Input:  moves = "L_RL__R"
Output: 3

Explanation:
One optimal replacement is "LLRLLLL",
ending at position -3.
The distance from the origin is |−3| = 3.
```

### Example 2

```text
Input:  moves = "_R__LL_"
Output: 5

Explanation:
One optimal replacement is "RRRRLLR",
ending at position 5.
The distance from the origin is |5| = 5.
```

### Example 3

```text
Input:  moves = "_______"
Output: 7

Explanation:
Replace every '_' with either 'L' or 'R',
ending at position -7 or 7.
The maximum distance is 7.
```

---

## ⚙️ Constraints

| Constraint | Value |
|---|---|
| String Length | `1 <= moves.length <= 50` |
| Characters | `moves` consists only of `'L'`, `'R'`, and `'_'` |

---

## 🏷️ Tags

`String` &nbsp;&nbsp; `Greedy` &nbsp;&nbsp; `Math` &nbsp;&nbsp; `Easy`

---

<div align="center">

**[⬅️ Back to Problems](../README.md)**
<br/>

*Happy Coding! 🚀*

</div>
