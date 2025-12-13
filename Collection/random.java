import java.util.*;
class Category{
    public static void main(String[] args) {
        
    
    HashMap<String,ArrayList<String>> Category = new HashMap<>();
    ArrayList<String> al1 = new ArrayList<>();
    al1.add("Chair");
    al1.add("Table");
    al1.add("Bed");
    Category.put("Funiture",al1);
   

    ArrayList<String> al2 = new ArrayList<>();
    al2.add("Vasline");
    al2.add("Eye liner");
    al2.add("Lipstic");
    Category.put("Cosmatic",al2);
  


    ArrayList<String> al3 = new ArrayList<>();
    al3.add("Mobile");
    al3.add("Laptop");
    al3.add("Tv");
    Category.put("Electronic",al3);
   

    Category.remove("Cosmatic v");
     System.out.print(Category);
    }
}