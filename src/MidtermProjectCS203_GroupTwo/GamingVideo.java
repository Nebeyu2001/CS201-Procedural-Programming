package MidtermProjectCS203_GroupTwo;

public class GamingVideo extends Video implements GamingVideos{
    private String name;

    public GamingVideo() {
        name = "FIFA";
    }


    public GamingVideo(String name,String title, double durationInMinutes, int views, int likes, double watchTime) {
        super(title, durationInMinutes, views, likes, watchTime);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGameName() {
        return getName();
    }

    @Override
    public String toString() {
        return "GamingVideo{" +
                "name='" + name + '\'' +
                ", " +
                super.toString() +
                '}';
    }
}
