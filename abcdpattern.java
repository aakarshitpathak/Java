class abcdpattern
{
    public static void main(String args[]) 
    {
        String word = "ABCDE";
        int len = word.length();
        
        for (int i = 0; i < len; i++) 
        {
            for (int j = i; j < len; j++)
            {
                char ch = word.charAt(j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}