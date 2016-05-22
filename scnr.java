import java.util.Scanner;

public class scnr {

    public static void main(String[] args) {

        //System.in means scanner reads from terminal;
        //Scanner can also read from files and shit
        Scanner io = new Scanner(System.in);

        System.out.print("Type in noun: ");
        String x = io.next();
        //the above 2 lines gets whatever the user types into terminal,
        //and sets string x equal to what they write
        System.out.println("Don't you just love " + x + " flavored jizz?");

        //the above is for strings, how can we get numbers they type in?
        System.out.print("Type in number: ");
        int datnumber = io.nextInt();
        System.out.println("Your IQ is " + datnumber + "."); 

    }
}
