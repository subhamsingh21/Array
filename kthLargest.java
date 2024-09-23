public class kthLargest{
    public static void main(String ar[]){
        int array[]={9,3,5,6,8,1};
        int k=4;
        int temp;
        loop1: for(int i=0;i<array.length;i++){
             loop2: for(int j=i+1;j<array.length;j++){
                  if(array[i]<array[j]){
                    //swap
                    temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                  }
                  else if(array[i]==k-1){
                    break loop2;
                  }

             }
        }
        // for(int i=0;i<array.length;i++){
        System.out.print("largest element is - ");
        System.out.print(array[k]); 
    // break;
// }
    }

}
