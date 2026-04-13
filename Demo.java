public class Demo {
    public static void main(String[] args) {
    //objects of Policy holder Class
        PolicyHolder h1 = new PolicyHolder("John", "Doe", 45, "smoker", 70, 200);
        PolicyHolder h2 = new PolicyHolder("Jane", "Smith", 30, "non-smoker", 65, 140);
        PolicyHolder h3 = new PolicyHolder("Mike", "Brown", 55, "smoker", 68, 220);
        PolicyHolder h4 = new PolicyHolder("Chester" ,"Williams" ,40, "smoker" ,71,300);
        
        
   // object of policy Class and passing policy holder as parameter
        Policy p1 = new Policy(1001, "State Farm", h1);
        Policy p2 = new Policy(1002, "Geico", h2);
        Policy p3 = new Policy(1003, "Progressive", h3);
        Policy p4 = new Policy(2450, "Met Life " , h4);

        Policy[] policies = {p1, p2, p3 , p4};  // arrayList of policy 
        
        //variables decalrtion 
        int smokerCount = 0;
        int nonSmokerCount = 0;
        

        for (Policy p : policies) {   // enhanced for loop to count total polcies 
            System.out.println(p); // calls toString to display ifno
            System.out.println("");
          
            if (p.getHolder().getSmokingStatus().equalsIgnoreCase("smoker"))
                smokerCount++;
            else
                nonSmokerCount++;
        }
            //displaying final info
        System.out.println("Total Policies: " + Policy.getPolicyCount());
        System.out.println("Smokers: " + smokerCount);
        System.out.println("Non-Smokers: " + nonSmokerCount);
    }
}