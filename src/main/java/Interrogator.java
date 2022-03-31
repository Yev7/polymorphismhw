public class Interrogator {
    public static void convinceToTalk(Animal subject) {
        subject.talk();
    }
}

// We don't want anyone creating an animal object!
abstract class Animal {
    public abstract void talk();
}
interface flight{
    public default void fly(){}
}
class Bat implements flight{
    public void fly(){
        System.out.println("Bap bap");
    }
}
class Bird implements flight{
    @Override
    public void fly(){
        System.out.println("Flap flap");
    }
}
class Dog extends Animal {
    public void talk() {
        System.out.println("Woof!");
    }
}
class Poodle extends Dog{
    public void talk(){
        System.out.println("Yip!");
    }
}
class Cat extends Animal {
    public void talk() {
        System.out.println("Meow!");
    }
}

