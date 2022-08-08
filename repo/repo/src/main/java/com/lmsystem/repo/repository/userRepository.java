package com.lmsystem.repo.repository;

import com.lmsystem.repo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,String> {
}
