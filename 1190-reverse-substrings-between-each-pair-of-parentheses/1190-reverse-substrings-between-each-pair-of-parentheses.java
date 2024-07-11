class Solution {
    public String reverseParentheses(String s) {
    Stack<Character> st=new Stack<>();
    StringBuilder res=new StringBuilder();
    for(int i=0;i<s.length();i++)    
    {
        if(s.charAt(i)!=')')
        {
            st.push(s.charAt(i));
        }
        else
        {
            StringBuilder sb=new StringBuilder();
            while(st.peek()!='(')
            {
                sb.append(st.pop());
            }
            st.pop();
            for(int j=0;j<sb.length();j++)
            {
                st.push(sb.charAt(j));
            }
        }
    }
    while(!st.isEmpty())
    {
        res.append(st.pop());
    }
    res.reverse();
    return res.toString();
    }
}