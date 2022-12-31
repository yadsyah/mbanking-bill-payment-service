package id.co.diansetiyadi.billpaymentservice.entity;


import id.co.diansetiyadi.billpaymentservice.util.OSMobileEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table
public class BillPayment extends BaseEntity {

    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "min_version", length = 15)
    private String minVersion;
    @Column(name = "max_version", length = 15)
    private String maxVersion;
    @Column(name = "institution_code", length = 10)
    private String institutionCode;
    @Column(name = "is_active")
    private boolean isActive;
    @Column(name = "os_mobile", length = 50)
    @Enumerated(EnumType.STRING)
    private OSMobileEnum osMobileEnum;
}
