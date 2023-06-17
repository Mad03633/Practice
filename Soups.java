public class Soups {
    private String name;
    private double vol;
    private int cost;
    public Soups(String name, double vol, int cost) {
        this.name = name;
        this.vol = vol;
        this.cost = cost;
    }
    public String getInfo() {
        return "[" + this.name + "]\n" + this.vol + "gr " + this.cost + "tg.";
    }
    public String getName() {
        return this.name;
    }
    public int getCost() {
        return this.cost;
    }
}
