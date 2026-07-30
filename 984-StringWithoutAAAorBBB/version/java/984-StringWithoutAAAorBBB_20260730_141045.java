// Last updated: 7/30/2026, 2:10:45 PM
1class Solution {
2    public String strWithout3a3b(int a, int b) {
3        StringBuilder sb = new StringBuilder();
4
5        while (a > 0 || b > 0) {
6
7            int n = sb.length();
8
9            if (n >= 2 && sb.charAt(n - 1) == sb.charAt(n - 2)) {
10
11                if (sb.charAt(n - 1) == 'a') {
12                    sb.append('b');
13                    b--;
14                } else {
15                    sb.append('a');
16                    a--;
17                }
18
19            } else {
20
21                if (a >= b && a > 0) {
22                    sb.append('a');
23                    a--;
24                } else {
25                    sb.append('b');
26                    b--;
27                }
28            }
29        }
30
31        return sb.toString();
32    }
33}