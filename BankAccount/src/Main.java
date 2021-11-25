public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount
                (2600, "SavingsAcnt#1");
        CheckingAccount checkingAccount = new CheckingAccount
                (2900, "CheckingAcnt#1");
        CreditAccount creditAccount = new CreditAccount
                (0, "CreditAcnt#1");

//        savingsAccount.transfer(checkingAccount, 100);
//        savingsAccount.addMoney(50);
//        setApart();//***********************************
        checkingAccount.transfer(creditAccount, 1300);
        checkingAccount.pay(100);
        checkingAccount.addMoney(250);
//        setApart();//*************************************
//        creditAccount.transfer(checkingAccount, 200);
//        creditAccount.pay(300);
//        creditAccount.addMoney(5150);
    }

    public static void setApart() {
        for (int i = 0; i < 50; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
