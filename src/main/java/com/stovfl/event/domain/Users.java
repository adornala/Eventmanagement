package com.stovfl.event.domain;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by dornala on 5/21/17.
 */
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;

    private Integer userId;

    private String userName;

    private String address;

    private String moreDetails;

    @ManyToMany(mappedBy = "user")
    private Collection<EventMember> eventMembers;

    public Collection<EventMember> getEventMembers() {
        return eventMembers;
    }

    public void setEventMembers(Collection<EventMember> eventMembers) {
        this.eventMembers = eventMembers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMoreDetails() {
        return moreDetails;
    }

    public void setMoreDetails(String moreDetails) {
        this.moreDetails = moreDetails;
    }
}
