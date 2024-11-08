package edu.miu.cse.userprofilemanagement.dto.request;

import java.time.LocalDate;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class ProfileRequestDTO {
//    private String bio;
//    private String location;
//    private LocalDate dob;
//}
public record ProfileRequestDTO(String bio, String location, LocalDate dob) {
}