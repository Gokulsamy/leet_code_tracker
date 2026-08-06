// Last updated: 8/6/2026, 2:40:15 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3
4        StringBuilder sb = new StringBuilder();
5        int count = 0;
6
7        for (int i = s.length() - 1; i >= 0; i--) {
8
9            char ch = s.charAt(i);
10
11            // check manually for letter or digit
12            if ((ch >= 'a' && ch <= 'z') ||
13                (ch >= 'A' && ch <= 'Z') ||
14                (ch >= '0' && ch <= '9')) {
15
16                if (count == k) {
17                    sb.append('-');
18                    count = 0;
19                }
20
21                // convert lowercase to uppercase manually
22                if (ch >= 'a' && ch <= 'z') {
23                    ch = (char)(ch - 32);
24                }
25
26                sb.append(ch);
27                count++;
28            }
29        }
30
31        return sb.reverse().toString();
32    }
33}