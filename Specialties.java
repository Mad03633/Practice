public class Specialties {
    private String name;
    private String vol;
    private int cost;
    public Specialties(String name, String vol, int cost) {
        this.name = name;
        this.vol = vol;
        this.cost = cost;
    }
    public String getInfo() {
        return "[" + this.name + "]\n" + this.vol + " " + this.cost + "tg";
    }
    public void setVol(String vol) {
        this.vol = vol;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getVol() {
        return vol;
    }
    public int getCost() {
        return cost;
    }
    public String getName() {
        return name;
    }
}
