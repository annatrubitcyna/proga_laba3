package actions;

import enumeration.Colors;

import java.util.Objects;

public class Portrait {
    //portrait can't do something, but it is used by characters
    public String name;
    /**
     * fields fields part of the face
     */
    public Colors nose;
    public Colors ears;
    public Colors lips;
    public Colors eyes;
    public Colors mustache;

    //Initially, everything in the portrait is white
    public Portrait() {
        this("Portrait", Colors.WHITE, Colors.WHITE, Colors.WHITE, Colors.WHITE, Colors.WHITE);
    }

    //Initially, everything in the portrait is white
    public Portrait(String name) {
        this(name, Colors.WHITE, Colors.WHITE, Colors.WHITE, Colors.WHITE, Colors.WHITE);
    }

    /**
     * constructor
     *
     * @param nose
     * @param ears
     * @param lips
     * @param eyes
     * @param mustache
     */
    public Portrait(String name, Colors nose, Colors ears, Colors lips, Colors eyes, Colors mustache) {
        this.name = name;
        this.nose = nose;
        this.ears = ears;
        this.lips = lips;
        this.eyes = eyes;
        this.mustache = mustache;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public boolean equals(Portrait obj) {
        return this.nose.equals(obj.nose) & this.ears.equals(obj.ears) & this.lips.equals(obj.lips) & this.eyes.equals(obj.eyes) & this.mustache.equals(obj.mustache);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
