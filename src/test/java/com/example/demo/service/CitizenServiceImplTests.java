package com.example.demo.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.CitizenRepository;
import com.example.demo.entities.Citizen;

import antlr.collections.List;


@SpringBootTest
@RunWith(SpringRunner.class)
public class CitizenServiceImplTests {

	@Autowired
	public CitizenServiceImpl citizenService;
	
	@MockBean
	public CitizenRepository citizenRepository;
	
	//testing service layer
	
	@Test
	public void TestGenerateCitizenId()
	{
		Citizen citizen = new Citizen(new Integer(14191456));
		when(citizenRepository.save(citizen)).thenReturn(citizen);
		assertEquals(citizen,citizenService.generateCitizenId(citizen));
	}
}
		
	/*/@Test
	 public void testGetAllCitizens() {
     when(citizenRepository.findAll()).thenReturn(Stream.of(new citizen("Niketa","22","Pune","niketa@gmail.com","7756012841","Vilas","Venu")).collect(Collectors.toList())); 		
     List citizens = CitizenServiceImpl.getAllCitizen();
		assertEquals(citizenService.size());
	
	
	}
/*/
  /*/  @Test
     public void saveCitizenTest() {
    	 Citizen citizenRepository= new Citizen("Niketa","22","Pune","niketa@gmail.com","7756012841","Vilas","Venu");
    	 when(citizenRepository.save(citizen)).thenReturn(citizen);
    	 assertEquals(citizenRepository.savecitizen(citizenRepository));
     }
    }
/*/

