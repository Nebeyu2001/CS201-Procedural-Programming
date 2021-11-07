package MidtermProjectCS203_GroupTwo;

public class Video implements Comparable<Video> {

    private String title;
    private double durationInMinutes;
    private int views;
    private int likes;
    private double watchTime;

    public Video() {
        title = "The matrix";
        durationInMinutes= 120;
        views = 100000;
        likes = 50000;
        watchTime = 5000000;
    }

    public Video(String title, double durationInMinutes, int views, int likes, double watchTime) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
        this.views = views;
        this.likes = likes;
        this.watchTime = watchTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public double getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(double watchTime) {
        this.watchTime = watchTime;
    }

    @Override
    public int compareTo(Video o) {
        //return (int)(watchTime-o.watchTime);

        if (watchTime>o.watchTime)
            return  1;
        else if  (watchTime<o.watchTime)
            return  -1;
        else
            return 0;
    }
//    public boolean equals(Object obj) {
//        Video otherVideo = (Video) obj;
//        return this.equals(otherVideo);
//    }
//
    @Override
    public boolean equals(Object obj) {
        if(obj==null)return false;
        if(!(obj instanceof Video)) return false;

        Video v = (Video) obj;
        return watchTime==v.watchTime;
    }
//   public String toString() {
//        return "title: " + title +  "\n" +
//   }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", durationInMinutes=" + durationInMinutes +
                ", views=" + views +
                ", likes=" + likes +
                ", watchTime=" + watchTime
                ;
    }
}
