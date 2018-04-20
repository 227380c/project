package com.example.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//首先指定Junit的Runner
@RunWith(SpringJUnit4ClassRunner.class)
// 指明配置文件所在
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
@WebAppConfiguration
public class MockMvcTest {

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
	}

//	@Test
//	public void testHelloController1() throws Exception {
//		mockMvc.perform(MockMvcRequestBuilders.get("/hello")
//				.accept(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andDo(MockMvcResultHandlers.print());
//	}

	@Test
	public void testStudentController() throws Exception {
//		mockMvc.perform(MockMvcRequestBuilders.get("/toHello"))
//				.andExpect(status().isOk())
//				.andDo(MockMvcResultHandlers.print());
//		
		mockMvc.perform(MockMvcRequestBuilders.get("/list"))
				.andExpect(status().isOk())
				.andDo(MockMvcResultHandlers.print());
		
//		mockMvc.perform(MockMvcRequestBuilders.get("/toAdd"))
//				.andExpect(status().isOk())
//				.andDo(MockMvcResultHandlers.print());
//		
//		mockMvc.perform(MockMvcRequestBuilders.post("/add").param("name", "XH")
//				.param("niceName", "XH1995").param("age", "24"))		
//				.andExpect(status().isFound())
//				.andDo(MockMvcResultHandlers.print());
//		
//		mockMvc.perform(MockMvcRequestBuilders.get("/show").param("id", "149"))
//				.andExpect(status().isOk())
//				.andDo(MockMvcResultHandlers.print());
//		
//		mockMvc.perform(MockMvcRequestBuilders.get("/toEdit").param("id", "149"))
//				.andExpect(status().isOk())
//				.andDo(MockMvcResultHandlers.print());
//		
//		mockMvc.perform(MockMvcRequestBuilders.post("/edit").param("id", "149")
//				.param("name", "Tom123").param("niceName", "Tom123").param("age", "24"))
//				.andExpect(status().isFound())
//				.andDo(MockMvcResultHandlers.print());
//		
//		mockMvc.perform(MockMvcRequestBuilders.get("/delete").param("id", "149"))
//				.andExpect(status().isFound())
//				.andDo(MockMvcResultHandlers.print());
	}
}