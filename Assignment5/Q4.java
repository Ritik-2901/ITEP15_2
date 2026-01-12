import java.util.Scanner;
class Q4{
    public static void main (String []args){
        Scanner Sc =new Scanner(System.in);
         System.out.print("Enter the Element");
         int n = Sc.nextInt();
         int arr []={10,20,30,40,50};
         boolean match= false;
         for(int i=0;i<arr.length;i++){
            if (arr[i]==n){
               System.out.println("Elemnt found at"+i);
               match = true;
               break;
            }
             
         }
        if (!match)
             System.out.println("Elemant not found");    
         
            
       

    }
}