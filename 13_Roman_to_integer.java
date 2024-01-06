class Solution {
    public int romanToInt(String s) {
    int output = 0;
    int pre = 0;
    int res = 0;
    for(int i=s.length()-1;i>=0;i--)
    {
    switch (s.charAt(i))
    {
        case 'I':
        output=1;
        break;
        case 'V':
        output=5;
        break;
        case 'X':
        output=10;
        break;
        case 'L':
        output=50;
        break;
        case 'C':
        output=100;
        break;
        case 'D':
        output=500;
        break;
        case 'M':
        output=1000;
        break;
    }
    if(output<pre)
    {
        res = res-output;
    }
    else
    {
        res = res+output;
    }
    pre = output;
    }
    return res;
    }
}
