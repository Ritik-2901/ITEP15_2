import java.util.Scanner;
class Q6{
    public static void main(String []args){
        int arr[]= {4,2,5,1,3,8,9,7,5};
        int temp=0;
        int i;
        for ( i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;}
            }
           
        }
        for ( i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}