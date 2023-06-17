import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cheeze cheeze = new Cheeze();
        CoffeeDoom coffee = new CoffeeDoom();
        JohnsPapa johns = new JohnsPapa();
        System.out.println("Welcome to Madiyar's!" + "\n" + "Please enter your name!");
        String name = in.nextLine();
        System.out.println("Hello " + name + "!");
        while(1 == 1) {
            System.out.println("Here's the list of our restaurants!");
            System.out.println("1.Cheezeburgeer");
            System.out.println("2.Coffee Doom");
            System.out.println("3.John's Papa");
            System.out.println("Enter the numeration of restaurant." + "\n" + "Type 0 to leave!");
            int chrest = in.nextInt();
            if(chrest < 0 || chrest > 3) {
                System.out.println("From 0 to 10!");
                continue;
            }
            else if(chrest == 0) {
                System.out.println("Thanks for coming!");
                break;
            }
            while(2 == 2) {
                System.out.println("1.See the menu");
                System.out.println("2.Order");
                System.out.println("3.Remove");
                System.out.println("4.Leave");
                int chaction = in.nextInt();
                if(chaction > 4 || chaction < 0) {
                    System.out.println("From 1 to 4!");
                    continue;
                }
                if(chaction == 4) {
                    System.out.println("Bye!");
                    break;
                }
                else if(chrest == 1) {
                    if(chaction == 1) {
                        cheeze.menu();
                    }
                    else if(chaction == 2) {
                        if(cheeze.payment(name) == 1) {
                            System.out.println("Payment Accepted! Thanks for visiting Cheezeburgeer");
                            break;
                        }
                        else {
                            System.out.println("Okay...");
                        }
                    }
                    else if(chaction == 3) {
                        cheeze.removing();
                    }
                }
                else if(chrest == 2) {
                    if(chaction == 1) {
                        coffee.menu();
                    }
                    else if(chaction == 2) {
                        if(coffee.payment(name) == 1) {
                            System.out.println("Payment Accepted! Thanks for coming!");
                        }
                        else {
                            System.out.println("Okay...");
                        }
                    }
                    else if(chaction == 3) {
                        coffee.removing();
                    }
                }
                else if(chrest == 3) {
                    if(chaction == 1) {
                        johns.menu();
                    }
                    else if(chaction == 2) {
                        if(johns.payment(name) == 1) {
                            System.out.println("Payment Accepted! Thanks for coming!");
                            break;
                        }
                        else {
                            System.out.println("Okay...");
                        }
                    }
                    else if(chaction == 3) {
                        johns.removing();
                    }
                }
            }
        }
        }
}