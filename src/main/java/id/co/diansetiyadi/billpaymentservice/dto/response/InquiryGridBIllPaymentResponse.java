package id.co.diansetiyadi.billpaymentservice.dto.response;

import id.co.diansetiyadi.billpaymentservice.entity.BillPayment;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class InquiryGridBIllPaymentResponse {
    List<BillPayment> billPaymentList;
}
