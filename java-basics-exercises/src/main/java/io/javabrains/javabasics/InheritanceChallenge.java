package io.javabrains.javabasics;

/*

1.  Create an `Animal` class with member variables for the name and age of the animal and a constructor method that initializes the member variables.
2.  Create a `Dog` class that extends the `Animal` class and has a member variable for the breed of the dog and a constructor method that initializes the member variables.
3.  Override the `makeSound` method in the `Dog` class to print "The dog barks".
4.  Create a `Cat` class that extends the `Animal` class and has a member variable for the number of lives of the cat and a constructor method that initializes the member variables.
5.  Override the `makeSound` method in the `Cat` class to print "The cat meows".
6.  In the `main` method of this class, create an array of `Animal` objects and initialize it with a `Lion`, a `Dog`, a `Cat`, and another `Animal` of your choice.
7.  Loop through the array of `Animal` objects and print the name, age, and sound of each animal.
 */


public class InheritanceChallenge {

    public static void main(String[] args) {
        Animal []arr=new Animal[4];
        arr [0]=new Animal("Lion",16);
        arr [1]=new Dog("Dog",7,"Pug");
        arr [2]=new Cat("Cat",5,9);
        arr [3]=new Animal("Deer",12);

        for(Animal o : arr){
            System.out.println(o);
            System.out.println(o.makeSound());
        }
    }
}

class Animal {
    String name;
    int age;
        String makeSound(){
           return this.name+" makes sound ";
        }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal " +
                "name= " + name  +
                ", age=" + age ;
    }
}
class Dog extends Animal {
    String breed;

    @Override
    String makeSound() {
       return " The dog barks";
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog " +
                "breed= " + breed  +
                ", name= " + name  +
                ", age= " + age
                ;
    }
}
class Cat extends Animal {
    int lives;

    public Cat(String name, int age, int lives) {
        super(name, age);
        this.lives = lives;
    }

    @Override
    public String toString() {
        return "Cat " +
                "lives= " + lives +
                ", name " + name +
                ", age= " + age ;
    }

    @Override
    String makeSound() {

        return " The Cat meows";
    }

}
