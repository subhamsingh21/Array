public class singleRep {
    public static void findSingleRepeted(int a[],int rep){
        for(int i=1 ;i<a.length;i++){
              rep=rep^a[i];

        }
        System.out.print("Single element is - "+ rep);
             
    }
    public static void main(String ar[]){
        int a[]={5,2,3,4,5,3,2};
        int rep=a[0];
        findSingleRepeted(a, rep);
    }
}
