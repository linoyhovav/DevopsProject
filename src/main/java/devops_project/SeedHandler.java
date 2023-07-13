package devops_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SeedHandler {
    private final logRepository logRepositoryHandler;

    @Autowired
    public SeedHandler(logRepository logRepositoryHandler) {
        this.logRepositoryHandler = logRepositoryHandler;
    }

    public void insertLogOnServerStartup() {
        // Generate a log entry
        Log logEntry = createLogEntry();

        // Insert the log entry using the LogRepositoryHandler
        logRepositoryHandler.save(logEntry);
    }

    private Log createLogEntry() {
        // Create a new log entry
        Log logEntry = new Log();
        logEntry.setTimestamp(LocalDateTime.now());
        logEntry.setRoute("Sample Route");

        return logEntry;
    }
}