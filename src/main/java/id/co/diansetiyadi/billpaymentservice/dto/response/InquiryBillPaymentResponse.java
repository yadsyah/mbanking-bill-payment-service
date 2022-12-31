package id.co.diansetiyadi.billpaymentservice.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@NoArgsConstructor
public class InquiryBillPaymentResponse {

    private String amount;
    private String billNo;
    private String institutionCode;
    private String billName;
    private Object detailInquiryInstitution;
}
