import java.util.*;
public class VowelsConsonants{
    public static void main (String []args){
        Scanner sc=new Scanner (System.in);
        int vowel=0;
        int consonant=0;
        int count=0;
        System.out.println("Enter a string :");
        String s=sc.nextLine();
        s=s.toLowerCase();                  //convert the  string into lowercase
        s=s.replaceAll(" ","");             //replace the empty spaces
        for (int i=0;i<s.length();i++){
            char input=s.charAt(i);
            count++;
        if(input>='a'&&input<='z'){
            if(input=='a'||input=='e'||input=='i'||input=='o'||input=='u')      //check the vowels in the string 
            { 
                vowel++;
        } 
        else   {
            consonant++;
        }
        
    } 
   
    }
     System.out.println("No.of letters in string :"+count);
    System.out.println( "No.of vowel is :" +vowel);
    System.out.println( "No.of consonant is :"+consonant);
}
}

