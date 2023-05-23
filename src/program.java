import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;

public class program{

    public static void main(String[] args){

        // String name = JOptionPane.showInputDialog("SAY MY NAME");
        // JOptionPane.showMessageDialog(null, "You are Goddamn Right.");

        // int age = Integer.parseInt(JOptionPane.showInputDialog("SAY MY AGE"));
        // JOptionPane.showMessageDialog(null, "You are Goddamn Right.");

        // double height = Double.parseDouble(JOptionPane.showInputDialog("SAY MY HEIGHT"));
        // JOptionPane.showMessageDialog(null, "You are Goddamn Right." + height + ".");

        // =================================================================================================


        // program to find hypotenuse - TYPE 1:

        // double x = Double.parseDouble(JOptionPane.showInputDialog("Enter side 1: "));

        // double y = Double.parseDouble(JOptionPane.showInputDialog("Enter side 2: "));

        // JOptionPane.showMessageDialog(null, "Hypotenuse is " + Math.sqrt(x*x + y*y));

        // =================================================================================================

        // program to find hypotenuse - TYPE 2:

        // double x;
        // double y;
        // double z;

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter Side 1: ");
        // x = scanner.nextDouble();

        // System.out.println("Enter Side 2: ");
        // y = scanner.nextDouble();

        // z = Math.sqrt((x*x) + (y*y));
        // System.out.println("Hypo is " + z);

        // scanner.close();

        // =================================================================================================

        // Random random = new Random();

        // int x = random.nextInt(6)+1;
        // boolean y = random.nextBoolean();

        // System.out.println(y);

        // =================================================================================================


        // int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age."));


        // if (age==20) {
        //     JOptionPane.showMessageDialog(null, "What tf are you doing with your time and your life!!!???, I dont Understand how you do not have a fire in your mind that is compelling you to conquor Earth. You got all this time and you are not doint anything with it");
        //     // System.out.println("Your can watch pron");

        //  }

        //     else if (age>=18) {
        //         JOptionPane.showMessageDialog(null, "You can watch pron" );
        //     }
            
        //  else {
        //     JOptionPane.showMessageDialog(null, "Watch Reels bro");
        //     // System.out.println("Watch reels bro");
            
        // }

        // =================================================================================================

        // String day = "Sunday";
        
        // switch(day) {
        //     case "Sunday": System.out.println("Todays sunday");
        //     break;
        //     case "Saturday": System.out.println("Todays sat");
        //     break;
        //     case "Monday": System.out.println("Todays mon");
        //     break;
        //     default: System.out.println("Todays a PIZZA DAY!!!");

        // }
        

        // =================================================================================================

        // int temp = 2;

        // if(temp>=35) {
        //     System.out.println("Its hot");
        // }

        // else if (temp>=25 && temp<35) {
        //     System.out.println("Normal NOrmal");
        // }

        // else {
        //     System.out.println("Cold hai");
        // }

        // =================================================================================================

        Scanner scanner = new Scanner(System.in);

        System.out.println("Your are playing a gane. Press q or Q to quit the game!");
        String response = scanner.next();

        if (!response.equals("Q") && !response.equals("q")) {
            System.out.println("You quit the game!");                              // and: &&,    or: ||,    not: !
        }

        else {
            System.out.println("You are still playing the game 'Pew Pew'");
        }



}
}