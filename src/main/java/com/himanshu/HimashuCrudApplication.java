package com.himanshu;

import com.himanshu.entity.Student;
import com.himanshu.repo.StudentRepo;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
@Profile("application-prod")
@OpenAPIDefinition(info = @Info(title = "Student Rest Api",description = "Student Crud Application",version = "V 2.0",
		contact = @Contact(url = "http://gigantic-server.com", name = "Himanshu bro", email = "email2himasnhu.com")))
public class HimashuCrudApplication {

	@Autowired
	private StudentRepo studentRepo;

	public static void main(String[] args) {
		SpringApplication.run(HimashuCrudApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
////		Student s1=new Student("aaaa","aaa","aaaa","aaa","aaa","aa");
////		Student s2=new Student("bb","bbb","bb","bbb","bbb","b");
////		this.studentRepo.save(s1);
////		this.studentRepo.save(s2);
//		List<Student> collect = IntStream.rangeClosed(1, 5).mapToObj(i -> new Student("aaaa"+i, "aaa@gmail.com", "aaaa", "7667576540", "aaa", "aa%himanshu"))
//				.collect(Collectors.toList());
//		studentRepo.saveAll(collect);
//
//	}
}
