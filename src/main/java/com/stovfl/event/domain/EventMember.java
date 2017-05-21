package com.stovfl.event.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by dornala on 5/21/17.
 */
@Entity
public class EventMember {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer UserId;

    private Integer EventId;

    private Integer RoleId;

    private Timestamp timestamp;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "UserId", insertable = false, updatable = false)
    private Users user;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public Integer getEventId() {
        return EventId;
    }

    public void setEventId(Integer eventId) {
        EventId = eventId;
    }

    public Integer getRoleId() {
        return RoleId;
    }

    public void setRoleId(Integer roleId) {
        RoleId = roleId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
