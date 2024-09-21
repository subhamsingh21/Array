public class Smp1 {  
    public static void arrMultiply(int array[]){
        int start=1;
        for(int i=0;i<array.length;i++){
             start=start*array[i];
        }
        System.out.println(start);
    }
    public static void main(String ar[]){
        int array[]={2,3,4,5,6};
        arrMultiply(array);
      
    }
    
}
