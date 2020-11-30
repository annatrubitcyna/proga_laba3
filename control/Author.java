public class Author implements Dialogue{
    public String name;
    String nationality="USSR";

    public Author(){
        this("Nikolay Nosov");
    }
    public Author(String name1) {
        this.name=name1;
    }
    public void startStory(int time){
        System.out.println("Today I will tell you a story about the shorties from Sunny city.");
        Main.time+=1;
    }
    public void finishStory(int time){
        System.out.println("That's all for today.");
        Main.time+=1;
    }

    @Override
    public void speak(int time) {
        if (time==1) {
            System.out.println("Neznaika and Gunka lived in the city.This story happened to them once");
        }
        Main.time+=1;
    }

//    void controlStory(time){
//        start, finish
//    }
}
