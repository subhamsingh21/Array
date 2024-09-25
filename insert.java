public class insert {
    public static void insertElement(int array[],int index,int element){
        for(int i=array.length-1;i>index-1;i--){
              array[i]=array[i-1];
        }
          array[index]=element;
          for(int i=0;i<array.length;i++){
              System.out.print(array[i] + "  ");
          }
    }
    public static void main(String ar[]){
        int array[]={2,4,5,6,7,8,9,80};
        int index=4;
        int element=50;
        insertElement(array, index, element);
    }
}
