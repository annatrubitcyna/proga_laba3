package character;

import actions.Dialogue;
import actions.Drawable;
import actions.Portrait;
import control.Time;
import enumeration.Colors;

public class Neznaika extends Korotishki implements Drawable, Dialogue {
    //if there isn't name of character, his name is Neznaika
    public Neznaika() {
        this("Незнайка");
    }

    /**
     * constructor
     *
     * @param name
     * @brief Creates Neznaika with a certan name
     */
    public Neznaika(String name) {
        super(name);
    }

    //Neznaika create new portrait and draw some character
    @Override
    public Portrait draw() {
        System.out.println(", and " + name + " began to draw it.");
        Portrait portraitGunki = new Portrait();
        portraitGunki.nose = Colors.RED;
        portraitGunki.ears = Colors.GREEN;
        portraitGunki.lips = Colors.BLUE;
        portraitGunki.eyes = Colors.ORANGE;
        System.out.println(name + " wanted to make Gunka look prettier, so he drew him a " + portraitGunki.nose.toString().toLowerCase() + " nose, " + portraitGunki.ears.toString().toLowerCase() + " ears, " + portraitGunki.lips.toString().toLowerCase() + " lips, and " + portraitGunki.eyes.toString().toLowerCase() + " eyes.");
        return portraitGunki;
    }

    //Neznaika add something to the portrait
    @Override
    public Portrait drawDetail(Portrait portrait, Colors color) {
        portrait.mustache = color;
        System.out.println(" and added a " + portrait.mustache.toString().toLowerCase() + " mustache.");
        return portrait;
    }

    //Neznaika can speak, exclaim and ask in the story different words at different moments in story

    @Override
    public void speak() {
        if (Time.getInstance().time == 2) {
            System.out.print("- Sit down Gunka, I'll draw you now.");
        }
        if (Time.getInstance().time == 3) {
            System.out.print("- Don't move, don't move. It doesn't look like it's going to work.");
        }
        if (Time.getInstance().time == 8) {
            System.out.print("- Ok, ok, don't worry");
        }
        Time.getInstance().time += 1;
        System.out.println("    -" + name + " said");
    }

    @Override
    public void exclaim() {
        if (Time.getInstance().time == 5) {
            System.out.print("- It looks like it!");
        }
        Time.getInstance().time += 1;
        System.out.print("    -" + name + " exclaim");
    }

    @Override
    public void ask() {

    }

    /**
     * void annoy
     * reduces Gunka's mood
     * @param gunka
     */
    public void annoy(Gunka gunka) {
        gunka.mood -= 10;
    }
}
