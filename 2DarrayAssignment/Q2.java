import java.util.Scanner;
class Q2{
    public static void main(String []args){
     Scanner Sc =new Scanner(System.in);
     System.out.println("Enter a no. of row and no. coloum");
     int n = Sc.nextInt();
     int arr[][]=new int [n][n];
     for (int i = 0;i<arr.length;i++){
        for(int j =0 ;j<arr[i].length;j++){
            System.out.println("Enter Row"+(i+1)+" coloum"+(j+1));
            arr[i][j]=Sc.nextInt();
        }
     }
     for (int i = 0;i<arr.length;i++){
        for(int j =0 ;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");

            
        }
        System.out.println();
     }
     for (int i = 0; i<arr.length;i++){
        for(int j =0 ; j<arr[i].length;j++){
            if (i>j)
            System.out.print(arr[i][j]);
        }
     }


    }
}