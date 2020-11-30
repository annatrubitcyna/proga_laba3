package character;

import actions.Dialogue;
import control.Time;
import enumeration.How;
import enumeration.Speed;

public class Gunka extends Korotishki implements Dialogue {
    //if there isn't name of character, his name is Gunka
    public Gunka() {
        this("Гунька");
    }

    /**
     * constructor
     *
     * @param name
     * @brief Creates Gunka with a certan name
     */
    public Gunka(String name) {
        super(name);
    }

    /**
     * Field patience
     */
    public int patience = 50;

    /**
     * void rejoiced increases mood
     */
    public void rejoiced() {
        mood += 10;
        System.out.print("Gunka rejoced");
    }

    //void sit don't canges something but she is in the story and after that Neznaika starts draw portrait

    /**
     * void sitTo
     *
     * @param speed
     * @param place
     */
    public void sitTo(Speed speed, String place) {
        System.out.print(", " + speed.toString().toLowerCase() + " sit down" + " on a " + place);
    }

    //if Gunka wanted to see his portrait quickly his patience is small

    /**
     * void wantedToSee changes patient
     *
     * @param speed
     */
    public void wantedToSee(Speed speed) {
        System.out.println("Gunka wanted to see his portrait " + speed.toString().toLowerCase());
        if (speed == Speed.QUICKLY) {
            patience = 0;
        }
        if (speed == Speed.NORMAL) {
            patience = 50;
        }
        if (speed == Speed.SLOWLY) {
            patience = 100;
        }
    }

    //he sit restlessly if his patience is small

    /**
     * void sit
     *
     * @param how
     */
    public void sit(How how) {
        if (how == How.RESTLESSLY) {
            System.out.print("Impatient, he couldn't sit " + How.CALMLY.toString().toLowerCase() + " in his chair");
        }
    }

    //he spin if his patience is small

    /**
     * void spin
     */
    public void spin() {
        System.out.println(" and kept turning around.");
    }


    //Gunka can speak, exclaim and ask in the story different words at different moments in story

    @Override
    public void speak() {
        if (Time.getInstance().time == 9) {
            System.out.print("- Better let the Tubik draw me.");
        }
        Time.getInstance().time += 1;
        System.out.println("    -" + name + " said");
    }

    @Override
    public void exclaim() {
        if (Time.getInstance().time == 6) {
            System.out.print("- Show me what happened!");
        }
        if (Time.getInstance().time == 7) {
            System.out.print("- Am I like that? Now erase what you drew!");
        }
        if (Time.getInstance().time == 10) {
            System.out.print("- There is a good portrait!");
        }
        Time.getInstance().time += 1;
        System.out.println("    -" + name + " exclaim");

    }

    @Override
    public void ask() {
        if (Time.getInstance().time == 4) {
            System.out.print("— Does it look like this now?");
        }
        Time.getInstance().time += 1;
        System.out.println("    -" + name + " ask");
    }
}
