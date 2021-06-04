
public class TestAccount {
    public static void main(String[]args){
        Account acc = new Account();

        acc.setID(1122);
        acc.setBalance(20000);
        acc.setAnnualInterestRate(.045);
        acc.withdraw(2500);
        acc.deposit(3000);
        System.out.print(acc);
    }
}
