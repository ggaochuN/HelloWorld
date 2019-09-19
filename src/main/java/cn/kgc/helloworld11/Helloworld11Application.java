package cn.kgc.helloworld11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.kgc.helloworld11.mapper")
public class Helloworld11Application {

    public static void main(String[] args) {
        SpringApplication.run(Helloworld11Application.class, args);
    }

}
