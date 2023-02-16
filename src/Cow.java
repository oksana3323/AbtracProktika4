public class Cow extends Animal{
  private String color;

    public Cow(String name, int age, String color) {
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
        System.out.println("clear");
    }

    @Override
    void liveplace() {
        System.out.println("Fiald");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
