import java.util.*;

public class tasksheet114 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        
        int checkValue ;
        String message ; 
        System.out.println("Odd or even identifier");
        System.out.println("Enter a number ");
        checkValue= scan.nextInt();

        syntax: message=(checkValue%2==0 )?checkValue+" "+"is even number":checkValue+" "+"is odd number";
        System.out.println(message);



    }

}