package com.AmyLin.em;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**

 * @author: AmyLin
 * @date: 2024-8-10
 */
@Slf4j
@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {

        //SpringBoot 执行启动
        SpringApplication.run(BackendApplication.class, args);

        log.info("=====================BackEndSuccess============================");
    }

}
