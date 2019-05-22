package com.erce.paramtype.wrongparamtype;

import org.junit.Test;
import org.junit.runner.RunWith;
import springfox.documentation.spring.web.json.Json;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.web.Swagger2Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WrongparamtypeApplicationTests {

	@Autowired
	Swagger2Controller mController;
	
	
	@Test
	public void contextLoads() {
		ResponseEntity<Json> documentation = mController.getDocumentation(null, null);
		
	}

}
