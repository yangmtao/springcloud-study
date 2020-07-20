package xyz.ymtao.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    public static final String PAYMENT_URL="http://payment-service";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String paymentInfo(){
        String result=restTemplate.getForObject(PAYMENT_URL+"/payment/consul",String.class);
        return result;
    }
}
