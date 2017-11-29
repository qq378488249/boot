package com.blue.boot;

import com.blue.boot.domain.Girl;
import com.blue.boot.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GrilServiceTests {
	@Autowired
	GirlService girlService;
	@Test
	public void contextLoads() {
		Girl girl = girlService.get(1);
		System.out.println(girl.toString());
		Assert.assertEquals(new Integer(1),girl.getAge());
	}

}
