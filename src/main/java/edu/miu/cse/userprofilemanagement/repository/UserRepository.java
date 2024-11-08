package edu.miu.cse.userprofilemanagement.repository;

import edu.miu.cse.userprofilemanagement.dto.UserResponseDTO;
import edu.miu.cse.userprofilemanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
