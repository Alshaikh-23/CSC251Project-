public class PolicyHolder {

    //fields 
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;
    
    // default costructor 
    public PolicyHolder(){
    
     firstName = "";
     lastName = "";
     age = 0;
     smokingStatus = "";
     height = 0.0;
      weight = 0.0;
      }
      
          /*constructor that accept argument
          @param firstname
          @param lastName
          @param age
          @param smokingStatus
          @param height
          @param weight
          */
          
    public PolicyHolder(String firstName, String lastName, int age,
                        String smokingStatus, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Getters
    /*
    getFirstName method
    @return first Name 
    */
    public String getFirstName() {
     return firstName;
      }
      /*
      getLastName method
      @return Last name
      */
    public String getLastName() { 
    return lastName; 
      }
      /*
      getAge method
      @return age
      */
    public int getAge() { 
    return age;
     }
     /*
     getSomkingStatus method
     @return SomkingStatus
     */
    public String getSmokingStatus()
     { return smokingStatus;
      }
      /*
      getHeight Method
      @return height
      */
    public double getHeight() 
    { return height; 
       }
       /*
       getWeight Method
       @return height
       */
    public double getWeight() 
    { return weight; 
       }

    // BMI calculation
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    // toString Method to display Info
    public String toString() {
        return "Policyholder: " + firstName + " " + lastName +
               "\nAge: " + age +
               "\nSmoking Status: " + smokingStatus +
               "\nHeight: " + height +
               "\nWeight: " + weight +
               "\nBMI:$ "+ String.format("%.2f",calculateBMI());
               
              
    }
}