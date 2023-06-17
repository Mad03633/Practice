import java.util.ArrayList;
import java.util.Scanner;
public class CoffeeDoom extends FastFood implements Food {
    Scanner in = new Scanner(System.in);
    private ArrayList<Soups> soups;
    private int sum = 0;
    POSTRE postr = new POSTRE();
    public CoffeeDoom() {
        dishes = new ArrayList<>();
        soups = new ArrayList<>();
        orders = new ArrayList<>();
        species = new ArrayList<>();
        combos = new ArrayList<>();
        drinks = new ArrayList<>();
        soups.add(new Soups("Borsh", 300, 2300));
        soups.add(new Soups("Chihuya", 350, 2600));
        soups.add(new Soups("Chicken soup", 300, 2000));
        dishes.add(new Dishes("Pasta", 2700, 124));
        dishes.add(new Dishes("Pizza", 2400, 165));
        dishes.add(new Dishes("Special meal from chief(Secret)", 3600, 240));
        drinks.add(new Drinks("Mango-Marakuya", 0.4, 1400));
        drinks.add(new Drinks("Strawberry-Apple", 0.4, 1400));
        drinks.add(new Drinks("Water", 0.5, 600));
        species.add(new Specialties("TNT sauce", "30gr", 450));
        species.add(new Specialties("Ketchup", "30gr", 350));
        species.add(new Specialties("BBC", "40gr", 500));
    }
    @Override
    public void menu() {
        while (1 == 1) {
            System.out.println("1.Soups\n2.Meals\n3.Species\n4.Drinks\n0.Close menu");
            int chmeal = in.nextInt();
            System.out.println("Choose one of those");
            int ind = 0;
            if (chmeal == 0) break;
            else if (chmeal == 1) {
                for (Soups sp : soups) {
                    ind++;
                    System.out.println(ind + "." + sp.getInfo());
                }
                System.out.println("Which one?\n0 - To leave");
                while (2 == 2) {
                    int chch = in.nextInt();
                    if (chch == 0) break;
                    if (chch > soups.size()) {
                        System.out.println("From 0 to 3");
                        continue;
                    }
                    orders.add(new Orders(soups.get(chch - 1).getName(), soups.get(chch - 1).getCost()));
                    sum += soups.get(chch - 1).getCost();
                    System.out.println("Overall cost is - " + sum + "\nAnything else? 0 - To leave");
                }
            } else if (chmeal == 2) {
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
            } else if (chmeal == 3) {
                for (Specialties sp : species) {
                    ind++;
                    System.out.println(ind + "." + sp.getInfo());
                }
                System.out.println("0 - To leave");
                while (2 == 2) {
                    int chch = in.nextInt();
                    if (chch == 0) break;
                    if (chch > species.size()) {
                        System.out.println("From 0 to 3");
                        continue;
                    }
                    orders.add(new Orders(species.get(chch - 1).getName(), species.get(chch - 1).getCost()));
                    sum += species.get(chch - 1).getCost();
                    System.out.println("Overall cost is - " + sum + "\n1 - To buy more? 0 - To leave");
                }
            } else if (chmeal == 4) {
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
                postr.add(name, sum, "Coffee Doom");
                postr.add2(name, sum);
                orders.clear();
                sum = 0;
            }
            return chpayment;
    }
}
