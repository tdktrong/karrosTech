package com.example.demo.api;

import com.example.demo.Constants.Constants;
import com.example.demo.api.request.GpsRequest;
import com.example.demo.domain.GPS;
import com.example.demo.dto.GpsDto;
import com.example.demo.service.GpsService;
import com.example.demo.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.sql.rowset.serial.SerialClob;
import javax.validation.Valid;
import java.sql.SQLException;
import java.util.Date;

@RestController
@RequestMapping("/gps")
public class GpsController {
    @Autowired
    private GpsService gpsService;

    @GetMapping
    public ResponseEntity listGPS(@RequestParam(name = "page", defaultValue = "1") int page) {
        Pageable pageable = new PageRequest(page - 1, Constants.PAGE_SIZE);
        Page<GpsDto> data = gpsService.list(pageable);
        return ResponseEntity.ok(data);
    }

    @PostMapping
    public ResponseEntity createGPS(@Valid @RequestBody GpsRequest request) {
        GPS gps = new GPS();
        gps.setMetadata(request.getMetadata());
        gps.setTrack(request.getTrack());
        gps.setGpx(StringUtils.str2Clob(request.getGpx()));
        gps.setWaypoint(request.getWaypoint());
        gps.setCreatedDate(new Date());
        gpsService.save(gps);
        return ResponseEntity.ok(gps.getId());
    }

    @GetMapping("/{id}")
    public ResponseEntity viewGPS(@PathVariable("id") Long id) {
        GpsDto gps = gpsService.getGpsById(id);
        if (gps == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(gps);
    }

}
