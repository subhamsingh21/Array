import java.util.*;
public class pw{
    public static void main(String ar[]){
        Scanner sc= new Scanner(System.in);
        StringBuilder str= new StringBuilder(sc.nextLine());

         for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            int ascai = (int)ch;
            boolean flag = true;
            if((int)ch>=97) flag=false;
            if(flag == true){ // capital
                ascai += 32;
                char word = (char)ascai;
                str.setCharAt(i,word);

            }
            else{ //small
                ascai -= 32;
               char word=(char)ascai;
               str.setCharAt(i,word);
                
            }



        }
        System.out.print(str);
         
    }
}