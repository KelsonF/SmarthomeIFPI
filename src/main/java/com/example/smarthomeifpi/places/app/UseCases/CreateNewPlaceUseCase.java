package com.example.smarthomeifpi.places.app.UseCases;

import com.example.smarthomeifpi.places.app.Dtos.PlaceDto;
import com.example.smarthomeifpi.places.app.Entities.Place;
import com.example.smarthomeifpi.places.app.Repositories.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateNewPlaceUseCase {
    private final PlaceRepository placeRepository;

    @Autowired
    public CreateNewPlaceUseCase(PlaceRepository placeRepository){
        this.placeRepository = placeRepository;
    }

    public void call(PlaceDto placeDto){
        final Place place = new Place();
        place.setName(placeDto.getName());
        place.setOwner(placeDto.getOwner());
        place.setDescription(placeDto.getDescription());

        placeRepository.save(place);
    }
}
