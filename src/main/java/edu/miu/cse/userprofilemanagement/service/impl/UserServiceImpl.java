package edu.miu.cse.userprofilemanagement.service.impl;

import edu.miu.cse.userprofilemanagement.dto.request.UserRequestDTO;
import edu.miu.cse.userprofilemanagement.dto.response.ProfileResponseDTO;
import edu.miu.cse.userprofilemanagement.dto.response.UserResponseDTO;
import edu.miu.cse.userprofilemanagement.model.Profile;
import edu.miu.cse.userprofilemanagement.model.User;
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
    public Optional<UserResponseDTO> createUser(UserRequestDTO userRequestDTO) {
        //create User object by using the data from UserRequestDTO
        User newUser = new User();
        newUser.setUsername(userRequestDTO.username());
        newUser.setPassword(userRequestDTO.password());
        //Create Profile object from UserRequestDTO
        Profile profile = new Profile();
        profile.setBio(userRequestDTO.profileRequestDTO().bio());
        profile.setLocation(userRequestDTO.profileRequestDTO().location());
        profile.setDob(userRequestDTO.profileRequestDTO().dob());
        newUser.setProfile(profile);
        //Save the new user
        User savedUser = userRepository.save(newUser);
        //Construct UserResponseDTO object
        ProfileResponseDTO profileResponseDTO =
                new ProfileResponseDTO(savedUser.getProfile().getBio(), savedUser.getProfile().getLocation());
        UserResponseDTO userResponseDTO = new UserResponseDTO(savedUser.getUsername(), profileResponseDTO);
        return Optional.of(userResponseDTO);
    }

    @Override
    public Optional<UserResponseDTO> getUserByUsername(String username) {
        return Optional.empty();
    }
}
