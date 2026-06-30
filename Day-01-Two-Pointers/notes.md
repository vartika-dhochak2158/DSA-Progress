# Day 1 - Two Pointers

## Problem: Two Sum II

## Idea:

Use two pointers (left and right) and move based on sum.

## Complexity:

Time: O(n)  
Space: O(1)

## Learnings:

- Works only on sorted arrays
- Move left → increase sum
- Move right → decrease sum
- Remember 1-based indexing

---

## Problem 2: Remove Duplicates from Sorted Array

### Idea:

Use two pointers:

- cm (scan pointer)
- officer (write pointer)

### Logic:

- If new element found → write it at officer position
- Move officer forward

### Complexity:

Time: O(n)  
Space: O(1)

### Key Insight:

We overwrite duplicates in-place.
