package com.stovfl.event.web;

import com.stovfl.event.Service.DTOS.EventMemberDTO;
import com.stovfl.event.ServiceImpl.EventMemberServiceImpl;
import com.stovfl.event.repository.EventMemberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dornala on 5/21/17.
 */
@RestController
public class EventMemberResource {

    private final EventMemberServiceImpl eventMemberServiceImpl;

    private final EventMemberRepository eventMemberRepository;

    EventMemberResource( EventMemberServiceImpl eventMemberServiceImpl, EventMemberRepository eventMemberRepository){
        this.eventMemberServiceImpl = eventMemberServiceImpl;
        this.eventMemberRepository = eventMemberRepository;
    }

    @GetMapping("/allEventMembers")
    public ResponseEntity getEventMembers(){
        return new ResponseEntity(eventMemberServiceImpl.getAllEventMembers(), HttpStatus.OK);
    }

    @PostMapping("/addEventMember")
    public ResponseEntity addEventMember(@RequestBody EventMemberDTO eventMemberDTO){
        System.out.println(eventMemberDTO.toString());
        eventMemberServiceImpl.insertEventMember(eventMemberDTO);
       return new ResponseEntity("Inserted Record for member :" +eventMemberDTO.getUserId(), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteEventMember(@PathVariable Integer id){
        eventMemberServiceImpl.removeEventMember(id);
        return new ResponseEntity("Deleted Id: "+id, HttpStatus.GONE);
    }

}
