package Diya;

public class Project {
    public String title= "Banking";
    public String description= "Management system of banking";
    public String status= "IN progress";
    public String startDate= "2/4/25";
    public String expiryDate= "3/6/25";
    public String sslstatus= "In progress";
    public Project() {
    }


    public Project(String title, String status) {
        this.title = title;
        this.status = status;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
}