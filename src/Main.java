import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                                    /*char can only store a single character
                                    and is used to keep the last key pressed by a user in game or to keep the last single digit
                                    used in a menu option.
                                     char primitive type occupies two bytes of memory or 16bits
                                     and will allow you to store unicode characters
                                     unicode is an international encoding standard for use with
                                     different languages and scripts.
                                     Char can represent one of 65.535 different types of characters

                                     Unicode character is comprised of a code we key into intelliJ
                                     unicode-table.com for the character table
                                     Row - Collumn
                                     */
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println("Unicode Character u0044 = " + myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println("Copyright Character = " + myCopyrightChar);

        /* Boolean primitive type only has 2 values, which is either
        "True" or "False", "Yes" or "No", "1" or "0".
         */

        System.out.println("");
        Scanner NewScanner = new Scanner(System.in);
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
        System.out.println("Are you over 21 years of age, Yes or No?");
        String yes = NewScanner.nextLine();


        if (yes == "yes" ) {
            System.out.println("That's good for you! Enjoy our glorious site");
        }


    }
}
