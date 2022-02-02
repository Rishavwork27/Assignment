//Assignment 2: Replace the words of the String entered by the user if it contains any bad words.
package Assignments;
import java.util.ArrayList;
import java.util.Scanner;
public class Assignment_2 {
    ArrayList<String> collection = new ArrayList<String>();
    void collectData(){
        collection.add("Idiot");
        collection.add("Stupid");

         System.out.println(collection);
    }
    public void check() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String ris = sc.nextLine();
        for (String e : collection) {
            ris=ris.replace(e, "#####");
        }
        System.out.println(ris);
    }

    public static void main(String[] args) {
        Assignment_2 object = new Assignment_2();
        object.collectData();
        object.check();
    }
}
