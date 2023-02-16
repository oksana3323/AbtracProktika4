public class Fish extends Animal {
  private String color;

    public Fish(String name, int age, String color) {
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
        System.out.println("insects");
    }

    @Override
    void liveplace() {
        System.out.println("water");
    }

    @Override
    public String toString() {
        return super.toString()+"Color"+color;
    }
}
