// Last updated: 7/30/2026, 12:17:16 PM
1class Solution {
2    public boolean checkValidString(String s) { 
3    int low=0;
4    int high=0;
5       for (char ch : s.toCharArray())
6        { if (ch == '(') {
7             low++; high++; } 
8             else if (ch == ')') { 
9                if (low > 0) low--; high--; } 
10                else { // '*' 
11                if (low > 0) 
12                low--; // treat as ')' 
13                high++; // or treat as '(' 
14                } if (high < 0) return false; 
15                } return low == 0;
16    }
17}