import java.util.Scanner;


public class project1_Alshaikh_Abdalgader
{


public static void main(String[] args){


 Scanner keyboard = new Scanner(System.in); //creating scanner class to get inputs from a user 
 
   // getting user input 
   System.out.println("please enter your policy  number ");
     int policyNumber  = keyboard.nextInt();
     
     keyboard.nextLine(); // clear buffet 
     
   System.out.println("please enter your provider Name ");
    String providerName = keyboard.nextLine();
    
    System.out.println("please enter  the Policyholder’s First Name");
     String firstName = keyboard.nextLine();
     
     System.out.println("please enter thePolicyholder’s Last Name");
      String lastName = keyboard.nextLine();
      
      System.out.println(" please enter your age ");
      int age = keyboard.nextInt();
      
    keyboard.nextLine(); // clear buffet
      
       System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker):");
        String smokingStatus = keyboard.nextLine(); 
        
       System.out.println(" please enter the Policyholder’s height:");
         double  height = keyboard.nextDouble();
       
       System.out.println("please enter the Policyholder’s weight:");
         double  weight = keyboard.nextDouble();
         
         
         //creating policy object 
      Policy p1 = new Policy(policyNumber, providerName, firstName,
                                    lastName, age, smokingStatus,
                                    height, weight);
                                    
                                    //print out the final information
                                    
              System.out.println("------Policy information-------");
              System.out.println("Policy number is : " + p1.getPolicyNumber());
              System.out.println("Provider Name is : " + p1.getProviderName());
              System.out.println("Polciy Holder first name : " + p1.getFirstName());
              System.out.println("Polciy Holder Last name : " +p1.getLastName());
              System.out.println("Policy Holder Age : " + p1.getAge());
              System.out.println("Policy Holder Smoking Status : "+ p1.getSmokingStatus());
              System.out.println("Policy Holder Height : " + p1.getHeight());
              System.out.println("Policy Holder Weight : " + p1.getWeight());
              System.out.printf("BMI : %.2f\n",p1.calculateBMI());
              System.out.printf(" Policy price : %.2f\n" , p1.calculatePolicyPrice());
 
         
         }
         }

  