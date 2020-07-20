package xyz.ymtao.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xyz.ymtao.entities.CommonResult;
import xyz.ymtao.entities.Payment;

@FeignClient(value="payment-service")
//@Component
public interface PaymentService {
       @GetMapping("/payment/get/{id}")
       CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

       @GetMapping("/payment/feign/timeout")
       public String feignTimeout();
}
