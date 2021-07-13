package com.example.backend.repository;

import com.example.backend.model.ItemTrack;
import com.example.backend.model.MessageTrack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageTrackRepository extends JpaRepository<MessageTrack, Long> {
}
