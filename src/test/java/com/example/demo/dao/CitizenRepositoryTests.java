package com.example.demo.dao;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.demo.entities.Citizen;

@DataJpaTest
@RunWith(SpringRunner.class)
public class CitizenRepositoryTests {
 
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testGenerateCitizenId() {
		Citizen savedInDb=entityManager.persist(new Citizen(32456,"Pooja",22,"Pune","pooja@gmail.com",986723456,"Vishal","Ratna"));
		System.out.println(savedInDb);
		assertThat(savedInDb.getCitizenName()).isEqualTo("Pooja");
	}
  
	
}
