import java.util.Scanner;

public class loopie {
    
    public static void main(String[] args) {

        //=======================================
        // While loopie
        //=======================================

        // Scanner scanner = new Scanner(System.in);
        // String name = "";

        // while(name.isBlank()) {
        //     System.out.println("Enter Your name: ");
        //     name = scanner.nextLine();
        // }

        // System.out.println("Hello, " + name);

        //=======================================
        // For loopie
        //=======================================

        // for (int i = 10; i>=0; i--) {
        //     System.out.println(i);

        // }
        // System.out.println("Happy New Year!");

        //=======================================
        // Nested loopie - Loop in a loop
        //=======================================

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter number of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter Symbol to use: ");
        symbol = scanner.next();

        for (int i=1; i<=rows; i++) {
            System.out.println();
            for (int j=1; j<=columns; j++) {
                System.out.print(symbol);

        }
        scanner.close();
    }
    }
}
