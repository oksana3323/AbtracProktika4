public class Wolf extends Animal{
    private String color;

    public Wolf(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    void eat() {
        System.out.println("Meat");
    }

    @Override
    void liveplace() {
        System.out.println("In  the woods");
    }

    @Override
    public String toString() {
        return super.toString()+"colo"+color;
    }
}

