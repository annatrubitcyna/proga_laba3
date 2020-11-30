package actions;

import enumeration.Colors;

public interface Drawable {
    Portrait draw();

    Portrait drawDetail(Portrait portrait, Colors color);

    //if character erases the portrait the all in the portraits is white
    default Portrait erases(Portrait portrait) {
        portrait.nose = Colors.WHITE;
        portrait.ears = Colors.WHITE;
        portrait.lips = Colors.WHITE;
        portrait.eyes = Colors.WHITE;
        return portrait;
    }

}
