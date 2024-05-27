package school.redrover.lecture20;

import school.redrover.lecture20.bank.*;

public class Main {
    private static String debitFromAccount(Account acct, double amt) {
        try {
            acct.debit(amt);
            return "Ok";
        } catch (InsufficientFundsException e) {
            return "Not enough money";
        } catch (AccountDeactivatedException e) {
            return "Account is not active";
        } catch (BankingException e) {
            return e.getMessage();
        }
    }

    private static int divideInts(int a, int b) {
//        throw new RuntimeException("Something else");
//        try {
//            throw new RuntimeException();
            return a / b;
//        } catch (ArithmeticException e) {
//            return 0;
//        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println(divideInts(a, b));
        } catch (ArithmeticException e) { // от потомка к родителю
            if (e.getMessage().equals("/ by zero"))
                System.out.println("Can't divide by zero");
            else {
                System.out.println("Some other arithmetic problem");
            }
        } catch (RuntimeException e ) {
            System.out.println("There was a runtime exception");
            e.printStackTrace();
        } catch (Throwable t) {
            t.printStackTrace();
        }

        System.out.println("==============");
        /*
        Call stack
        Stack trace
        Stack
        FILO - first in last out
         */

        Account account = new Account();
        try {
            System.out.println(account.getBalance());
            account.credit(100);
            System.out.println(account.getBalance());
            account.deactivate();
            System.out.println(debitFromAccount(account, 90));
    //        account.debit(90);
            System.out.println(account.getBalance());
            account.activate();
            System.out.println(debitFromAccount(account, 200));
            System.out.println(account.getBalance());
            account.debit(300);
        } catch (SomethingIsReallyWrongException e) {
            e.printStackTrace();
        }

    }
}
