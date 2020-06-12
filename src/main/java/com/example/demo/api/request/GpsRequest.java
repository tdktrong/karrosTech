package com.example.demo.api.request;

import org.hibernate.validator.constraints.NotEmpty;

public class GpsRequest {
    @NotEmpty
    private String gpx;
    @NotEmpty
    private String track;
    @NotEmpty
    private String metadata;
    private Boolean waypoint;

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
}
