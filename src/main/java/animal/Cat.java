package animal;

public class Cat {
    private String name;
    private int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void run() {
        System.out.println("Cat is running with speed: " + getSpeed());
    }

    public boolean cath(Rat rat) {
        if (getSpeed() == rat.getSpeed()) {
            return true;
        } else {
            return false;
        }
    }

    public void eat(Rat food) {
        if (cath(food) == true) {
            if (food.getWeight() < 10) {
                System.out.println("Mum mum, chuột hơi gầy");
            } else {
                System.out.println("Mum mum, chuột béo đấy");
            }
        } else {
            System.out.println("Meo meo, đói");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
