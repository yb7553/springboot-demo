package com.swan2boot.swan.env;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.swan2boot.swan.env"})
public class SwanEnvServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(SwanEnvServiceApplication.class, args);

	}

}
