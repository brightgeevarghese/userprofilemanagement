package edu.miu.cse.userprofilemanagement.service.impl;

import edu.miu.cse.userprofilemanagement.dto.UserRequestDTO;
import edu.miu.cse.userprofilemanagement.dto.UserResponseDTO;
import edu.miu.cse.userprofilemanagement.repository.UserRepository;
import edu.miu.cse.userprofilemanagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public Optional<UserResponseDTO> createUser(UserRequestDTO user) {
        return Optional.empty();
    }

    @Override
    public Optional<UserResponseDTO> getUserByUsername(String username) {
        return Optional.empty();
    }
}
