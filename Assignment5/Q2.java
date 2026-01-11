import java.util.Scanner;
class Q2{
    public static void main (String args[]){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int arr[] = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter"+(i+1)+"Element");
            arr[i]=Sc.nextInt();
            sum = sum+arr[i];
        }
        System.out.println("Sum of Element\t"+sum);
    }
}