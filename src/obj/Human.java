package obj;

/**
 * BC12-Morning
 * 18 10 : 03
 */
public class Human {
    String name;
    int speed;
    Dog dog;
    boolean emailCheck = false;

    Human() {

    }

    Human(String name) {
        this.name = name;
    }

    Human(String name, Dog dog) {
        this.dog = dog;
        this.name = name;
    }

    void walk(int speed) {
        this.speed = speed;
    }

    void run() {
        int runSpeed = this.speed * 3;
        System.out.println(runSpeed);
    }

    public void walkWithDog(int speed) {
        walk(speed);
        dog.runAround(speed * 2);

        System.out.println("Скорость человека " + speed);
    }
}

class Dog {
    String name;
    int speed;

    Dog() {

    }

    Dog(String name) {
        this.name = name;
    }

    void runAround(int skorost) {
        this.speed = skorost;
        System.out.println("Скорость собаки " + speed);
    }

    void eat() {
        // хочешь - ешь
    }
}

class Test {
    public static void main(String[] args) {
        Dog myDog = new Dog("Тузик");
        Human lastMan = new Human("Васечкин", myDog);

        lastMan.walkWithDog(5);
    }
}
