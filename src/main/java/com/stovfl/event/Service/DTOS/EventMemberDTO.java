package com.stovfl.event.Service.DTOS;

import com.stovfl.event.domain.EventMember;

import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by dornala on 5/21/17.
 */
public class EventMemberDTO {
    private Integer id;

    private Integer userId;

    private Integer eventId;

    private Integer roleId;

    private Timestamp timestamp;

    EventMemberDTO() {

    }

    EventMemberDTO (EventMember eventMember) {
        this(eventMember.getId(), eventMember.getUserId(), eventMember.getEventId(), eventMember.getRoleId(), eventMember.getTimestamp());
    }

    EventMemberDTO(Integer id, Integer userId, Integer eventId, Integer roleId, Timestamp timestamp){
        this.id = id;
        this.userId = userId;
        this.eventId = eventId;
        this.roleId = roleId;
        this.timestamp = timestamp;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getEventId() {
        return eventId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "EventMemberDTO{" +
                "id=" + id +
                ", userId=" + userId +
                ", eventId=" + eventId +
                ", roleId=" + roleId +
                ", timestamp=" + timestamp +
                '}';
    }
}
