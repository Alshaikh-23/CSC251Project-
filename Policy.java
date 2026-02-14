public class Policy {

   //instant fillds 
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   
   
   // default constructor 
   public Policy()   
   {
   policyNumber= 0;
   providerName ="";
   firstName = " ";
   lastName = " ";
    age = 0;
   smokingStatus= "";
   height = 0.0;
   weight = 0.0;
}
   //  constructor that accpet arguments 
   
   
  public Policy (int policyNumber,String providerName , String firstName , String lastName , int age ,
  String smokingStatus , double height , double weight) {
  
  
  this.policyNumber= policyNumber ;
  this.providerName = providerName;
  this.firstName = firstName;
  this.lastName = lastName;
  this.age =  age ;
  this.smokingStatus=  smokingStatus ;
  this.height = height ;
  this.weight =  weight ;

   }
   
   //getters 
   
   public int getPolicyNumber(){
    return  policyNumber;
    
    }
    public String getProviderName(){
    return providerName;
    }
    public String getFirstName(){
    return firstName;
    }
    public String getLastName(){
    return lastName;
    }
    public int getAge(){
    return age;
    }
    public String getSmokingStatus(){
    return smokingStatus;
    }
    public double getHeight(){
    return height;
    }
    public double getWeight(){
    return weight;
    }
  
  
  
  
   //setters
   
   
   
 public void  setPolicyNumber(int policyNumber){
   this.  policyNumber =policyNumber;
   }
 public void setProviderName(String providerName){
  this.providerName = providerName;
  }
  public void setFirstName(String firstName){
  this.firstName = firstName;
  }
  public void setLastName(String lastName){
  this.lastName = lastName;
  }
  public void setAge( int age ){
  this. age = age;
  }
  public void setSmokingStatus( String smokingStatus){
  this.smokingStatus = smokingStatus;
  }
  public void setHeight( double hieght){
  this.height = height;
  }
  public void setWeight( double weight){
  this.weight = weight;
  }
  // calculate the BMI
  public double calculateBMI()
    {
        return (weight * 703) / (height * height);
    }

    // Calculate Insurance Price 
    
    public double calculatePolicyPrice()
    
    {
    
       double price = 600.0;
       
      
 if (age > 50)
       
    price += 75.0;
        
        
 if(smokingStatus.equalsIgnoreCase("smoker")){
         
     price = 100.0;
             }
             
double bmi = calculateBMI();

  if(bmi > 35){
  price += (bmi - 35) * 20;
           }
        return price;
        
}
 
 }             

  
    
