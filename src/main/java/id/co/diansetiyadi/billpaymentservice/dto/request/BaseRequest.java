package id.co.diansetiyadi.billpaymentservice.dto.request;


import id.co.diansetiyadi.billpaymentservice.util.OSMobileEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class BaseRequest {

    @NotBlank(message="field deviceId must not be blank!")
    private String deviceId;
    @NotBlank(message="field appVersion must not be blank!")
    private String appVersion;
    @NotNull(message = "field osMobile must not be null! ")
    private OSMobileEnum osMobile;

}
