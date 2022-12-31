package id.co.diansetiyadi.billpaymentservice.repository;

import id.co.diansetiyadi.billpaymentservice.entity.BillPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillPaymentRepository extends JpaRepository<BillPayment, String> {

    @Query("SELECT BillPayment WHERE isActive=true")
    List<BillPayment> gridBillPayment();
}
