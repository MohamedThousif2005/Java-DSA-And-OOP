<div align="center">

# 🍬 Candy

[![LeetCode](https://img.shields.io/badge/LeetCode-135-orange?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/problems/candy/)
![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red?style=for-the-badge)
![Topics](https://img.shields.io/badge/Topics-Array%20%7C%20Greedy-blue?style=for-the-badge)
![Acceptance](https://img.shields.io/badge/Acceptance-~45%25-yellow?style=for-the-badge)

🔗 [View on LeetCode](https://leetcode.com/problems/candy/)

</div>

---

## 📋 Problem Statement

There are `n` children standing in a line. Each child is assigned a rating value given in the integer array `ratings`.

You are giving candies to these children subject to the following requirements:

- Each child must have **at least one candy**.
- Children with a **higher rating** than their immediate neighbor must receive **more candies** than that neighbor.

Return the **minimum number of candies** you need to distribute to the children.

---

## 🧪 Examples

### Example 1

```text
Input:  ratings = [1,0,2]
Output: 5
Explanation: You can allocate candies as [2,1,2].
```

### Example 2

```text
Input:  ratings = [1,2,2]
Output: 4
Explanation: You can allocate candies as [1,2,1].
The third child gets 1 candy because it satisfies the above conditions.
```

---

## ⚙️ Constraints

| Constraint | Value |
|---|---|
| Number of Children | `1 <= ratings.length <= 2 × 10⁴` |
| Rating Value | `0 <= ratings[i] <= 2 × 10⁴` |

---

## 🏷️ Tags

`Array` &nbsp;&nbsp; `Greedy` &nbsp;&nbsp; `Hard`

---

<div align="center">

**[⬅️ Back to Problems](../README.md)**
<br/>

*Happy Coding! 🚀*

</div>
