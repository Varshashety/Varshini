import java.util.*;
public class AutomatedTellerMachine{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int balance=10000,Deposit,Withdraw;
 int user;
 do
 { System.out.println("ATM Machine");
  System.out.println("Choose 1 for Deposit:");
  System.out.println("Choose 2 for Withdraw:");
  System.out.println("Choose 3 for Check Balance:");
  System.out.println("Choose 4 for Exit:");
  System.out.println("Choose the Operation :");
   user=sc.nextInt();
  switch(user)
  {
    case 1:
        System.out.println("Enter Money to be Deposited:");
        Deposit=sc.nextInt();
        balance=balance+Deposit;
        System.out.println("your Money has been successfully deposited :"+balance);
        System.out.println();
        break;
    case 2:
        System.out.println("enter ammount to Withdarw:");
        Withdraw=sc.nextInt();
        if(balance>=Withdraw)
         {
           balance=balance-Withdraw;
           System.out.println("your upadated balance is "+balance);

          }
         else
         {
          System.out.println("insufficint funds....!");
          }
            System.out.println();
           break;
    case 3:
        System.out.println("balance is:"+balance);
        System.out.println();
        break;
    case 4:
        System.out.println("");
		break;
    default:
        System.out.println("Enter valid options(1/2/3/4)");
  }     
 }while(user<5);
}
}
