package com.example.smarthomeifpi.places.app.Repositories;

import com.example.smarthomeifpi.rooms.app.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {}
