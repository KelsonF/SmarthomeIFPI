package com.example.smarthomeifpi.places.app.UseCases;

import com.example.smarthomeifpi.places.app.Entities.Place;
import com.example.smarthomeifpi.places.app.Repositories.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListPlacesUseCase {
    private final PlaceRepository placeRepository;

    @Autowired
    public ListPlacesUseCase(PlaceRepository placeRepository){
        this.placeRepository = placeRepository;
    }

    public List<Place> call(){
        return placeRepository.findAll();
    }
}
