package edu.miu.cse.userprofilemanagement.service;

import edu.miu.cse.userprofilemanagement.dto.request.UserRequestDTO;
import edu.miu.cse.userprofilemanagement.dto.response.UserResponseDTO;

import java.util.Optional;

public interface UserService {
    Optional<UserResponseDTO> createUser(UserRequestDTO user);
    Optional<UserResponseDTO> getUserByUsername(String username);
}
