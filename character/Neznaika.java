public class Neznaika extends Korotishki implements Drawable, Dialogue{
    public Neznaika(){
        this("Незнайка");
    }
    public Neznaika(String name) {
        super(name);
    }

    @Override
    public Portrait draw() {
        System.out.println( ", and "+name+" began to draw it.");
        Portrait portraitGunki=new Portrait();
        portraitGunki.nose=Colors.RED;
        portraitGunki.ears=Colors.GREEN;
        portraitGunki.lips=Colors.BLUE;
        portraitGunki.eyes=Colors.ORANGE;
        System.out.println(name+ " wanted to make Gunka look prettier, so he drew him a "+ portraitGunki.nose.toString().toLowerCase()+ " nose, "+portraitGunki.ears.toString().toLowerCase()+ " ears, "+portraitGunki.lips.toString().toLowerCase()+ " lips, and "+portraitGunki.eyes.toString().toLowerCase()+ " eyes.");
        return portraitGunki;
    }

    @Override
    public Portrait errays(Portrait portrait) {
        portrait.nose=Colors.WHITE;
        portrait.ears=Colors.WHITE;
        portrait.lips=Colors.WHITE;
        portrait.eyes=Colors.WHITE;
        return portrait;
    }

    @Override
    public void speak(int time) {
        if (time==2) {
            System.out.print("Sit down Gunka, I'll draw you now.");
        }
        Main.time+=1;
        System.out.println("    -"+name+" said");
    }

    public void annoy(Gunka gunka){
        gunka.mood-=10;
    }
}
