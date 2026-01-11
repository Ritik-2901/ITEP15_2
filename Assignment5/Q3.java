import java.util.Scanner;
class Q3{
    public static void main (String []args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter no of element");
        int n = Sc.nextInt();
        int sum1=0;
        int sum2=0;
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            System.out.println("Enter"+(i+1)+" Element");
            arr[i]=Sc.nextInt();
            if(arr[i]%2==0)
               sum1 =sum1+arr[i];
            else
            sum2= sum2+arr[i];
               
        }
        System.out.println("Sum of even element=\t"+sum1);
        System.out.println("Sum of odd  element=\t"+sum2);
        
           
    }
}