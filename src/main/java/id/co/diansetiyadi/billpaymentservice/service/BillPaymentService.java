package id.co.diansetiyadi.billpaymentservice.service;

import id.co.diansetiyadi.billpaymentservice.dto.request.InquiryBillPaymentRequest;
import id.co.diansetiyadi.billpaymentservice.dto.request.InquiryGridBIllPaymentRequest;
import id.co.diansetiyadi.billpaymentservice.dto.response.InquiryBillPaymentResponse;
import id.co.diansetiyadi.billpaymentservice.dto.response.InquiryGridBIllPaymentResponse;

public interface BillPaymentService {

    InquiryBillPaymentResponse inquiryBillPayment(InquiryBillPaymentRequest request);
    InquiryGridBIllPaymentResponse inquiryGridBillPayment(InquiryGridBIllPaymentRequest request);

}
