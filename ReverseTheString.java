import java.util.*;
public class ReverseTheString{
    public static void main (String []args){
        
//using the for loop
        Scanner sc=new Scanner(System.in);
        String a=sc. nextLine();
        String Rev=sc.nextLine();
        for (int i=a.length()-1;i>=0;i--){
            Rev+=a.charAt(i);
        }
        System.out.println( "By using the for loop the reversed string is : "+Rev);
    

//using the inbuild function
        StringBuilder s=new StringBuilder(a);
        s.reverse();
        System.out.println("By using the inbuild function the reversed string is : " +s);
    }
}