package devops_project;

import org.springframework.data.jpa.repository.JpaRepository;


public interface logRepository extends JpaRepository<Log, Long> {
}
