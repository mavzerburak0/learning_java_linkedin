public class BankAccount {
    private int accountNumber;
    private int accountBalance;

    public BankAccount(int inputAccountNumber, int inputAccountBalance) {

        this.accountNumber = inputAccountNumber;
        this.accountBalance = inputAccountBalance;
        System.out.println("You created an account with " + this.accountNumber + " account number"
        + " and deposited " + this.accountBalance + "€ in it.");

    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void depositMoney(int addMoney) {
        if (addMoney <= 0) {
            System.out.println("You can only deposit 1€ or above.");
        } else {
            this.accountBalance += addMoney;
            System.out.println(addMoney + "€ deposited to your account.");
            System.out.println("You now have " + this.accountBalance + "€ in your account.");
        }
    }

    public void withdrawMoney(int removeMoney) {
        if (removeMoney > this.accountBalance) {
            System.out.println("You cannot withdraw more than" +
                    " what is in your account");
        }
        else {
            this.accountBalance -= removeMoney;
            System.out.println(removeMoney + "€ has been withdrawn from " +
                    this.accountNumber);
            System.out.println("You now have " + this.accountBalance + "€ in " +
                    this.accountNumber);
        }
    }

}
