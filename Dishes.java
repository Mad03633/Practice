public class Dishes {
    private String name;
    private int cost;
    private int cal;
    public Dishes(String name, int cost, int cal) {
        this.name = name;
        this.cost = cost;
        this.cal = cal;
    }
    public String getInfo() {
        return "[" + this.name + "]\n" + this.cal + "cal " + this.cost + "tg";
    }
    public String getName() {
        return this.name;
    }
    public int getCal() {
        return this.cal;
    }
    public int getCost() {
        return this.cost;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCal(int cal) {
        this.cal = cal;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
}
