import packA.*;
public class Lec4main {
    public static void main(String[] args) {
        q1();
    }
    static void q1() {
        Lec4Fish fish = new Lec4Fish();
        fish.swim();
        fish.fishMedthod();

        Lec4Duck duck = new Lec4Duck();
        duck.swim();
        duck.duckMethod();
    }
}