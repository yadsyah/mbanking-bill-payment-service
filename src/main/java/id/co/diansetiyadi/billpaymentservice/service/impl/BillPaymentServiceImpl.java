package id.co.diansetiyadi.billpaymentservice.service.impl;

import id.co.diansetiyadi.billpaymentservice.dto.request.InquiryBillPaymentRequest;
import id.co.diansetiyadi.billpaymentservice.dto.request.InquiryGridBIllPaymentRequest;
import id.co.diansetiyadi.billpaymentservice.dto.response.InquiryBillPaymentResponse;
import id.co.diansetiyadi.billpaymentservice.dto.response.InquiryGridBIllPaymentResponse;
import id.co.diansetiyadi.billpaymentservice.entity.BillPayment;
import id.co.diansetiyadi.billpaymentservice.repository.BillPaymentRepository;
import id.co.diansetiyadi.billpaymentservice.service.BillPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BillPaymentServiceImpl implements BillPaymentService {

    private final BillPaymentRepository billPaymentRepository;

    @Autowired
    public BillPaymentServiceImpl(BillPaymentRepository billPaymentRepository) {
        this.billPaymentRepository = billPaymentRepository;
    }

    @Override
    public InquiryBillPaymentResponse inquiryBillPayment(InquiryBillPaymentRequest request) {

        InquiryBillPaymentResponse inquiryBillPaymentResponse = new InquiryBillPaymentResponse();
        inquiryBllPaymentESB(inquiryBillPaymentResponse, request);
        return inquiryBillPaymentResponse;
    }

    @Override
    public InquiryGridBIllPaymentResponse inquiryGridBillPayment(InquiryGridBIllPaymentRequest request) {
        List<BillPayment> billPaymentList = billPaymentRepository.gridBillPayment();

        return InquiryGridBIllPaymentResponse.builder()
                .billPaymentList(billPaymentList)
                .build();
    }

    // mockup
    private void inquiryBllPaymentESB(InquiryBillPaymentResponse inquiryBillPaymentResponse, InquiryBillPaymentRequest request) {

        log.info("CALL ESB for Inquiry Bill Payment");
        inquiryBillPaymentResponse.setBillName("MOCK");
        inquiryBillPaymentResponse.setBillNo(request.getBillNo());
        inquiryBillPaymentResponse.setAmount("1000000");
        inquiryBillPaymentResponse.setBillName("MOCK");
        inquiryBillPaymentResponse.setInstitutionCode(request.getInstitutionCode());
    }
}
