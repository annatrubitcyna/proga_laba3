public class Main {
    static int time=0;
    public static void main(String[] args) {
        Author narrator= new Author();
        narrator.startStory(time);
        narrator.speak(time);
        Neznaika neznaika= new Neznaika("Neznaika");
        Gunka gunka=new Gunka("Gunka");
        neznaika.speak(time);
        gunka.rejoiced();
        gunka.sitTo(Speed.QUICKLY,PlaceSit.CHAIR);
        neznaika.draw();
        gunka.wantedToSee(Speed.QUICKLY);
        if (gunka.patience==0) {
            gunka.sit(How.RESTLESSLY);
            gunka.spin();}
        else{gunka.sit(How.CALMLY);}
        narrator.finishStory(time);
    }
}