// Base class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class: Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Derived class: Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cow moos: Moo Moo!");
    }
}

// Main class
public class Animal_main {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.makeSound();

        a = new Cat();
        a.makeSound();

        a = new Cow();
        a.makeSound();
    }
}
