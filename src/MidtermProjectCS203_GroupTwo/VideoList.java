package MidtermProjectCS203_GroupTwo;

public class VideoList {

    private Video[] videos;
    private int size;


    public VideoList() {
        this.videos = new Video[10];
        this.size = 0;
    }
    public VideoList(Video[] videos, int size) {
        this.videos = videos;
        this.size = size;
    }

    public void add(Video input) {
        videos[size] = input;
        size++;
        if(size == videos.length) resize();

    }

    public int size() {
        return size;
    }
    private  void resize() {
        Video[] revideo =  new Video[ videos.length*2];
        for(int i=0;i<videos.length;i++) {
            revideo[i] =videos[i];
        }
        revideo= videos;
    }

    @Override
    public String toString() {
        String res ="";
        for( int i=0;i< videos.length;i++) {
            res += videos[i];
        }
        //return "Videos: " + Arrays.toString(videos) + " Size:" + size ;
        return res + " Size:" + size ;

    }
}

