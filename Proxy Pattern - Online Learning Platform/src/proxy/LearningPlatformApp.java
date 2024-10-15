package proxy;

public class LearningPlatformApp {
    public static void main(String[] args) {
        OnlineCourse course = new OnlineCourse();

        // Adding video lectures using proxy
        course.addLecture(new ProxyVideoLecture("Introduction to Proxy Pattern"));
        course.addLecture(new ProxyVideoLecture("Advanced Proxy Pattern Techniques"));
        course.addLecture(new ProxyVideoLecture("Proxy Pattern in Real-World Applications"));

        // Play all lectures to demonstrate lazy loading
        course.playAllLectures();
    }
}
