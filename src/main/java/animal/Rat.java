package animal;

public class Rat {
    private String name;
    private int weight;
    private int speed;

    public Rat(String name, int weight, int speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public void run() {
        this.speed = 10;
    }

    @Override
    public String toString() {
        return "animal.Rat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}
