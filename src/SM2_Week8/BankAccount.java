package SM2_Week8;

import java.util.Random;

public class BankAccount {

    int balance = 100;

    public synchronized void deposit(long value){
        int tempBalance = this.balance;
        someComplicatedTransactionProcess();
        reportBalanceError(tempBalance);
        tempBalance = (int) (tempBalance + value);

        this.balance = tempBalance;
    }

    public synchronized void withdraw(long value){
        int tempBalance = this.balance;
        someComplicatedTransactionProcess();
        reportBalanceError(tempBalance);
        tempBalance = (int) (tempBalance -  value);
        this.balance = tempBalance;

    }

    private void reportBalanceError(int tempBalance){
        if(tempBalance != this.balance){
            System.err.println("SOMETHING WRONG WITH BALANCE DURING WITHDRAWAL!\nANOTHER THREAD HAS CHANGED IT!");
        }
    }

    private void someComplicatedTransactionProcess(){
        int randomProcessLength =  new Random().nextInt(50);
        int wasteTime = 0;
        for(int i = 0; i < randomProcessLength; i++) {
            wasteTime+=1;
        }
        randomProcessLength = wasteTime;
    }
}
