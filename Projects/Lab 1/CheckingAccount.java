/*
 * CheckingAccount.java
 *
 */

public class CheckingAccount extends Account{
    
    /** Creates a new instance of CheckingAccount using super */
    public CheckingAccount(Customer customer) {
      super(customer);
      this.customer = customer;
    }

    /***********************************************
     * Adds amount to balance
     * pre: amount must be a positive value
     * post: balance increases in amount value
     * @param amount double Deposit amount
     * @return double New account balance
     * add a new transaction to the transaction array. Use the customer number, 0 trantype, amount, and fee "DEP"
     * add the amount to the balance
     * add one to the tranIndex
     * return the balance
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
    //addInterest(balance);
    tranIndex++;
    return balance;
  }
 }
   @Override
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
     * Substracts amount from balance
     * pre: amount must be a positive value
     * post: balance decreases in amount value
     * @param amount double Withdrawal amount
     * @return double New account balance
     * create a new transaction and added to the transaction list. The new transaction will have the customer number, trantype = 0, amount = 0 , fees "CR"
     * add charge for using checking account to the amount from customer get check charge
     * if the amount is greater than the balance add and overdraft penalty fee from the customer overdraft penalty.
     * subtract the amount from the balance and return the balance, remeber to add 1 to the tranIndex
     */
    // @Override
    // public double withdrawal(double amount){

    // }

    /***********************************************
     * Adds amount to balance
     * pre: amount must be a positive value
     * post: balance increases in amount value
     * @return double New account balance
     * amount = balance * customer's check interest
     * save the transation in to the transactions[tranIndex] as new transaction with customer number, trantype = 0, amount, and fees "INT"
     * add the amount to the balance and return the balance
     */    
    public double addInterest(double balance){
  double amount1 = balance * this.customer.getCheckInterest();
  
  transactions[tranIndex] = new Transaction(this.customer.getCustomerNumber(), 0, amount1, "INT");
   balance = amount1 + balance;
   tranIndex++;
   return balance;
    }
}