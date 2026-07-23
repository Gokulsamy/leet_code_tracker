// Last updated: 7/23/2026, 4:27:06 PM
1class Solution {
2
3    int index = 0;
4
5    public String decodeString(String s) {
6        String result = "";
7
8        while (index < s.length() && s.charAt(index) != ']') {
9
10            char ch = s.charAt(index);
11
12            if (Character.isDigit(ch)) {
13
14                int num = 0;
15                while (Character.isDigit(s.charAt(index))) {
16                    num = num * 10 + (s.charAt(index) - '0');
17                    index++;
18                }
19
20                index++; // Skip '['
21
22                String temp = decodeString(s);
23
24                index++; // Skip ']'
25
26                for (int i = 0; i < num; i++) {
27                    result += temp;
28                }
29
30            } else {
31                result += ch;
32                index++;
33            }
34        }
35
36        return result;
37    }
38}