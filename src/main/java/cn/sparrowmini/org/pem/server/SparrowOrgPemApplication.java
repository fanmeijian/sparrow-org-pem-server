package cn.sparrowmini.org.pem.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan({"cn.sparrowmini.org","cn.sparrowmini.pem","cn.sparrowmini.common","cn.sparrowmini.portal","cn.sparrowmini.file"})
@ComponentScan("cn.sparrowmini")
@EnableJpaRepositories({"cn.sparrowmini","cn.sparrowmini.org"})
@SpringBootApplication
public class SparrowOrgPemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SparrowOrgPemApplication.class, args);

	}

}
