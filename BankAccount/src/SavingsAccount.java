public class SavingsAccount extends Account {
    public SavingsAccount(int amount, String accountName) {
        super(amount, accountName);
    }

    @Override
    void transfer(Account account, int amount) {
        if ((getAmount() - amount) < 0) System.out.println("Not enough money");
        else {
            int thisTempAmount = getAmount();
            setAmount(getAmount() - amount);
            System.out.printf("%d $ marked off %s; %d $-> %d $ %n",
                    amount, getAccountName(), thisTempAmount, getAmount());
            account.addMoney(amount);
        }
    }

    @Override
    void addMoney(int amount) {
        int thisTempAmount = getAmount();
        setAmount(getAmount() + amount);
        System.out.printf("%d $ settled an %s; %d $-> %d $ %n",
                amount, getAccountName(), thisTempAmount, getAmount());

    }
}
