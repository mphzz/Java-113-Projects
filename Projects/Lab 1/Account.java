/*
 * Account.java
 *
 */
abstract class Account {

    
    /** Creates a new instance of Account, ++accNumber, balance = 0, upto 20 transactions limit, tranIndex = 0*/
  public int accNumber, tranIndex = 0;
  
  Transaction[] transactions = new Transaction[20];
  String accountNumber;
  double balance = 0;
  Customer customer;

  public Account(Customer customer){
    this.customer = customer;
    accountNumber = "90";
    this.balance = 0;
    this.tranIndex = 0;
    accountNumber = String.valueOf(++accNumber);
  }

  public int getAccNumber(){
    return this.accNumber;
  }
  public Customer getCustomer(){
    return this.customer;
  }
  public double getBalance(){
    return this.balance;
  }
  public Transaction[] getTransactions(){
    return this.transactions;
  }
  public int getTranIndex(){
    return this.tranIndex;
  }
  public String getNumber(){
    System.out.println(accountNumber + "0000");
    return this.accountNumber;
  }
  public void setNumber(String accountNumber){
    this.accountNumber = accountNumber;
  }
  public void setAccNumber(int accNumber){
    this.accNumber = accNumber;
  }
  public void setBalance(double balance){
    this.balance = balance;
  }
  public void setTransactions(Transaction[] transactions){
    this.transactions = transactions;
  }
  public void setTranIndex(int tranIndex){
    this.tranIndex = tranIndex;
  }
  public String toString(){
    return "[Name: " + this.customer.name + ", Account Number: " + this.accountNumber + ", Account Balance: " + this.balance + ",\nYou have " + (20 - this.tranIndex) + " transactions remaining.]";
  }
  public double deposit(double amount){
    balance = balance + amount;
    return balance;
  }
  public double withdrawal(double amount){
    balance = balance - amount;
    return balance;
  }
  


    /*******************************************
     * Returns account balance
     * @return double Account balance
     */
  
  


    /*******************************************
     * Returns account owner
     * @return Customer Account owner
     */    
  

    /*******************************************
     * Returns account number
     * @return String Account number
     */    

          
    /*******************************************
     * Converts Account object to a String object
     * @return String account information as String object
     */    
    //@Override


    

    
}