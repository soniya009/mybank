import java.util.Scanner;
public class bank{
    public static void main(String[] args) {
        char answer;
        String f_holder = "Soniya";
        int f_accNumber = 101;
        int f_balance = 20000;
        String s_holder = "Tamang";
        int s_accNumber = 102;
        int s_balance = 100000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your account number: ");
        int accnumber = sc.nextInt();
        if (accnumber == f_accNumber) {
            do {

                System.out.println("---------------------------");
                System.out.println("Hamro Bank");
                System.out.println("---------------------------");
                System.out.println("1.Deposit");
                System.out.println("2.Withdraw");
                System.out.println("3.Check Balance");
                System.out.println("4.Exit");
                System.out.print("Enter the number of your choise (1,2,3,4): ");
                int choise = sc.nextInt();

                switch (choise) {
                    case (1):
                        System.out.print("How much you want to deposit: ");
                        int deposit = sc.nextInt();
                        f_balance = f_balance + deposit;
                        System.out.println("sucessfully deposit");
                        break;
                    case (2):
                        System.out.print("How much you want to widhdraw: ");
                        int withdraw = sc.nextInt();
                        f_balance = f_balance - withdraw;
                        System.out.println("Sucessfully widthdraw");
                        break;
                    case (3):
                        System.out.print(f_balance + " is your total balance");
                        break;
                    case (4):
                        System.exit(0);
                    default:
                        System.out.println("Enter a valid number");
                }

                System.out.println("Do you want to continue? (Y/N)");
                answer = sc.next().toLowerCase().charAt(0);
            } while (answer == 'y');
        }

        if (accnumber == s_accNumber) {
            do {


                System.out.println("---------------------------");
                System.out.println("Hamro Bank");
                System.out.println("---------------------------");
                System.out.println("1.Deposit");
                System.out.println("2.Withdraw");
                System.out.println("3.Check Balance");
                System.out.println("4.Exit");
                System.out.print("Enter the number of your choise (1,2,3,4): ");
                int value = sc.nextInt();
                switch (value) {
                    case (1):
                        System.out.print("How much you want to deposit: ");
                        int deposit = sc.nextInt();
                        s_balance = s_balance + deposit;
                        System.out.println("sucessfully deposit");
                        break;
                    case (2):
                        System.out.print("How much you want to widhdraw: ");
                        int withdraw = sc.nextInt();
                        s_balance = s_balance - withdraw;
                        System.out.println("Sucessfully widthdraw");
                        break;
                    case (3):
                        System.out.print(s_balance + " is your total balance");
                        break;
                    case (4):
                        System.exit(0);
                    default:
                        System.out.println("Enter a valid number");
                }


                System.out.println("Do you want to continue? (Y/N)");
                answer = sc.next().toLowerCase().charAt(0);
            } while (answer == 'y');
        }



    }
}

