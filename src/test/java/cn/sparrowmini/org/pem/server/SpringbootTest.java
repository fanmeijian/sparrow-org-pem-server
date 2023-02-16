package cn.sparrowmini.org.pem.server;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import cn.sparrowmini.org.service.GroupService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
@ActiveProfiles("h2")
public class SpringbootTest {
	
	@Autowired
	private GroupService groupService;
	
	@Test
	public void test() {
		log.debug("groupService {}", groupService);
	}

}
