public class Policy {
  
      //fileds 
    private int policyNumber;
    private String providerName;
    private PolicyHolder holder; //instance of policy holder 
    
     // Static filed shared between all the instance of the class 
    private static int policyCount = 0;
    
    // deafult constrctor
      
       public Policy(){
        policyNumber = 0;
        providerName = "";
        }
    
      /*constructor that accepts paramter
       @policyNumber parameter
       @providerName parameter
       @holder parameter = policy holder object
       */
       
    public Policy(int policyNumber, String providerName, PolicyHolder holder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.holder = holder;
        policyCount++;
    }

    // Getters
    /*
    getPolicyNumber method
    @param policyNumber
    @return - policy Number
    */
    public int getPolicyNumber() {
     return policyNumber;
      }
      /*
      getProviderName method
      @param providerName
      @return - provider Name
      */
      
    public String getProviderName(){
      return providerName; 
       }
       /*
       getHolder method
       @erturn holder
       */
    public PolicyHolder getHolder() {
      return holder;
      }
    /*
    getPolicyCount
    @return policy count
    */
    
    public static int getPolicyCount() {
        return policyCount;
    }

    /* Insurance price calculation
     
     @return price
     */
    
    public double calculatePrice() {
        double price = 600;

        if (holder.getAge() > 50)
            price += 75;

        if (holder.getSmokingStatus().equalsIgnoreCase("smoker"))
            price += 100;

        if (holder.calculateBMI() > 35)
            price += (holder.calculateBMI() - 35) * 20;

        return price;
    }

    // toString to siplay info
    public String toString() {
        return "Policy Number: " + policyNumber +
               "\nProvider Name: " + providerName +
               "\n" + holder.toString()+
               "\nPolicy Price :$" +String.format("%.2f",calculatePrice());
    }
}