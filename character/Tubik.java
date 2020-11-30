public class Tubik extends Korotishki implements Drawable{
    public Tubik(){
        this("Тюбик");
    }
    public Tubik(String name) {
        super(name);
    }

    @Override
    public Portrait draw() {
        Portrait portraitGunki1=new Portrait();
        portraitGunki1.nose=Colors.SKIN;
        portraitGunki1.ears=Colors.SKIN;
        portraitGunki1.lips=Colors.SKIN;
        portraitGunki1.eyes=Colors.SKIN;
        System.out.println(name+ " wanted to make Gunka look prettier, so he drew him a "+ portraitGunki1.nose.toString().toLowerCase()+ " nose, "+portraitGunki1.ears.toString().toLowerCase()+ " ears, "+portraitGunki1.lips.toString().toLowerCase()+ " lips, and "+portraitGunki1.eyes.toString().toLowerCase()+ " eyes.");
        return portraitGunki1;
    }

    @Override
    public Portrait errays(Portrait portrait) {
        portrait.nose=Colors.WHITE;
        portrait.ears=Colors.WHITE;
        portrait.lips=Colors.WHITE;
        portrait.eyes=Colors.WHITE;
        return portrait;
    }
}
