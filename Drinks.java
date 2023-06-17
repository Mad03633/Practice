public class Drinks {
    private String name;
    private double vol;
    private int cost;
    public Drinks(String name, double vol, int cost) {
        this.name = name;
        this.vol = vol;
        this.cost = cost;
    }
    public String getInfo() {
        return "[" + this.name + "]-" + this.vol + " " + this.cost + "tg";
    }
    public String getName() {
        return name;
    }
    public int getCost() {
        return cost;
    }
    public double getVol() {
        return vol;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setVol(double vol) {
        this.vol = vol;
    }
}
