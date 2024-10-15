package proxy;

public class RealVideoLecture implements VideoLecture {
    private String title;

    public RealVideoLecture(String title) {
        this.title = title;
        loadLecture();
    }

    private void loadLecture() {
        System.out.println("Loading video lecture: " + title);
    }

    @Override
    public String getInfo() {
        return "Video Lecture Title: " + title;
    }

    @Override
    public void play() {
        System.out.println("Playing video lecture: " + title);
    }
}
