package com.example.datab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataBApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DataBApplication.class, args);

		DBConnector dbConnector = new DBConnector();
		CharacterInfo characterInfo = new CharacterInfo();
		characterInfo.setName("Paweł");
		characterInfo.setSurname("Jaworski");
		characterInfo.setProject("Reklamacje");
		characterInfo.setGroup("Olsztyn");
		characterInfo.setScore(100);
		dbConnector.setUp();
		dbConnector.saving(characterInfo);
	}

}
