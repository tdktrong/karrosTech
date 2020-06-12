package com.example.demo.service.impl;

import com.example.demo.domain.GPS;
import com.example.demo.dto.GpsDto;
import com.example.demo.repository.GpsRepository;
import com.example.demo.service.GpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class GpsServiceImpl implements GpsService {

    @Autowired
    private GpsRepository gpsRepository;

    @Override
    public Page<GpsDto> list(Pageable pageable) {
        return gpsRepository.list(pageable);
    }

    @Override
    public void save(GPS gps) {
        gpsRepository.save(gps);
    }

    @Override
    public GpsDto getGpsById(Long id) {
        return gpsRepository.getGpsById(id);
    }


}
