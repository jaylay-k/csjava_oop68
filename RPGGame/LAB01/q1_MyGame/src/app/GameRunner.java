package app;
import model.Hero;

public class GameRunner {
static void q1_1() {
    //Hero myHero = new Hero();
    //myHero.name = "Archer";
    //myHero.introduce();

    //myHero.health = 100;
    //myHero.introduce();
}
static void q2_1() {
    Hero myHero = new Hero("Mage");

    System.out.println("Testing negative health:");
    myHero.setHealth((-50));
    System.out.println("Current HP: " + myHero.getHealth());

    System.out.println("\nTesting excessive  health: ");
    myHero.setHealth(500);
    System.out.println("Current HP: " + myHero.getHealth());
    }
}