package com.roncoo.education;

import com.roncoo.education.bean.RoncooUser;
import com.roncoo.education.mapper.RoncooUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo281ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private RoncooUserMapper mapper;
	@Test
	public void insert() {
		RoncooUser roncooUser = new RoncooUser();
		roncooUser.setName("测试");
		roncooUser.setCreateTime(new Date());
		int result = mapper.insert(roncooUser);
		System.out.println(result);
	}

}
