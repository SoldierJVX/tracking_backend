package com.example.backend.repository;

import com.example.backend.model.ItemTrack;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemTrackRepository extends JpaRepository<ItemTrack, Long> {
    Page<ItemTrack> findAllByTrackingID(String trackingId, Pageable pageable);
}
