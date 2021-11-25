public class CreditAccount extends Account {
    public CreditAccount(int amount, String accountName) {
        super(amount, accountName);
    }

    @Override
    void pay(int amount) {
        int thisTempAmount = getAmount();
        setAmount(getAmount() - amount);
        System.out.printf("%d $ marked off %s; %d $-> %d $ %n",
                amount, getAccountName(), thisTempAmount, getAmount());
    }

    @Override
    void transfer(Account account, int amount) {
        int thisTempAmount = getAmount();
        setAmount(getAmount() - amount);
        System.out.printf("%d $ marked off %s; %d $-> %d $ %n",
                amount, getAccountName(), thisTempAmount, getAmount());
        account.addMoney(amount);
    }

    @Override
    int addMoney(int amount) {
        if ((getAmount() + amount) > 0) {
            int thisTempAmount = getAmount();
            System.out.printf("%s's can't be positives%n",
                    getClass().getSimpleName());
            int freeMoney = amount + getAmount();
            setAmount(0);
            System.out.printf("%d $ settled an %s; %d $-> %d $ %n" +
                            "%d $ for return%n",
                    -thisTempAmount, getAccountName(),
                    thisTempAmount, getAmount(), freeMoney);
            return getAmount(super.addMoney(11));
        } else {
            int thisTempAmount = getAmount();
            setAmount(getAmount() + amount);
            System.out.printf("%d $ settled an %s; %d $-> %d $ %n",
                    amount, getAccountName(), thisTempAmount, getAmount());
        }
        return 0;
    }
}
