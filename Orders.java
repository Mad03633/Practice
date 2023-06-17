public class Orders {
    private String name;
    private int cost;
    public Orders(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    public String getInfo() {
        return this.name + " - " + this.cost + "tg.";
    }
    public String getName() {
        return this.name;
    }
    public int getCost() {
        return this.cost;
    }
}
