package id.co.diansetiyadi.billpaymentservice.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InquiryBillPaymentRequest extends BaseRequest {

    private String sourceOfFundAccountNo;
    private String ccy;
    private String institutionCode;
    private String billNo;
}
