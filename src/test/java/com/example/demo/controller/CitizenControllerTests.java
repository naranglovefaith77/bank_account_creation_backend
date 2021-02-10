package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.entities.Citizen;
import com.example.demo.service.CitizenServiceImpl;

public class CitizenControllerTests {

	@Autowired
	private MockMvc mockMVC;
	
	
	@MockBean
	private CitizenServiceImpl citienService;
	
	@Test
	public void testSaveCitizen() throws Exception
	{ 
		String URL = "/citizen/generateCitizenId";
		Citizen c1=new Citizen(17865,"Rahul",22,"Mumbai","rahul@gmail.com",7287819278L,"Ram","Sita");
		
		String inputInJson=this.mapToJson(c1);
		Mockito.when(citienService.generateCitizenId(Mockito.any(Citizen.class))).thenReturn(c1.getCitizenId());
		
		RequestBuilder requestBuilder=MockMvcRequestBuilders.post(URL).accept(MediaType.APPLICATION_JSON)
				.content(inputInJson).contentType(MediaType.APPLICATION_JSON);
		
		MvcResult result=mockMVC.perform(requestBuilder).andReturn();
		MockHttpServletResponse response=result.getResponse();
		
		String outputInJson=response.getContentAsString();
		assertEquals(HttpStatus.CREATED.value(), response.getStatus());
				
		
	}

	private String mapToJson(Citizen c1) {
		// TODO Auto-generated method stub
		return null;
	}
}
