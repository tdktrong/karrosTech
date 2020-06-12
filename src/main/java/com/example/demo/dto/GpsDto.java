package com.example.demo.dto;

import com.example.demo.Constants.Constants;
import com.example.demo.utils.StringUtils;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Clob;
import java.util.Date;

public class GpsDto {
    private Long id;
    private String gpx;
    private String track;
    private String metadata;
    private Boolean waypoint;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constants.DATE_FORMAT)
    private Date createdDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constants.DATE_FORMAT)
    private Date updateDate;

    public GpsDto(Long id, Clob gpx, String track, String metadata, Boolean waypoint, Date createdDate, Date updateDate) {
        this.id = id;
        this.gpx = StringUtils.clob2Str(gpx);
        this.track = track;
        this.metadata = metadata;
        this.waypoint = waypoint;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGpx() {
        return gpx;
    }

    public void setGpx(String gpx) {
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
