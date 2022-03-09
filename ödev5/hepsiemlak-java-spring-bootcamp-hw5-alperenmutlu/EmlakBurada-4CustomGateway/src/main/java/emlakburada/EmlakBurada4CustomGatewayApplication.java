package emlakburada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmlakBurada4CustomGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmlakBurada4CustomGatewayApplication.class, args);
    }

}
