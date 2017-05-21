package com.stovfl.event.ServiceImpl;

import com.stovfl.event.Service.DTOS.EventMemberDTO;
import com.stovfl.event.Service.EventMemberService;
import com.stovfl.event.domain.EventMember;
import com.stovfl.event.repository.EventMemberRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by dornala on 5/21/17.
 */
@Service
public class EventMemberServiceImpl implements EventMemberService {

    private final EventMemberRepository eventMemberRepository;

    public EventMemberServiceImpl(EventMemberRepository eventMemberRepository){
        this.eventMemberRepository = eventMemberRepository;
    }

    @Override
    public void insertEventMember(EventMemberDTO eventMemberDto) {
        EventMember eventMember = new EventMember();
        eventMember.setUserId(eventMemberDto.getUserId());
        eventMember.setEventId(eventMemberDto.getEventId());
        eventMember.setRoleId(eventMember.getRoleId());
        eventMember.setTimestamp(eventMember.getTimestamp());
        this.eventMemberRepository.save(eventMember);
    }

    @Override
    public void removeEventMember(Integer id) {
        EventMember eventMember = new EventMember();
        eventMember.setId(id);
        this.eventMemberRepository.delete(eventMember.getId());
    }

    public Collection<EventMember> getAllEventMembers() {
        return this.eventMemberRepository.findAll();
    }
}
