import java.util.Scanner;
public class frequency
{
    public static void main(String[] args) 
    {
        String str,str1;
        int i,count=0;
        char ch,ch1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        str=sc.nextLine();
        str1=str.toLowerCase();
        System.out.println("Enter Character:");
        ch=sc.next().charAt(0);
        ch1=Character.toLowerCase(ch);
        for(i=0;i<str1.length();i++)
        {
            if(ch1==str1.charAt(i))
            {
                count++;
            }
        }
        System.out.println("Frequency:"+count);
        }
}