import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        
        str = str + " ";

        String word = "";
        String result = ""; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word = word + ch;
            } else {
              
                String rev = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    rev = rev + word.charAt(j);
                }

                result = result + rev + " ";
                word = "";  
            }
        }

        System.out.println("Output:");
        System.out.println(result.trim()); 
    }
}
