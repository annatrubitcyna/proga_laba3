import actions.Portrait;
import character.Gunka;
import character.Neznaika;
import character.Tubik;
import control.Author;
import control.Time;
import enumeration.Colors;
import enumeration.How;
import enumeration.Speed;

import java.io.StringReader;
import java.security.KeyStore;

public class Main {

    public static void main(String[] args) {
        //there are conditions under which the cycle will break
        while (true) {
            Author narrator = new Author(); //create Author this story
            System.out.println(narrator.startStory()); //author start story
            //create heroes story
            Neznaika neznaika = new Neznaika("Neznaika");
            Gunka gunka = new Gunka("Gunka");
            Tubik tubik = new Tubik("Tubik");
            //heroes enter into the story
            System.out.println(gunka.live() + neznaika.live() + tubik.live());
            //Author speak
            String speak_narrator_begginer = narrator.speak();
            System.out.println(speak_narrator_begginer);
            //if autor speak about Neznaika he doing something in the story
            if (speak_narrator_begginer.contains("Neznaika")) {
            } else {
                break;
            }
            //Neznaika speak
            String neznaika_about_draw = neznaika.speak();
            System.out.println(neznaika_about_draw);
            //if Neznaika want to draw Gunka he rejoced
            if (neznaika_about_draw.contains("I'll draw you")) {
                gunka.rejoiced();
            }
            //if Neznaika said sat to Gunka he sit to chair
            Boolean has_gunka_sat = false;
            if (neznaika_about_draw.contains("Sit")) {
                has_gunka_sat = gunka.sitTo(Speed.QUICKLY, "chair");
            }
            //if Gunka sat Neznaika draw him
            Portrait PortraitGunki = null;
            if (has_gunka_sat) {
                PortraitGunki = neznaika.draw();
            }
            //if Neznaika draw Portrait Gunka wanted to see
            if (PortraitGunki != null) {
                gunka.wantedToSee(Speed.QUICKLY);
            }
            //Gunka sit restlessly and spin if his patience is small
            if (gunka.patience == 0) {
                gunka.sit(How.RESTLESSLY);
                gunka.spin();
                //if Gunka spin Neznaika said about it
                String neznaika_about_looklike = neznaika.speak();
                System.out.println(neznaika_about_looklike);
                //if Neznaika speak it doesn't look like it's going to work Gunka ask about now and Neznaika answer
                if (neznaika_about_looklike.contains("It doesn't look like it's going to work")) {
                    String gunka_ask_looklike = gunka.ask();
                    System.out.println(gunka_ask_looklike);
                    if (gunka_ask_looklike.contains("Does it look like this now")) {
                        System.out.println(neznaika.exclaim());
                    }
                }
            } else {
                gunka.sit(How.CALMLY);
            }
            //Neznaika add something to the portrait
            neznaika.drawDetail(PortraitGunki, Colors.PURPLE);
            //if portrait finished gunka want to see it and then Neznaika show it
            if (PortraitGunki.mustache != Colors.WHITE) {
            } else {
                break;
            }
            String gunka_exclaim_show = gunka.exclaim();
            System.out.println(gunka_exclaim_show);
            if (gunka_exclaim_show.contains("Show me what happened")) {
                gunka.viewPortrait(PortraitGunki, gunka);
            }
            //if portrait is bed Gunka mood is bed and small, Neznaika starts to annoy him and if Neznaika say Ok he erases Portrait
            if (gunka.mood < 30) {
                neznaika.annoy(gunka);
                String gunka_exclaim_aboutportrait = gunka.exclaim();
                System.out.println(gunka_exclaim_aboutportrait);
                if (gunka_exclaim_aboutportrait.contains("Now erase what you drew!")) {
                    String neznaika_ok = neznaika.speak();
                    System.out.println(neznaika_ok);
                    if (neznaika_ok.contains("Ok")) {
                        neznaika.erases(PortraitGunki);
                    }
                }
            }
            //Tubik draw Gunka when he wanted it
            String gunka_said_tubik = gunka.speak();
            System.out.println(gunka_said_tubik);
            Portrait NormalPortraitGunki = null;
            if (gunka_said_tubik.contains("let the Tubik draw me")) {
                //Tubik draw new Gunka's portrait
                NormalPortraitGunki = tubik.draw();
            }
            //Gunka watch potret nif it's reddy
            if (NormalPortraitGunki != null) {
                gunka.viewPortrait(NormalPortraitGunki, gunka);
            }
            //if portrait is good Gunka mood is good and big
            if (gunka.mood > 30) {
                System.out.println(gunka.exclaim());
            }
            //Author ask about Story Author finish Story
            System.out.println(narrator.exclaim() + narrator.ask());
            System.out.println(narrator.finishStory());
            System.out.println(PortraitGunki.toString());
            break;
        }
    }
}