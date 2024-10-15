package proxy;

public class ProxyVideoLecture implements VideoLecture {
    private RealVideoLecture realVideoLecture;
    private String title;

    public ProxyVideoLecture(String title) {
        this.title = title;
    }

    @Override
    public String getInfo() {
        return "Video Lecture Title: " + title;
    }

    @Override
    public void play() {
        if (realVideoLecture == null) {
            realVideoLecture = new RealVideoLecture(title); // Lazy loading
        }
        realVideoLecture.play();
    }
}
