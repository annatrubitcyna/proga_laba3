public interface Dialogue {
    void speak(int time);
    default void exclaim(int time){
        this.speak(time);
        System.out.print("!");
    };
    default void ask(int time){
        this.speak(time);
        System.out.print("?");
    };
}
