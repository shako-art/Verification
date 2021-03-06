package com.example.demo.appUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Repository
public interface AppUserRepository extends
		JpaRepository<AppUser,Long> {
	Optional<AppUser> findByEmail(String email);
}
