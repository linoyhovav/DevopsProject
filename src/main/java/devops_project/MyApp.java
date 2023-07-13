package devops_project; // Make sure to update the package name accordingly

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
        // Start the Spring Boot application and get the application context
        ApplicationContext context = SpringApplication.run(MyApp.class, args);

        // Get the SeedHandler bean from the application context
        SeedHandler seedHandler = context.getBean(SeedHandler.class);

        // Insert the log on server startup
        seedHandler.insertLogOnServerStartup();
    }
}

@RestController
@RequestMapping("/")
class LogController {


    @Autowired
    logRepository logRepositoryHandler;

    @GetMapping("/logs")
    public List<Log> getLogs() {
        return logRepositoryHandler.findAll();
    }

    @PostMapping ("/transaction")
    public void createTransaction(Log newLog) {
        logRepositoryHandler.save(newLog);
    }
}
