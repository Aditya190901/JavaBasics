class Animal{
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Barking");
    }
}

class Puppy extends Dog{
    void sleep(){
        System.out.println("sleeping");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        // Dog d1 = new Dog();
        // d1.eat();
        // d1.sound();
        // Animal a1 = new Animal();
        // a1.eat();
        Puppy p1 = new Puppy();
        p1.eat();
        p1.sound();
        p1.sleep();
    }
}
