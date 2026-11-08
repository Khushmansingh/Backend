public class Account {
    int amount;

    Account(int amount){
        this.amount = amount;
    }

    synchronized void debit(){
        System.out.println(Thread.currentThread().getName() + " -- "+amount);
        this.amount = this.amount - 10;
        System.out.println(Thread.currentThread().getName()+ " -- "+amount);
    }
}
