package ie.atu.enrolmentsevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EnrolmentSeviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnrolmentSeviceApplication.class, args);
    }

}
