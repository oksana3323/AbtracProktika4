public class Main {
    public static void main(String[] args) {
        Wolf wolf = new Wolf("wolf", 5,"black");
        Fish fish = new Fish("Fish", 5,"seryy");
        Cow cow = new Cow("Cow", 8,"black");
        System.out.println(wolf.toString());
        wolf.eat();
        wolf.liveplace();
        System.out.println("+++++++++++++++++++++");


        System.out.println(fish.toString());

        System.out.println("==========================");
        fish.eat();
        fish.liveplace();
        System.out.println(cow.toString());


        System.out.println("-------------------------------");
        System.out.println(cow.toString());

        cow.eat();
        cow.liveplace();


    }


}




