package com.stovfl.event.repository;

import com.stovfl.event.domain.EventMember;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dornala on 5/21/17.
 */
public interface EventMemberRepository extends JpaRepository< EventMember, Integer >{

}
