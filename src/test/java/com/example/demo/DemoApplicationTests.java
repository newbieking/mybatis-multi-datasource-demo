package com.example.demo;

import com.example.demo.mapper.mysql.UserMySQLMapper;
import com.example.demo.mapper.pg.UserPgMapper;
import com.example.demo.model.UserModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	UserPgMapper userPgMapper;
	@Autowired
	UserMySQLMapper userMySQLMapper;

	@Test
	void contextLoads() {
		List<UserModel> userModels = userPgMapper.selectAll();
		System.out.println(userModels.toString());
		List<UserModel> userModels2 = userMySQLMapper.selectAll();
		System.out.println(userModels2.toString());
	}

}
