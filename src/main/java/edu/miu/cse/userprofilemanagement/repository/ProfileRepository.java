package edu.miu.cse.userprofilemanagement.repository;

import edu.miu.cse.userprofilemanagement.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
