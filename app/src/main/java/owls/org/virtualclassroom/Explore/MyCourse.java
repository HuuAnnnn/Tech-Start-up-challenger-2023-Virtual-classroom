package owls.org.virtualclassroom.Explore;

public class MyCourse {
    private String urlThumbnail;
    private String title;
    private String eduOrgName;
    private String level;
    private double rate;
    private int numOfRated;

    public MyCourse(String urlThumbnail, String title, String eduOrgName, String level, double rate, int numOfRated) {
        this.urlThumbnail = urlThumbnail;
        this.title = title;
        this.eduOrgName = eduOrgName;
        this.level = level;
        this.rate = rate;
        this.numOfRated = numOfRated;
    }

    public String getTitle() {
        return title;
    }

    public String getEduOrgName() {
        return eduOrgName;
    }

    public String getLevel() {
        return level;
    }

    public double getRate() {
        return rate;
    }

    public int getNumOfRated() {
        return numOfRated;
    }
    public String getUrlThumbnail() { return this.urlThumbnail; }
}
