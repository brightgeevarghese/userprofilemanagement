package edu.miu.cse.userprofilemanagement.dto.response;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class ProfileResponseDTO {
//    private String bio;
//    private String location;
//}

public record ProfileResponseDTO(String bio, String location) {}