import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount myBankAcc = new BankAccount(123456, 50);

        myBankAcc.depositMoney(50);

        myBankAcc.withdrawMoney(75);

        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        myBankAcc.depositMoney(money);

    }

}
