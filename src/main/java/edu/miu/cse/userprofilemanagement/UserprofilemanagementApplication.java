package edu.miu.cse.userprofilemanagement;

import edu.miu.cse.userprofilemanagement.dto.request.ProfileRequestDTO;
import edu.miu.cse.userprofilemanagement.dto.request.UserRequestDTO;
import edu.miu.cse.userprofilemanagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
@RequiredArgsConstructor
public class UserprofilemanagementApplication {

    private final UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(UserprofilemanagementApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            //Create ProfileRequestDTO object
            ProfileRequestDTO profileRequestDTO =
                    new ProfileRequestDTO(
                            "I am ...",
                            "Fairfield",
                            LocalDate.of(2000, 1, 1)
                    );
            //Create UserRequestDTO object
            UserRequestDTO userRequestDTO = new UserRequestDTO(
                    "u1",
                    "p1",
                    profileRequestDTO
            );

            //Save the User object by using UserRequestDTO
            System.out.println(userService.createUser(userRequestDTO) + " is created.");
        };
    }
}
