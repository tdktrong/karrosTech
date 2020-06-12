package com.example.demo.domain;

import javax.persistence.*;
import java.sql.Clob;
import java.util.Date;


@Entity
@Table(name="GPS")
public class GPS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "GPX")
    private Clob gpx;
    @Column(name = "TRACK")
    private String track;
    @Column(name = "METADATA")
    private String metadata;
    @Column(name = "WAYPOINT")
    private Boolean waypoint;
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "UPDATED_DATE")
    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Clob getGpx() {
        return gpx;
    }

    public void setGpx(Clob gpx) {
        this.gpx = gpx;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public Boolean getWaypoint() {
        return waypoint;
    }

    public void setWaypoint(Boolean waypoint) {
        this.waypoint = waypoint;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
