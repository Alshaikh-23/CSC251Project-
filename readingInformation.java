import java.io.*;  // to import reading from the file class
import java.util.Scanner; // to import  Scanner.
import java.io.IOException; // for the exceptions.


  public class readingInformation{
    public static void main(String[] args) throws Exception {
       
       //variables
       int policyNumber;
       String provider;
       String firstName;
       String lastName;
       int age;
      String smokingStatus;
      double height , weight , price ;
      
       

        File file = new File("PolicyInformation.txt");  // file class to read from the file 
        Scanner input = new Scanner(file); //scanner class with file as object.

        while (input.hasNext())// use while loop to process all content inside the file 
         {
            policyNumber = input.nextInt();
            input.nextLine(); //clear buffer
             provider = input.nextLine();
            firstName = input.nextLine();
             lastName = input.nextLine(); 
             
             age = input.nextInt();
             input.nextLine(); // clear the buffer
             
             smokingStatus = input.nextLine();
             height = input.nextDouble();
            weight = input.nextDouble();
            
            //displaying the information
           
            
             System.out.println("Policy Number "  +policyNumber);
             System.out.println("Policy provider " + provider);
             System.out.println("Policy holder first name "+ firstName);
             System.out.println("policy holder last name " + lastName);
             System.out.println("Policy holder Age " +  age);
             System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + smokingStatus);
             System.out.println("Policyholder's Height: " + height);
             System.out.println("Policyholder's Weight: " + weight );
             System.out.println("");
        }

        input.close(); // close the file 
        
        }
        
        }