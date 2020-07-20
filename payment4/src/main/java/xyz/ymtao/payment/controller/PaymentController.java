package xyz.ymtao.payment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;
@Controller
public class PaymentController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/consul")
    @ResponseBody
    public String paymentZk(){
        return "springcloud with consul:"+port+","+ UUID.randomUUID().toString();
    }
}
