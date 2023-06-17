import java.util.Scanner;
import java.util.ArrayList;
public class JohnsPapa extends FastFood implements Food {
    Scanner in = new Scanner(System.in);
    POSTRE postr = new POSTRE();
    private int sum = 0;
    public JohnsPapa() {
        dishes = new ArrayList<>();
        orders = new ArrayList<>();
        drinks = new ArrayList<>();
        combos = new ArrayList<>();
        dishes.add(new Dishes("Pepperoni", 2400, 160));
        dishes.add(new Dishes("Margarita", 2200, 150));
        dishes.add(new Dishes("Cheese Pizza", 2000, 165));
        combos.add(new Combos("Favourties", "Pepperoni", "Chicken-Mushroom", "Cheese Pizza", "Cola", 6700));
        combos.add(new Combos("Scolarship in 30 days", "Margarita", "4 Seasons", "Fanta", 4500));
        drinks.add(new Drinks("Cola", 0.5, 500));
        drinks.add(new Drinks("Sprite", 0.5, 500));
        drinks.add(new Drinks("Water", 0.5, 400));
    }
    @Override
    public void menu() {
        while (1 == 1) {
            System.out.println("1.Combos\n2.Pizza\n3.Drinks\n0.Close menu");
            int chmeal = in.nextInt();
            System.out.println("Choose one of those");
            int ind = 0;
            if (chmeal == 0) break;
            else if (chmeal == 1) {
                for (Combos cm : combos) {
                    ind++;
                    System.out.println(ind + "." + cm.getInfo());
                }
                System.out.println("Which one?\n0 - To leave");
                while (2 == 2) {
                    int chch = in.nextInt();
                    if (chch == 0) break;
                    if (chch > combos.size()) {
                        System.out.println("From 0 to 2");
                        continue;
                    }
                    orders.add(new Orders(combos.get(chch - 1).getName(), combos.get(chch - 1).getCost()));
                    sum += combos.get(chch - 1).getCost();
                    System.out.println("Overall cost is - " + sum + "\nAnything else? 0 - To leave");
                }
            }
            else if (chmeal == 2) {
                for (Dishes ds : dishes) {
                    ind++;
                    System.out.println(ind + "." + ds.getInfo());
                }
                System.out.println("Which one?\n0 - To leave");
                while (2 == 2) {
                    int chch = in.nextInt();
                    if (chch == 0) break;
                    if (chch > dishes.size()) {
                        System.out.println("From 0 to 3");
                        continue;
                    }
                    orders.add(new Orders(dishes.get(chch - 1).getName(), dishes.get(chch - 1).getCost()));
                    sum += dishes.get(chch - 1).getCost();
                    System.out.println("Overall cost is - " + sum + "\nAnything else? 0 - To leave");
                }
            }
            else if (chmeal == 3) {
                for (Drinks dr : drinks) {
                    ind++;
                    System.out.println(ind + "." + dr.getInfo());
                }
                System.out.println("Which one?\n0 - To leave");
                while (2 == 2) {
                    int chch = in.nextInt();
                    if (chch == 0) break;
                    if (chch > drinks.size()) {
                        System.out.println("From 0 to 3");
                        continue;
                    }
                    orders.add(new Orders(drinks.get(chch - 1).getName(), drinks.get(chch - 1).getCost()));
                    sum += drinks.get(chch - 1).getCost();
                    System.out.println("Overall cost is - " + sum + "\nAnything else? 0 - To leave");
                }
            }
            else {
                System.out.println("Only from 0 to 3");
            }
        }
    }
    @Override
    public void removing() {
        while(1 == 1) {
            int ind = 0;
            for (Orders or : orders) {
                ind ++;
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
            postr.add(name, sum, "Johns Papa");
            postr.add3(name, sum);
            orders.clear();
            sum = 0;
        }
        return chpayment;
    }
}
