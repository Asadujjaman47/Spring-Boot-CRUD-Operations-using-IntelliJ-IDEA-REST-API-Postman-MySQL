package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Asad");
		employee.setLastName("Akul");
		employee.setEmailId("a@gmail.com");
		employeeRepository.save(employee);

		Employee employee2 = new Employee();
		employee2.setFirstName("Asad2");
		employee2.setLastName("Akul2");
		employee2.setEmailId("a2@gmail.com");
		employeeRepository.save(employee2);


	}
}
