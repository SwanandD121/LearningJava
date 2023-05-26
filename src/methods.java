import java.util.Scanner;

public class methods {

    static Scanner scanner = new Scanner(System.in);

    {print();}
    public static int s = scanner.nextInt();

    public static void main(String[] args){

        // int side;
        // int side;
        // int s = side;

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter side of the square");
        // int side =  scanner.nextInt();

        System.out.println("Type a for area and p for perimeter");
        char c = scanner.next().charAt(0);

        if(c == 'a'){
            area();
        }

        else if(c == 'p'){
            peri();
        }

        
    }

    static void area(){

        // int area = s * s;
        System.out.println("Area is " + s * s);
        
    }

    static void peri(){
        int pe = s * 4;
        System.out.println("Peri is " + pe);
    }

    static void print(){
        System.out.println("Enter sied of the square: ");
    }
    
}
