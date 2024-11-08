package edu.miu.cse.userprofilemanagement.dto.response;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class UserResponseDTO {
//    private String username;
//    private ProfileResponseDTO profileResponseDTO;
//}

public record UserResponseDTO(String username, ProfileResponseDTO profileResponseDTO) {
}
