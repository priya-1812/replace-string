/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replace.string;
import java.util.Scanner;
public class ReplaceString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        s=s.replace(".","*");
        s=s.replace(",","*");
         System.out.println(s);
            
        
    }
    
}
