public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animal = new Dog();
        Dog poodle = new Poodle();
        Bird bird = new Bird();


        Interrogator.convinceToTalk(dog);
        Interrogator.convinceToTalk(poodle);
        Interrogator.convinceToTalk(cat);
        Interrogator.convinceToTalk(animal);
    }
}
