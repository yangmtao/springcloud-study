package xyz.ymtao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Payment4Main {
    public static void main(String[] args) {
        SpringApplication.run(Payment4Main.class,args);
    }
}
