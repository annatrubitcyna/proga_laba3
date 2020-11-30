package control;
import actions.Dialogue;
import control.Time;

public class Author implements Dialogue {
    /**
     * void name
     */
    public String name;

    //if there isn't name of Author, his name is Nikolay Nosov
    public Author() {
        this("Nikolay Nosov");
    }

    /**
     * constructor
     *
     * @param name
     * @brief Creates Author with a certan name
     */
    public Author(String name) {
        this.name = name;
    }

    //Author start story at the beginning of Story
    /**
     * void startStory
     * speak a word at the beginning of Story
     */
    public void startStory() {
        System.out.println("Today I will tell you a story about the shorties from Sunny city.");
        Time.getInstance().time += 1;
    }

    //Author finish story at the end of Story
    /**
     * void finishStory
     * speak a word at the end of Story
     */
    public void finishStory() {
        System.out.println("That's all for today.");
        Time.getInstance().time += 1;
    }

    //Author can speak and comments the Story
    @Override
    public void speak() {
        if (Time.getInstance().time == 1) {
            System.out.println("One day Neznaika decided to become an artist.");
        }
        Time.getInstance().time += 1;
    }

    //Author can exclaim
    @Override
    public void exclaim() {
        if (Time.getInstance().time == 11) {
            System.out.println("So the Neznaika didn't become an artist!");
        }
        Time.getInstance().time += 1;
    }

    //Author can ask people
    @Override
    public void ask() {
        if (Time.getInstance().time == 12) {
            System.out.println("Do you like the Story?");
        }
        Time.getInstance().time += 1;
    }
}
