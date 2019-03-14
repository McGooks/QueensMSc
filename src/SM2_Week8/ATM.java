package SM2_Week8;

public class ATM {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        CustomerDepositThread customerDepositThread = new CustomerDepositThread(bankAccount);
        Thread threadForDeposit = new Thread(customerDepositThread,"Deposit: ");
        CustomerWithdrawThread customerWithdrawThread = new CustomerWithdrawThread(bankAccount);
        Thread threadForWithdrawl = new Thread(customerWithdrawThread, "Withdraw: ");
        System.out.println("Main Thread Balance: " + bankAccount.balance);

        threadForDeposit.start();
        threadForWithdrawl.start();

        try{
            Thread.sleep(4000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Main Thread Balance: " + bankAccount.balance);
        System.out.flush();

    }
}
