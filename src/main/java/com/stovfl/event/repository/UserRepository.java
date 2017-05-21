package com.stovfl.event.repository;

import com.stovfl.event.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dornala on 5/21/17.
 */
public interface UserRepository extends JpaRepository<Users, Integer> {
}
