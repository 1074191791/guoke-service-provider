package fun.guoke.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("fun.guoke.service.item.mapper")
public class GuokeServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuokeServiceProviderApplication.class, args);
    }

}
