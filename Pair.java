public class Pair {
      public static void pairArray(int number[]){
        int tp=0;
        for(int i=0;i<number.length;i++){
            int curr=number[i];
                 //innerloop
            for(int j=1+i;j<number.length;j++){
                System.out.print("(" + curr+","+ number[j] + ")");
                tp++;

            }
            System.out.println();
        }
        System.out.println("Total pair =" + tp);

      }

 public static void main(String ar[]){
  int number[]= {2,3,4,5,6};
  pairArray(number);
 }
}