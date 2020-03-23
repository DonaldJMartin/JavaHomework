import java.util.Scanner; 

public class FizzBuzz {

    public static void main(String [] args) {  
        
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt(); 
  
        // loop for 3 times
        for (int i = 0; i < cases; i++) { 
            int multiple = input.nextInt();

            if (multiple % 15 == 0)                                                  
                System.out.println("FizzBuzz" + " ");

            // number divisible by 5, print 'Buzz'  
            // in place of the number
            else if (multiple % 5 == 0)      
                System.out.println("Buzz" + " ");  
  
            // number divisible by 3, print 'Fizz'  
            // in place of the number 
            else if (multiple % 3 == 0)      
                System.out.println("Fizz" + " ");  
  
            // number divisible by 15(divisible by 
            // both 3 & 5), print 'FizzBuzz' in  
            // place of the number 
                  
            else // print the numbers 
                System.out.print(i + " ");                          
        
        } // end for loop
    } // end main method
} // end class