package com.example.smarthomeifpi.Places.App.UseCases;

import com.example.smarthomeifpi.Places.App.Dtos.PlaceDto;
import com.example.smarthomeifpi.Places.App.Entities.Place;
import com.example.smarthomeifpi.Places.App.Repositories.PlaceRepository;
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
