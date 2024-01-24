package mobi.sevenwinds.app.budget;

import java.time.LocalDateTime;

public class Author {

    private Long id;
    private String fullName;
    private LocalDateTime dateOfCreated;

    public Author(String fullName) {
        this.dateOfCreated = LocalDateTime.now();
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDateTime getDateOfCreated() {
        return dateOfCreated;
    }

    public void setDateOfCreated(LocalDateTime dateOfCreated) {
        this.dateOfCreated = dateOfCreated;
    }
}
