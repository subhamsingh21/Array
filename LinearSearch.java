import java.util.*;
public class LinearSearch{
   
    // linear (one by one)
    public static int linSrh(int number [],int key ){
        for(int i=0;i<number.length;i++) if(number[i]==key) return i;
        return -1;
    }

    public static void main(String ag[]){
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int key= sc.nextInt();
        int number[] ={10,20,30,40,50};
        

        int index = linSrh(number, key);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at index- " + index);
        }
    }
}