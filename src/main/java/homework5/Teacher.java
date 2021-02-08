package homework5;

public class Teacher extends Student{
private String title;

       public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Title: " + title;
    }
}
