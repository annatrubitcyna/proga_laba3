package control;

import actions.Dialogue;

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
    public String startStory() {
        return ("Today I will tell you a story about the shorties from Sunny city.");
    }

    //Author finish story at the end of Story

    /**
     * void finishStory
     * speak a word at the end of Story
     */
    public String finishStory() {
        return ("That's all for today.");
    }

    //Author can speak and comments the Story
    @Override
    public String speak() {
        Time.getInstance().time += 1;
        if (Time.getInstance().time == 1) {
            return ("One day Neznaika decided to become an artist.");
        }
        return null;
    }

    //Author can exclaim
    @Override
    public String exclaim() {
        Time.getInstance().time += 1;
        if (Time.getInstance().time == 11) {
            return ("So the Neznaika didn't become an artist! ");
        }
        return null;
    }

    //Author can ask people
    @Override
    public String ask() {
        Time.getInstance().time += 1;
        if (Time.getInstance().time == 12) {
            return (" Do you like the Story?");
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getClass().equals(getClass());
    }

    @Override
    public String toString() {
        return name;
    }
}
