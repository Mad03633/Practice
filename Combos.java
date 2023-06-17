public class Combos {
    private String name;
    private String first;
    private String second;
    private String third;
    private String fourth;
    private String drink;
    private int cost;
    public Combos(String name, String first, String second, String drink, int cost) {
        this.name = name;
        this.first = first;
        this.second = second;
        this.drink = drink;
        this.cost = cost;
    }
    public Combos(String name, String first, String second, String third, String drink, int cost) {
        this.name = name;
        this.first = first;
        this.second = second;
        this.third = third;
        this.drink = drink;
        this.cost = cost;
    }
    public Combos(String name, String first, String second, String third, String fourth, String drink, int cost) {
        this.name = name;
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.drink = drink;
        this.cost = cost;
    }
    public String getInfo() {
        return "[" + this.name + "]" +  "\n" + this.first + "-" + this.second + "-" + this.drink + " Cost - " + this.cost + "tg.";
    }
    public int getCost() {
        return this.cost;
    }
    public String getDrink() {
        return drink;
    }
    public String getFirst() {
        return first;
    }
    public String getFourth() {
        return fourth;
    }
    public String getName() {
        return name;
    }
    public String getSecond() {
        return second;
    }
    public String getThird() {
        return third;
    }
    public void setDrink(String drink) {
        this.drink = drink;
    }
    public void setFirst(String first) {
        this.first = first;
    }
    public void setFourth(String fourth) {
        this.fourth = fourth;
    }
    public void setSecond(String second) {
        this.second = second;
    }
    public void setThird(String third) {
        this.third = third;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
}
