package owls.org.virtualclassroom.MyCourse;

public class EnrollCourse {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEduOrgName() {
        return eduOrgName;
    }

    public void setEduOrgName(String eduOrgName) {
        this.eduOrgName = eduOrgName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    private String eduOrgName;
    private String level;
    private int progress;
    private String thumbnail;

    public EnrollCourse(String title, String eduOrgName, String level, int progress, String thumbnail) {
        this.title = title;
        this.eduOrgName = eduOrgName;
        this.level = level;
        this.progress = progress;
        this.thumbnail = thumbnail;
    }
}
