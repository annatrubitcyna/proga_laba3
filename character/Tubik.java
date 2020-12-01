package character;

import actions.Drawable;
import actions.Portrait;
import enumeration.Colors;

public class Tubik extends Korotishki implements Drawable {
    //if there isn't name of character, his name is Tubik
    public Tubik() {
        this("Тюбик");
    }

    /**
     * constructor
     *
     * @param name
     * @brief Creates Tubik with a certan name
     */
    public Tubik(String name) {
        super(name);
    }

    //Tubik create new portrait and draw some character
    @Override
    public Portrait draw() {
        Portrait portraitGunki = new Portrait();
        portraitGunki.nose = Colors.SKIN;
        portraitGunki.ears = Colors.SKIN;
        portraitGunki.lips = Colors.SKIN;
        portraitGunki.eyes = Colors.SKIN;
        System.out.println(name + " wanted to make Gunka look prettier, so he drew him a " + portraitGunki.nose.toString() + " nose, " + portraitGunki.ears.toString() + " ears, " + portraitGunki.lips.toString() + " lips, and " + portraitGunki.eyes.toString() + " eyes.");
        return portraitGunki;
    }

    //Tubik add something to the portrait
    @Override
    public Portrait drawDetail(Portrait portrait, Colors color) {
        portrait.mustache = color;
        System.out.println(name + " added a " + portrait.mustache.toString().toLowerCase() + " mustache.");
        return portrait;
    }
}