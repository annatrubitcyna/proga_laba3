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
    public Boolean sitTo(Speed speed, String place) {
        System.out.print(", " + speed.toString() + " sit down" + " on a " + place);
        return true;
    }

    //if Gunka wanted to see his portrait quickly his patience is small

    /**
     * void wantedToSee changes patient
     *
     * @param speed
     */
    public void wantedToSee(Speed speed) {
        System.out.println("Gunka wanted to see his portrait " + speed.toString());
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
            System.out.print("Impatient, he couldn't sit " + How.CALMLY.toString() + " in his chair");
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
    public String speak() {
        System.out.print(name + " said:    ");
        Time.getInstance().time += 1;
        if (Time.getInstance().time == 9) {
            return ("- Better let the Tubik draw me.");
        }
        return null;
    }

    @Override
    public String exclaim() {
        Time.getInstance().time += 1;
        System.out.print(name + " exclaim:    ");
        if (Time.getInstance().time == 6) {
            return ("- Show me what happened!");
        }
        if (Time.getInstance().time == 7) {
            return ("- Am I like that? Now erase what you drew!");
        }
        if (Time.getInstance().time == 10) {
            return ("- There is a good portrait!");
        }

        return null;
    }

    @Override
    public String ask() {
        Time.getInstance().time += 1;
        System.out.print(name + " ask:    ");
        if (Time.getInstance().time == 4) {
            return ("— Does it look like this now?");
        }
        return null;
    }

}
