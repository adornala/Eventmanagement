package com.stovfl.event.Service;

import com.stovfl.event.Service.DTOS.EventMemberDTO;
import com.stovfl.event.domain.EventMember;
import org.springframework.http.ResponseEntity;

/**
 * Created by dornala on 5/21/17.
 */

public interface EventMemberService {

    public void insertEventMember(EventMemberDTO eventMemberDto);

    public void removeEventMember(Integer id);

}
