import java.util.ArrayList;
import java.util.Scanner;
public class Cheeze extends FastFood implements Food{
    Scanner in = new Scanner(System.in);
    private int sum = 0;
    POSTRE postr = new POSTRE();
    public Cheeze() {
        dishes = new ArrayList<>();
        orders = new ArrayList<>();
        species = new ArrayList<>();
        combos = new ArrayList<>();
        drinks = new ArrayList<>();
        combos.add(new Combos("Cheeseburger combo", "Cheeseburger", "Fries", "Cola 0.5", 2300));
        combos.add(new Combos("Beef combo", "Beef burger", "Fries", "Cola 0.5", 2100));
        combos.add(new Combos("Chicken combo", "Chicken burger", "Fries", "Fanta 0.5", 2000));
        dishes.add(new Dishes("Cheeseburger", 1500, 170));
        dishes.add(new Dishes("Beef burger", 1300, 150));
        dishes.add(new Dishes("Chicken burger", 1200, 149));
        drinks.add(new Drinks("Cola", 0.5, 350));
        drinks.add(new Drinks("Fanta", 0.5, 350));
        drinks.add(new Drinks("Water", 0.5, 250));
        species.add(new Specialties("Fries", "120gr", 650));
    }
    @Override
    public void menu() {
        while(1 == 1) {
            System.out.println("1.Combos\n2.Burgers\n3.Snacks\n4.Drinks\n0.Close menu");
            int chmeal = in.nextInt();
            System.out.println("Choose one of those");
            int ind = 0;
            if (chmeal == 0) break;
            else if(chmeal == 1) {
                for(Combos cm: combos) {
                    ind ++;
                    System.out.println(ind + "." + cm.getInfo());
                }
                System.out.println("Which one?\n0 - To leave");
                while(2 == 2) {
                    int chch = in.nextInt();
                    if (chch == 0) break;
                    if(chch > combos.size()) {System.out.println("From 0 to 3"); continue;}
                    orders.add(new Orders(combos.get(chch - 1).getName(), combos.get(chch - 1).getCost()));
                    sum += combos.get(chch - 1).getCost();
                    System.out.println("Overall cost is - " + sum + "\nAnything else? 0 - To leave");
                }
            }
            else if(chmeal == 2) {
                for(Dishes ds: dishes) {
                    ind ++;
                    System.out.println(ind + "." + ds.getInfo());
                }
                System.out.println("Which one?\n0 - To leave");
                while(2 == 2) {
                    int chch = in.nextInt();
                    if (chch == 0) break;
                    if(chch > dishes.size()) {System.out.println("From 0 to 3"); continue;}
                    orders.add(new Orders(dishes.get(chch - 1).getName(), dishes.get(chch - 1).getCost()));
                    sum += dishes.get(chch - 1).getCost();
                    System.out.println("Overall cost is - " + sum + "\nAnything else? 0 - To leave");
                }
            }
            else if(chmeal == 3) {
                System.out.println("1." + species.get(0).getInfo());
                System.out.println("1 - To buy\n0 - To leave");
                while(2 == 2) {
                    int chch = in.nextInt();
                    if (chch == 0) break;
                    if(chch > species.size()) {System.out.println("From 0 to 1"); continue;}
                    orders.add(new Orders(species.get(chch - 1).getName(), species.get(chch - 1).getCost()));
                    sum += species.get(chch - 1).getCost();
                    System.out.println("Overall cost is - " + sum + "\n1 - To buy more? 0 - To leave");
                }
            }
            else if(chmeal == 4) {
                for(Drinks dr: drinks) {
                    ind ++;
                    System.out.println(ind + "." + dr.getInfo());
                }
                System.out.println("Which one?\n0 - To leave");
                while(2 == 2) {
                    int chch = in.nextInt();
                    if (chch == 0) break;
                    if(chch > drinks.size()) {System.out.println("From 0 to 3"); continue;}
                    orders.add(new Orders(drinks.get(chch - 1).getName(), drinks.get(chch - 1).getCost()));
                    sum += drinks.get(chch - 1).getCost();
                    System.out.println("Overall cost is - " + sum + "\nAnything else? 0 - To leave");
                }
            }
        }
    }

    @Override
    public void removing() {
        while(1 == 1) {
            int ind = 0;
            for (Orders or : orders) {
                ind++;
                System.out.println(ind + "." + or.getInfo());
            }
            System.out.println("Overall is - " + sum + "\n0 - To leave");
            int chrem = in.nextInt();
            if(chrem == 0) break;
            System.out.println(orders.get(chrem - 1).getName() + " was removed!");
            sum -= orders.get(chrem - 1).getCost();
            orders.remove(chrem - 1);

        }
    }

    @Override
    public int payment(String name) {
        System.out.println("Here's your basket!");
        for(Orders ord: orders) {
            System.out.println(ord.getInfo());
        }
        System.out.println("Overall payment is - " + sum + "tg.");
        System.out.println("1 - Pay\n0 - Leave");
        int chpayment = in.nextInt();
        if(chpayment == 1) {
            postr.add(name, sum, "Cheezeburgeer");
            postr.add1(name, sum);
            orders.clear();
            sum = 0;
        }
        return chpayment;

    }
}
