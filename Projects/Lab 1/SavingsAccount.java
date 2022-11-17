/*
 * SavingsAccount.java
 *
 */
public class SavingsAccount extends Account{

 /** Creates a new instance of SavingsAccount */
  public SavingsAccount(Customer customer){
    super(customer);
    this.customer = customer;
  }


 /***********************************************
 * Adds amount to balance
 * pre: amount must be a positive value
 * post: balance increases in amount value
 * @param amount double Deposit amount
 * @return double New account balance
 */
 @Override
 public double deposit(double amount){
// add an new transation to the array transactions with customer number, 0 trantyp, amount, fees "DEP"
  if(amount < 0){
    System.out.println("Error, deposit less than 0");
    return balance;
  }
  else{
    this.balance = balance + amount;
    addInterest(balance);
    return balance;
  }

// add the amoun to the balance

// call the addinterest method

// add one to the tranIndex

// return balance

 }

 /***********************************************
 * Substracts amount from balance
 * pre: amount must be a positive value
 * post: balance decreases in amount value
 * @param amount double Withdrawal amount
 * @return double New account balance
 */
 public double withdrawal(double amount){
   // add an new transation to the array transactions with customer number, 0 trantyp, amount, fees "CR"
   transactions[tranIndex] = new Transaction(this.customer.getCustomerNumber(), 0, amount, "CR");
   balance = balance - amount;
   tranIndex++;
   return balance;
   // subtract the amount from the balance

   // add one to the tranIndex

   // return the balance

 }
 /***********************************************
 * Adds amount to balance
 * pre: amount must be a positive value
 * post: balance increases in amount value
 * @return double New account balance
 */
 public double addInterest(double balance){
  // create an amount from the balance times the customer savings interest
  double amount1 = balance * this.customer.getSavingsInterest();
  
  transactions[tranIndex] = new Transaction(this.customer.getCustomerNumber(), 0, amount1, "CR");
   balance = amount1 + balance;
   tranIndex++;
   return balance;
  // add an new transation to the array transactions with customer number, 0 trantyp, amount, fees "CR"

   // add the amount to the balance


   // add one to the tranIndex

   // return the balance

 }
}