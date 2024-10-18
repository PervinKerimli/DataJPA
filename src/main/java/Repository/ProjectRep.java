package Repository;
import Entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRep extends JpaRepository<ProjectEntity, Long> {
}
