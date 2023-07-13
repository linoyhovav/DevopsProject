package devops_project;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime timestamp;
    private String route;

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
    public void setRoute(String route) {
        this.route = route;
    }
    // Constructors, getters, and setters for other properties
    // ...

    public Log() {
        // Default constructor required by JPA
    }

    public Log(LocalDateTime timestamp, String route) {
        this.timestamp = timestamp;
        this.route = route;
    }

    // Getters and setters for other properties
    // ...
}

