package Repository;

import Entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRep extends JpaRepository<ProfileEntity,Long> {
}
