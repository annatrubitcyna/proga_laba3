public class Gunka extends Korotishki{

    public Gunka(){
        this("Гунька");
    }
    public Gunka(String name) {
        super(name);
    }

    int patience=50;

    public void rejoiced(){
        mood+=10;
        System.out.print("Gunka rejoced");
    }

    public void sitTo(Speed speed, PlaceSit place){
        System.out.print(", "+speed.toString().toLowerCase()+" sit down"+" on a "+place.toString().toLowerCase());
    }
    public void wantedToSee(Speed speed){
        System.out.println("Gunka wanted to see his portrait "+speed.toString().toLowerCase());
        if (speed==Speed.QUICKLY){
            patience=0;
        }
        if (speed==Speed.NORMAL){
            patience=50;
        }
        if (speed==Speed.SLOWLY){
            patience=100;
        }
    }

    void sit(How how){
        if (how==How.RESTLESSLY){
            System.out.print("Impatient, he couldn't sit " +How.CALMLY.toString().toLowerCase()+" in his chair");
        }
    }

    void spin(){
        System.out.println(" and kept turning around.");
    }
}
