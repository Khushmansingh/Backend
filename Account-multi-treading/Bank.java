class AccountThread extends Thread {
    Account acc;

    AccountThread(Account acc){
        this.acc = acc;
    }

    public void run(){
        acc.debit();
    }
}

public class Bank{
    public static void main(String[] args) {
    
        for(int i=0;i<5;i++){
            Account acc = new Account(5000);

            for(int j=0;j<3;j++){
                AccountThread user = new AccountThread(acc);
                user.setName("User "+i+" thread "+ j);
                user.start();
            }
        }
    
    
    
    }
}