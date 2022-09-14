public class Main {
    public static void main(String[] args) {
  //public = metod , Main = objekt,

     Account salaryAccount = new Account();
     //1
     Account savingAccount = new Account(1000);
     //1

     salaryAccount.deposit(100);
     savingAccount.deposit(200);


     Double money = salaryAccount.withdraw(5000.0);
     System.out.println(money);

     System.out.println(salaryAccount.getBalance());
     System.out.println(savingAccount.getBalance());

    }
}