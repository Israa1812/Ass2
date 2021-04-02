package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO Room (IdRoom,isVailed,nameCustmor) VALUES(? , ? , ? )";

		int reselt = jdbcTemplate.update(sql, 5 ,false , "tyma");

		if (reselt > 0){
			System.out.println("A new row has been inserted .");
		}
	}
}
