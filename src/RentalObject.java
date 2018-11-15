import java.util.Date;

public class RentalObject {
    private String title;
    private int id;
    private DVD[] dvds;
    private boolean available;
    private Date dueDate;

    public RentalObject(String title, int id, DVD[] dvds, boolean available, Date dueDate) {
        this.title = title;
        this.id = id;
        this.dvds = dvds;
        this.available = available;
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public boolean isAvailable() {
        return available;
    }
    public Date getDueDate() {
        return dueDate;
    }
    public DVD[] getDvds() {
        return dvds;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public void setDvds(DVD[] dvds) {
        this.dvds = dvds;
    }
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
