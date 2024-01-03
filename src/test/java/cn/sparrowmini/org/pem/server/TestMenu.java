package cn.sparrowmini.org.pem.server;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
@ActiveProfiles("h2")
public class TestMenu {

//	@Autowired
//	private MenuService menuService;
//
//	@WithMockUser("ROOT")
//	@Test
//	public void test() {
//		
//		Menu menu = this.menuService.save(new Menu("M01", null));
//		assertNotNull(menu.getId());
//		assertNotNull(this.menuService.get(menu.getId()));
//		assertEquals("M01-update", this.menuService.update(menu.getId(), Collections.singletonMap("name", "M01-update")).getName()); ;
//		this.menuService.delete(Collections.singletonList(menu.getId()).toArray(new String[] {}));
//		assertNull(this.menuService.get(menu.getId()));
//		log.debug("groupService {}", menuService);
//	}

}
