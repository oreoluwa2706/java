package tdd.CHAPTER3.ClassAccount;

public class Account {

   /** (Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw that withdraws money from an Account. Ensure that the withdrawal amount does not exceed
    the Account’s balance. If it does, the balance should be left unchanged and the method should print
    a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
            (Fig. 3.9) to test method withdraw.

   private String name;
       public void setName(String name) {
           this.name = name;
        }
        public String getName(){
           return  name;

    }
    }

    */

   private String name;
   private double balance;

   public Account(String myName, double balance){
       this.name = myName;
       this.balance = balance;
   }

   public void setName(String myName){
       this.name = myName;
   }

   public String getName(){
        return name;

}

}