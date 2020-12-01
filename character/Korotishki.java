package character;

import actions.Portrait;
import enumeration.Colors;

public abstract class Korotishki {
    /**
     * field name
     */
    public final String name;
    /**
     * field mood
     */
    public int mood = 50;
    //usually characters has skin face and hasn't mustache
    /**
     * fields part of the face
     */
    private Colors nose = Colors.SKIN;
    private Colors ears = Colors.SKIN;
    private Colors lips = Colors.SKIN;
    private Colors eyes = Colors.SKIN;
    private Colors mustache = Colors.WHITE;

    public Korotishki(String name) {
        this.name = name;
    }

    //let create heroes story

    /**
     * void live
     */
    public String live() {
        return ("There is " + name + " in Sunny city. ");
    }

    /**
     * void lauph
     * increases mood
     */
    public void laugh() {
        mood += 10;
    }

    //if his portrait look like he his mood is good, but else it is very bed and any character laugh

    /**
     * void viewPortrait
     * if his portrait look like he his mood is good, but else it is very bed and any character laugh
     *
     * @param portrait
     * @param person
     */
    public void viewPortrait(Portrait portrait, Korotishki person) {
        if (portrait.eyes == this.eyes & portrait.nose == this.nose & portrait.ears == this.ears & portrait.lips == this.lips & portrait.mustache == this.mustache) {
            if (person.name == this.name) {
                this.mood += 50;
            }
        } else {
            if (person.name == this.name) {
                this.mood -= 50;
            } else {
                this.laugh();
            }
        }
        System.out.println(name + " view portrait ");
    }

    @Override
    public boolean equals(Object obj) {
        return this.getClass().equals(obj.getClass());
    }

    @Override
    public String toString() {
        return this.name;
    }
}
