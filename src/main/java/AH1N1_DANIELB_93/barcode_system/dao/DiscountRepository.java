package AH1N1_DANIELB_93.barcode_system.dao;

import AH1N1_DANIELB_93.barcode_system.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wojciech.misiak on 10/19/2017.
 */
@Repository
public interface DiscountRepository extends JpaRepository<Discount,Long> {
}
