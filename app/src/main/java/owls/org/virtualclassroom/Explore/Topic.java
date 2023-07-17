package owls.org.virtualclassroom.Explore;

public class Topic {
    private String name;
    private int color;
    public Topic(String name, int color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public int getColor() {
        return this.color;
    }
}
