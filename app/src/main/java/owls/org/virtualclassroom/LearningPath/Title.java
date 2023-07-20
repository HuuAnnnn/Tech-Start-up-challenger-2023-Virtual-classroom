package owls.org.virtualclassroom.LearningPath;

public class Title {
    public String getLectureId() {
        return lectureId;
    }

    public void setLectureId(String lectureId) {
        this.lectureId = lectureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String lectureId;
    private String name;

    public Title(String lectureId, String name) {
        this.lectureId = lectureId;
        this.name = name;
    }
}
