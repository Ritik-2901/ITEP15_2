import java.util.Scanner;
class Q1{
    public static void main(String []args){
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter no.");
        int n = Sc.nextInt();
        int arr[] = new int[n];
       
        for (int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+"Element");   
            arr[i] =Sc.nextInt();
        }
        System.out.println("Given data is");
        for(int i=0;i<n;i++){
        System.out.println(arr[i]);
        }


    }
}