package AH1N1_DANIELB_93.barcode_system.dao;

import AH1N1_DANIELB_93.barcode_system.model.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends JpaRepository<TestEntity,Long> {
}
