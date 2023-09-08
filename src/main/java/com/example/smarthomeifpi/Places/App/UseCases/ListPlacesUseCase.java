package com.example.smarthomeifpi.Places.App.UseCases;

import com.example.smarthomeifpi.Places.App.Entities.Place;
import com.example.smarthomeifpi.Places.App.Repositories.PlaceRepository;
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
