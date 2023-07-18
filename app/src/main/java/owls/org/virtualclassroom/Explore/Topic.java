package owls.org.virtualclassroom.Explore;

import android.graphics.Color;

public class Topic {
    private String name;
    private int color;
    public Topic(String name, String color) {
        this.name = name;
        this.color = Color.parseColor(color);
    }

    public String getName() {
        return this.name;
    }

    public int getColor() {
        return this.color;
    }
}
