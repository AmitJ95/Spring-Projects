package com.javatechie.spring.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javatechie.spring.mockito.model.Employee;
import com.javatechie.spring.mockito.model.Response;

@SpringBootTest
class SpringMockitoApplicationTests {

	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext context;

	ObjectMapper om = new ObjectMapper();
	
	
	@BeforeEach
	private void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void addEmployeeTest() throws Exception {
		Employee employee = new Employee();
		employee.setName("Amit");
		employee.setDept("IT");
		String jsonRequest = om.writeValueAsString(employee);
		MvcResult result = mockMvc.
				perform(post("/EmployeeService/addEmployee").content(jsonRequest)
						.content(MediaType.APPLICATION_JSON_VALUE)).
				andExpect(status().isOk()).andReturn(); 
		
		String resultContent = result.getResponse().getContentAsString();
		Response response = om.readValue(resultContent, Response.class);
		//Assert.assertTrue(response.isStatus() == Boolean.TRUE);
        assertEquals(response.isStatus(),Boolean.TRUE);
        
		
	}
}
