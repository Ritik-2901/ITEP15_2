import java.util.Scanner;
class Q5{
    public static void main(String []args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter no. of Element");
        int n =Sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<arr.length;i++){
            System.out.println("enter "+(i+1)+" Element");
            arr[i]=Sc.nextInt();

         if(arr[i]%5==0){
            arr[i]=0;
         }
        }
        for(i=0;i<n;i++)
        System.out.println(arr[i]);
    }
}