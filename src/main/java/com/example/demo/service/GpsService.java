package com.example.demo.service;

import com.example.demo.domain.GPS;
import com.example.demo.dto.GpsDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GpsService {
    Page<GpsDto> list(Pageable pageable);

    void save(GPS gps);


    GpsDto getGpsById(Long id);
}
