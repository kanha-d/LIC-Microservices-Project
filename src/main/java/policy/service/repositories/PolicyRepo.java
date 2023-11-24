package policy.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import policy.service.entities.Policy;

import java.util.List;

@Repository
public interface PolicyRepo extends JpaRepository<Policy, String> {

    List<Policy> findByUserId(String userId);


}
