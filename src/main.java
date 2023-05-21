public class main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println("Hello World!");

        System.out.println("\t\"Hello World!\"");
        //   \t matlab thodi jagah chhod ke print hoga
        //  \ dalke double qoutes dala tabhi doube quotes print hoga
        //  \ ek escape sequence hai uske baad jo bhi dalega usko compiler specially treat karega

        // int x = 123;
        // double y = 423.42311243;
        // boolean z = false;
        
        // System.out.println(y);

        // ========================

        String x = "water";
        String y = "Rasna";
        String z;

        z = x;
        x = y;
        y = z;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
