import java.util.Scanner;
public class project1part2 {
      public static void main(String[] args){
        System.out.println("Enter a 4 bit binary number");
        Scanner keyboard = new Scanner (System.in);
        String binary = keyboard.nextLine();
        int b = Integer.parseInt(binary,2);
        System.out.println(b);  
      }
}    
