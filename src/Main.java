import java.util.Scanner;
public class Main {
    void accountSystem(){
        String name;
        long accountNumber;
        String ifsc;
        double amount;
        short pin;
        double creadit;
        double deposit;


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name");
        name= sc.nextLine();
        System.out.println("Enter Your Account Number");
        accountNumber= sc.nextLong();
        System.out.println("Enter your ifsc code");
        ifsc= sc.next();
        System.out.println("Enter your amount");
        amount= sc.nextDouble();
        System.out.println("Enter your pin");
        pin= sc.nextShort();

        byte choice=1;
        while(choice!= 4){
            System.out.println("Enter Your Choice:\n 1. Deposit ammount\n 2. Ceadit amount\n 3.Show balance\n 4. Exit");
            choice= sc.nextByte();
            if(choice == 1){
                System.out.println("Enter Your Deposit amount");
                deposit= sc.nextDouble();
                System.out.println("Enter your pin again");
                short tempPin= sc.nextShort();
                if(tempPin== pin){
                    if(amount>=deposit){amount= amount-deposit;
                        System.out.println("current amount: "+amount);
                    }
                    else{
                        System.out.println("you have not sufficiant amount");
                    }

                }
                else {
                    System.out.println("pin not match Enter correct pin");
                }

            }
            else if(choice==2){
                System.out.println("Enter your cradit amount");
                creadit= sc.nextDouble();
                System.out.println("Enter Your ifsc code again");
                String tempifsc= sc.next();
                if(tempifsc==ifsc){
                    amount= amount+creadit;
                    System.out.println("current amount: "+ amount);
                }
                else{
                    System.out.println("enter correct ifsc code");
                }


            }
            else if(choice==3){
                System.out.println("Enter your pin");
                short tempPin= sc.nextShort();
                if(tempPin==pin) {
                    System.out.println("total amount: "+amount);
                }
                else{
                    System.out.println(" Pin not match Enter correct pin");
                }

            }
            else if(choice==4){
                System.out.println(" you exit");
            }
            else {
                System.out.println(" enter correct choice");
            }
        }

    }

    public static void main(String[] args) {
        Main obj= new Main();
        obj.accountSystem();

    }
}