package com.example.demo.repository;

import com.example.demo.domain.GPS;
import com.example.demo.dto.GpsDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GpsRepository extends JpaRepository<GPS, Long> {
    @Query("SELECT new com.example.demo.dto.GpsDto(gps.id, gps.gpx, gps.track, gps.metadata, gps.waypoint, gps.createdDate, gps.updateDate)" +
            " FROM GPS gps"
    )
    Page<GpsDto> list(Pageable pageable);

    @Query("SELECT new com.example.demo.dto.GpsDto(gps.id, gps.gpx, gps.track, gps.metadata, gps.waypoint, gps.createdDate, gps.updateDate)" +
            " FROM GPS gps WHERE gps.id = ?1"
    )
    GpsDto getGpsById(Long id);
}
