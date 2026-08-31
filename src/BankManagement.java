import java.util.Scanner;

class AccountSystem
{
    String name, ifsc;
    long accountNumber;
    double amount;
    short pin;

    Scanner sc = new Scanner(System.in);

    void createAccount()
    {
        System.out.println("Enter Your Name");
        name = sc.nextLine();

        System.out.println("Enter Your Account Number");
        accountNumber = sc.nextLong();

        System.out.println("Enter Your IFSC Code");
        ifsc = sc.next();

        System.out.println("Enter Your Amount");
        amount = sc.nextDouble();

        System.out.println("Enter Your PIN");
        pin = sc.nextShort();

        System.out.println("Account Created Successfully");
    }

    void depositAmount()
    {
        System.out.println("Enter Deposit Amount");
        double deposit = sc.nextDouble();

        System.out.println("Enter Your PIN");
        short tempPin = sc.nextShort();

        if(tempPin == pin)
        {
            amount = amount + deposit;
            System.out.println("Amount Deposited Successfully");
            System.out.println("Current Balance: " + amount);
        }
        else
        {
            System.out.println("PIN Not Match");
        }
    }

    void creditAmount()
    {
        System.out.println("Enter Credit Amount");
        double credit = sc.nextDouble();

        System.out.println("Enter Your PIN");
        short tempPin = sc.nextShort();

        if(tempPin == pin)
        {
            if(amount >= credit)
            {
                amount = amount - credit;

                System.out.println("Amount Credited Successfully");
                System.out.println("Current Balance: " + amount);
            }
            else
            {
                System.out.println("Insufficient Balance");
            }
        }
        else
        {
            System.out.println("PIN Not Match");
        }
    }

    void showBalance()
    {
        System.out.println("Enter Your PIN");
        short tempPin = sc.nextShort();

        if(tempPin == pin)
        {
            System.out.println("Current Balance: " + amount);
        }
        else
        {
            System.out.println("PIN Not Match");
        }
    }

    void mainMenu()
    {
        System.out.println("\nBank Account System");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Amount");
        System.out.println("3. Credit Amount");
        System.out.println("4. Show Balance");
        System.out.println("5. Exit");
    }

    public static void main(String[] args)
    {
        AccountSystem obj = new AccountSystem();
        int choice;

        do
        {
            obj.mainMenu();

            System.out.println("Enter Your Choice");
            choice = obj.sc.nextInt();

            switch(choice)
            {
                case 1:
                    obj.createAccount();
                    break;

                case 2:
                    obj.depositAmount();
                    break;

                case 3:
                    obj.creditAmount();
                    break;

                case 4:
                    obj.showBalance();
                    break;

                case 5:
                    System.out.println("Thank You For Using Our Services");
                    break;

                default:
                    System.out.println("Enter Correct Choice");
            }
        }
        while(choice != 5);
    }
}