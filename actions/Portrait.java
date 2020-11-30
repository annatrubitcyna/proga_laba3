package actions;

import enumeration.Colors;

public class Portrait {
    //portrait can't do something, but it is used by characters
    /**
     * constructor
     * @brief Creates new Portrait
     */
    public Portrait() {
        super();
    }
    /**
     * fields fields part of the face
     */
    public Colors nose = Colors.WHITE;
    public Colors ears = Colors.WHITE;
    public Colors lips = Colors.WHITE;
    public Colors eyes = Colors.WHITE;
    public Colors mustache=Colors.WHITE;
}