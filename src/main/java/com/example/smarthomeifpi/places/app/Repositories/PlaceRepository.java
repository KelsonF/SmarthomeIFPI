package com.example.smarthomeifpi.places.app.Repositories;

import com.example.smarthomeifpi.places.app.Entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Long> {}
