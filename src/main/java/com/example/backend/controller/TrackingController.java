package com.example.backend.controller;

import com.example.backend.model.ItemTrack;
import com.example.backend.repository.ItemTrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tracking")
@CrossOrigin(origins = "*")
public class TrackingController {

    @Autowired
    private ItemTrackRepository itemTrackRepository;

    @GetMapping
    public ResponseEntity<Page<ItemTrack>> list(@PageableDefault(page = 0, size = 20, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){
        Page<ItemTrack> trackPage = itemTrackRepository.findAll(pageable);

        if(trackPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(trackPage, HttpStatus.OK);
        }
    }

    @GetMapping("/{trackingId}")
    public ResponseEntity<Page<ItemTrack>> getTracking(@PageableDefault(page = 0, size = 20, sort = "message", direction = Sort.Direction.DESC) Pageable pageable,
                                                       @PathVariable String trackingId){
        Page<ItemTrack> trackPage = itemTrackRepository.findAllByTrackingID(trackingId, pageable);

        if(trackPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(trackPage, HttpStatus.OK);
        }
    }

}
