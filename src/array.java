// import javax.swing.plaf.synth.SynthSplitPaneUI;
import java.util.ArrayList;
import java.util.*;

public class array {

    public static void main(String[] args) {

        // =======================================================
        // Array 
        // =======================================================

        // String[] cars = {"Camaro", "Camino", "Corvette", "Tesla"};

        // Alternate Way:

        // String[] cars = new String[4];

        // cars[0] = "Camaro";
        // cars[1] = "Camino";
        // cars[2] = "Tesla";
        // cars[3] = "Corvette";


        // cars[1] = "BMW";

        // for (int i=0; i<cars.length; i++) {
        //     System.out.println(cars[i]);

        // }

        // =======================================================
        // 2D - Array 
        // =======================================================

        // String[][] cars = new String[3][3];

        // cars[0][0] = "Camaro";
        // cars[0][1] = "Camino";
        // cars[0][2] = "BMW";
        // cars[1][0] = "Tesla";
        // cars[1][1] = "Porche";
        // cars[1][2] = "Ferrari";
        // cars[2][0] = "Maruti";
        // cars[2][1] = "TATA";
        // cars[2][2] = "Optima";

        // Alternative Way:

        // String[][] cars = {
        //                        {"Camaro", "Camino", "BMW"}, 
        //                        {"Tesla", "Porche", "Ferrari"}, 
        //                        {"Maruti", "TATA", "Optima"}
        //                   };

        // for (int i = 0; i <cars.length; i++) {
        //     System.out.println();
        //     for (int j = 0; j < cars[i].length; j++)

        //     System.out.print(cars[i][j] + " ");
        // }

        // =======================================================
        // String Methods
        // =======================================================

        // String name = "Swanand";

        // boolean result = name.equalsIgnoreCase("Sumit"); // ye false dega
        // int result = name.length(); // string ki length dega
        // char result = name.charAt(0); // iss position pe konsa char hai wo batata
        // int result = name.indexOf("S"); // Ye char konse position pe hai wo batayega
        // boolean result = name.isEmpty(); // khali hoga to true, bhara hoga to false
        // String result = name.toUpperCase();
        // String result = name.toLowerCase();
        // String result = name.trim(); // String me empty spaces hata dega
        // String result = name.replace('S', 'D');
        // String result = name.substring(0, 0);

        // System.out.println(result);

        // =======================================================
        // Wrapper Classes
        // =======================================================

        // wrapper class =  provides a way to use primitive data types as reference data types
        //     reference data types contain useful methods
        //     can be used with collections (ex.ArrayList)
  
        //primitive    //wrapper
        //---------//-------
        // boolean     Boolean
        // char        Character
        // int         Integer
        // double      Double
  
        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
  
        // Boolean a = true;
        // Character b = '@';
        // Integer c = 123;
        // Double d = 3.14;
        // String e = "Swanand";

        // if(a == true){
        //     System.out.println("This is true");
        // }

        // a.hashCode()           ----just an example of method of boolean
        // b.toUpperCase(0)       ----just an example of method of char

        // wrapper classes ka fayda hai ki apan koi bhi data type me methods use kar sakte jaise string me kiya hai upar
        // wrapper classes me first letter capital rehta aur pura word spell karna padta
        // wrapper classes ke variables normal variables jaise bhi use kar sakte ex. Integer ko int jaise bhi vapar sakte

        // =======================================================
        // Array List 
        // =======================================================

        // Array List: an resizable array
        //             Elements can be added or removed after compilation phase
        //             can store only reference data types.....sirf wrapper classes hi vaparna hai
        //  aur iske liye ek chiz import bhi karni padti hai....java.util.ArrayList
        
        // ArrayList<String> food = new ArrayList<String>();

        // food.add("pizza");
        // food.add("hamburger");
        // food.add("lehsun");           //ye add method hai...isse array list me kuch bhi add kar sakte

        // food.set(0, "maggi");   // isse koi element replace ho jayega
        // food.remove(1);                 // isse koi element remove ho jayega
        // food.clear();                         // isse saare elements clear ho jayenge



        // for(int i=0; i<food.size(); i++){
        //     System.out.println(food.get(i));
        // }

        // =======================================================
        // 2D - Array List 
        // =======================================================

        // 2D Array List : A dynamic list of lists
        //  We can set the size of these lists during runtime

        // ArrayList<ArrayList<String>> groceryList = new ArrayList(); 

        // ArrayList<String> bakeryList = new ArrayList();

        // bakeryList.add("RS Pasta");
        // bakeryList.add("Garlic Naan");
        // bakeryList.add("Packing Charges");

        // ArrayList<String> produceList = new ArrayList();

        // produceList.add("Tikhat");
        // produceList.add("Mith");
        // produceList.add("Halad");

        // ArrayList<String> drinksList = new ArrayList();

        // drinksList.add("Litchi");
        // drinksList.add("Butterscotch");

        // groceryList.add(bakeryList);
        // groceryList.add(produceList);
        // groceryList.add(drinksList);

        // System.out.println(groceryList);
        // System.out.println(groceryList.get(2).get(0));  // 2 get hai idar, pehla wala grocery list mese lega, dusra wala pehle me jo bola usse lega

        // =======================================================
        // for-each Loopie
        // =======================================================

        // for-each loop : traversing technique to iterate through the elements in an array/collection
        //                 less steps, more readable
        //                 less flexible though

        // String[] animals = {"cat", "dog", "bird", "rat"};

        // ArrayList<String> animals = new ArrayList<String>();  //array list bhi aayega tobhi for each loop same kaam karega

        // animals.add("cat");
        // animals.add("dog");
        // animals.add("rat");
        // animals.add("bird");

        
        
        //    for(String i : animals) {                     // for-each loop me parenthesis me data type dal dena aur colon aayega aur direct i print hoga
        //     System.out.println(i);
        // }


    }
}
