package edu.miu.cse.userprofilemanagement.service;

import edu.miu.cse.userprofilemanagement.dto.UserRequestDTO;
import edu.miu.cse.userprofilemanagement.dto.UserResponseDTO;

import java.util.Optional;

public interface UserService {
    Optional<UserResponseDTO> createUser(UserRequestDTO user);
    Optional<UserResponseDTO> getUserByUsername(String username);
}
