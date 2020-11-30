public abstract class Korotishki {
    public final String name;
    int mood=50;

    public Korotishki(String name){
        this.name = name;
    }

    public void live(){
        System.out.println("А еще жил в Солнечном городе"+name);
    }
    public void lauph(){
        mood+=10;
    }
}
