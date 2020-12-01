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
        Portrait portraitGunki = new Portrait("PortraitGunki");
        portraitGunki.nose = Colors.RED;
        portraitGunki.ears = Colors.GREEN;
        portraitGunki.lips = Colors.BLUE;
        portraitGunki.eyes = Colors.ORANGE;
        System.out.println(name + " wanted to make Gunka look prettier, so he drew him a " + portraitGunki.nose.toString() + " nose, " + portraitGunki.ears.toString() + " ears, " + portraitGunki.lips.toString() + " lips, and " + portraitGunki.eyes.toString() + " eyes.");
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
    public String speak() {
        System.out.print(name + " said:    ");
        Time.getInstance().time += 1;
        if (Time.getInstance().time == 2) {
            return ("- Sit down Gunka, I'll draw you now.");
        }
        if (Time.getInstance().time == 3) {
            return ("- Don't move, don't move. It doesn't look like it's going to work.");
        }
        if (Time.getInstance().time == 8) {
            return ("- Ok, ok, don't worry");
        }
        return null;
    }

    @Override
    public String exclaim() {
        System.out.print(name + " exclaim:    ");
        Time.getInstance().time += 1;
        if (Time.getInstance().time == 5) {
            return ("- It looks like it!");
        }
        return null;
    }

    @Override
    public String ask() {
        return null;
    }

    /**
     * void annoy
     * reduces Gunka's mood
     *
     * @param gunka
     */
    public void annoy(Gunka gunka) {
        gunka.mood -= 10;
    }
}
