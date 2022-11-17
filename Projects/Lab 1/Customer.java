/*
 * Customer.java
 *
 */
abstract class Customer {
  String name, address, telephoneNumber, customerNumber;
  int age;
  protected int custNumber = 0;


 /** Creates a new instance of Customer */
  public Customer(String cName, String cAddress, int cAge, String cPhoneNumber){
    this.name = cName;
    this.address = cAddress;
    this.age = cAge;
    this.telephoneNumber = cPhoneNumber;
  }
  public abstract String getType();
  
  public String getName(){
    return this.name;
  }
  public String getAddress(){
    return this.address;
  }
  public int getAge(){
    return this.age;
  }
  public String getTelephoneNumber(){
    return this.telephoneNumber;
  }
  public String getCustomerNumber(){
    return this.customerNumber;
  }
  public void setCustomerName(String name){
    this.name = name;
  }
  public void setCustomerAddress(String address){
    this.address = address;
  }
  public void setCustomerAge(int age){
    this.age = age;
  }
  public void setCustomerTelephoneNumber(String name){
    this.name = name;
  }
  public void setCustomerNumber(String name){
    this.name = name;
  }
  public abstract double getSavingsInterest();
  
  public abstract double getCheckInterest();
    
  
  public abstract double getCheckCharge();
    
  
  public abstract double getOverdraftPenalty();
  


 

 /**
 * Return the type of customer.
 * @return the type of customer
 */


 /*******************************************
 * Returns customer's name
 * @return String customer's name
 */


 /*******************************************
 * Returns customer's address
 * @return String customer's address
 */


 /*******************************************
 * Returns customer's age
 * @return int customer's age
 */


 /*******************************************
 * Returns customer's phone number
 * @return String customer's phone number
 */


 /*******************************************
 * Returns customer's number
 * @return String customer's number
 */


 /*******************************************
 * Changes customer's name
 * pre: name must be a not null string
 * post: customer's name changes to name
 * @param name New name
 */


 /*******************************************
 * Changes customer's address
 * pre: address must be a not null string
 * post: customer's address changes to address
 * @param address New address
 */


 /*******************************************
 * Changes customer's age
 * pre: age must be a positive value
 * post: customer's age changes to age
 * @param age New age
 */


 /*******************************************
 * Changes customer's phone number
 * pre: phone number must be a not null string
 * post: customer's phone number changed to phoneNumber
Programming Project Solutions
 * @param phoneNumber New number
 */


 /*******************************************
 * Changes customer's number
 * pre: customerNumber must be a not null string
 * post: customer's number changes to customerNumber
 * @param customerNumber New customer number
 */

}