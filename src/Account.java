public class Account {
    private double balance;
     //ända set att ändra private är vi withdraw(metoder) och deposit(metoder)
     //variabel
    private String name;
    // varje objekt har ett eget namn som name eller balance

    private static int count = 0;
    //gemensam för alla konstruktör eller kan använda den


    public Account(){
        //konstruktör heter alltid samma som klassen alltså Account
        this.balance = 0.0;
       // this är kopplat till objektet som är balance
        this.count++;
    }
    public Account(double startBalance){
        this.balance = startBalance;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        balance += amount;
        //balance = balance + amount; samma sak

    }

    public double withdraw(double amount){
        if (this.balance >= amount && amount > 0){
            this.balance -= amount;
            return amount;
        }
        return 0;
    }
}
