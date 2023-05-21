package by.javagur.spring;

import by.javagur.spring.database.repository.UserRepository;
import by.javagur.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunner {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");
        var userRepository = context.getBean("repo2", UserRepository.class);

        var userService = context.getBean(UserService.class);
        System.out.println(userService);
    }
}
