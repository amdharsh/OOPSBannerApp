/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 *
 * @author Developer
 * @version 4
 */

// Extend the user story 3 to further develop the OOPS Banner Application
// by using String arrays to hold banner lines and printing them in a loop.
// This use case improves upon UC3 by using a String array to store banner lines
// and iterating through them with a for-each loop, eliminating hardcoded print
// statements and improving modularity and reusability.

// Hint: ...

public class OOPSBannerApp 
{
    public static void main(String[] args) 
    {
        String line[] = new String[7];
        line[0]=String.join(" ","   *   " ,"   " ,"   *   " , "   " , " * *  " , "   " , "   *** ");
        line[1]=String.join(" "," *   * " , "   " , " *   * " , "   " , " *   *" , "   " , " **      ");
        line[2]=String.join(" ","*     *" , "   " , "*     *" , "   " , " *   *" , "   " , "**       ");
        line[3]=String.join(" ","*     *" , "   " , "*     *" , "   " , " * *  " , "   " , "  ***  ");
        line[4]=String.join(" ","*     *" , "   " , "*     *" , "   " , " *     " , "   " , "      * ");
        line[5]=String.join(" "," *   * " , "   " , " *   * " , "   " , " *     " , "   " , " *   **");
        line[6]=String.join(" ","   *   " , "   " , "   *   " , "   " , " *     " , "   " , "  ** ");
        for(int i=0;i<=6;i++)
            System.err.println(line[i]);
    }

}