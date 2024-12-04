public class book {

    private String title;
    private String auther;
    public String getTitle() {
        return title;
    }
    public book(String title, String auther) {
        this.title = title;
        this.auther = auther;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuther() {
        return auther;
    }
    public void setAuther(String auther) {
        this.auther = auther;
    }
    @Override
    public String toString() {
        return "book [title=" + title + ", auther=" + auther + "]";
    }

}
