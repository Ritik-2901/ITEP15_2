import java.util.Scanner;

 class Revers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  sentence:");
        String str = sc.nextLine();

        
        str = str + " ";

        String w = "";
        String result = ""; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                w = w + ch;
            } else {
              
                String rev = "";
                for (int j = w.length() - 1; j >= 0; j--) {
                    rev = rev + w.charAt(j);
                }

                result = result + rev + " ";
                w = "";  
            }
        }

       
        System.out.println(result); 
    }
}
