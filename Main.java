import actions.Portrait;
import character.Gunka;
import character.Neznaika;
import character.Tubik;
import control.Author;
import enumeration.Colors;
import enumeration.How;
import enumeration.Speed;

public class Main {

    public static void main(String[] args) {
        Author narrator = new Author(); //create Author this story
        narrator.startStory(); //author start story
        //create heroes story
        Neznaika neznaika = new Neznaika("Neznaika");
        Gunka gunka = new Gunka("Gunka");
        Tubik tubik = new Tubik("Tubik");
        //heroes enter into the story
        gunka.live();
        neznaika.live();
        tubik.live();
        narrator.speak();//Author speak
        neznaika.speak();//Neznaika speak
        gunka.rejoiced();
        gunka.sitTo(Speed.QUICKLY, "chair");
        Portrait PortraitGunki = neznaika.draw();
        gunka.wantedToSee(Speed.QUICKLY);
        //Gunka sit restlessly and spin if his patience is small
        if (gunka.patience == 0) {
            gunka.sit(How.RESTLESSLY);
            gunka.spin();
            neznaika.speak();
        } else {
            gunka.sit(How.CALMLY);
        }
        gunka.ask();
        neznaika.exclaim();
        //Neznaika add something to the portrait
        neznaika.drawDetail(PortraitGunki, Colors.PURPLE);
        gunka.exclaim();
        gunka.viewPortrait(PortraitGunki, gunka);
        //if portrait is bed Gunka mood is bed and small, Neznaika starts to annoy him
        if (gunka.mood < 30) {
            neznaika.annoy(gunka);
            gunka.exclaim();
            neznaika.speak();
            neznaika.erases(PortraitGunki);
        }
        gunka.speak();
        //Tubik draw new Gunka's portrait
        Portrait NormalPortraitGunki = tubik.draw();
        gunka.viewPortrait(NormalPortraitGunki, gunka);
        //if portrait is good Gunka mood is good and big
        if (gunka.mood > 30) {
            gunka.exclaim();
        }
        narrator.exclaim();
        narrator.ask();//Author ask about Story
        narrator.finishStory();//Author finish Story
    }
}