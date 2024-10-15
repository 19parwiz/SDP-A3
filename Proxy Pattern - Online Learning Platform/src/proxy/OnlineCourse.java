package proxy;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {
    private List<VideoLecture> videoLectures;

    public OnlineCourse() {
        videoLectures = new ArrayList<>();
    }

    public void addLecture(VideoLecture videoLecture) {
        videoLectures.add(videoLecture);
    }

    public void playAllLectures() {
        for (VideoLecture lecture : videoLectures) {
            System.out.println(lecture.getInfo());
            lecture.play();
        }
    }
}
