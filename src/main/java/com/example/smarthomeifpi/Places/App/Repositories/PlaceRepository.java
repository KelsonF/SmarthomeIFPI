package com.example.smarthomeifpi.Places.App.Repositories;

import com.example.smarthomeifpi.Places.App.Entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Long> {}
