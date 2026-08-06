<div align="center">

# 🔍 Fruit Into Baskets

[![LeetCode](https://img.shields.io/badge/LeetCode-0904-orange?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/problems/fruit-into-baskets/)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange?style=for-the-badge)
![Topics](https://img.shields.io/badge/Topics-Array%20%7C%20Hash%20Table%20%7C%20Sliding%20Window-blue?style=for-the-badge)
![Acceptance](https://img.shields.io/badge/Acceptance-~47%25-yellow?style=for-the-badge)

🔗 [View on LeetCode](https://leetcode.com/problems/fruit-into-baskets/)

</div>

---

## 📋 Problem Statement

You are visiting a farm that has a **single row of fruit trees** represented by the integer array `fruits`, where `fruits[i]` is the type of fruit produced by the `iᵗʰ` tree.

You want to collect as much fruit as possible following these rules:

- You have **two baskets**, and each basket can hold **only one type** of fruit.
- There is **no limit** on the number of fruits each basket can hold.
- Starting from any tree, you must pick **exactly one fruit** from every tree while moving to the right.
- Once you encounter a fruit that cannot fit into either basket, you must stop.

Return the **maximum number of fruits** you can collect.

---

## 🧪 Examples

### Example 1

```text
Input:  fruits = [1,2,1]
Output: 3

Explanation:
Collect all fruits using two baskets:
Basket 1 → type 1
Basket 2 → type 2
```

### Example 2

```text
Input:  fruits = [0,1,2,2]
Output: 3

Explanation:
Collect fruits from trees [1,2,2].
```

### Example 3

```text
Input:  fruits = [1,2,3,2,2]
Output: 4

Explanation:
Collect fruits from trees [2,3,2,2].
```

---

## ⚙️ Constraints

| Constraint | Value |
|---|---|
| Array Length | `1 <= fruits.length <= 10⁵` |
| Fruit Type | `0 <= fruits[i] < fruits.length` |

---

## 🏷️ Tags

`Array` &nbsp;&nbsp; `Hash Table` &nbsp;&nbsp; `Sliding Window` &nbsp;&nbsp; `Medium`

---

<div align="center">

**[⬅️ Back to Problems](../README.md)**
<br/>

*Happy Coding! 🚀*

</div>
