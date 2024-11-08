package edu.miu.cse.userprofilemanagement.dto.request;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class UserRequestDTO {
//    private String username;
//    private String password;
//    private ProfileRequestDTO profileRequestDTO;
//}

public record UserRequestDTO(String username, String password, ProfileRequestDTO profileRequestDTO) {
}
