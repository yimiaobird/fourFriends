package yimiao.sgpy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("yimiao.sgpy.mapper")
@SpringBootApplication
public class SgpyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SgpyApplication.class, args);
    }

}
