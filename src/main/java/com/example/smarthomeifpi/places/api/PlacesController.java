package com.example.smarthomeifpi.places.api;

import com.example.smarthomeifpi.places.app.Dtos.PlaceDto;
import com.example.smarthomeifpi.places.app.Entities.Place;
import com.example.smarthomeifpi.places.app.UseCases.CreateNewPlaceUseCase;
import com.example.smarthomeifpi.places.app.UseCases.ListPlacesUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PlacesController {
    private final ListPlacesUseCase listPlacesUseCase;
    private final CreateNewPlaceUseCase createNewPlaceUseCase;

    @Autowired
    public PlacesController(ListPlacesUseCase listPlacesUseCase, CreateNewPlaceUseCase createNewPlaceUseCase){
        this.listPlacesUseCase = listPlacesUseCase;
        this.createNewPlaceUseCase = createNewPlaceUseCase;
    }

    @GetMapping("/places")
    @ResponseStatus(HttpStatus.OK)
    public List<Place> listAllPlaces(){
        return listPlacesUseCase.call();
    }

    @PostMapping("/places")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewPlace(PlaceDto placeDto){
        createNewPlaceUseCase.call(placeDto);
    }

    @PutMapping("/places/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updatePlace(@PathVariable Long id, PlaceDto placeDto){
        return;
    }

    @DeleteMapping("/places/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletePlace(@PathVariable Long id){
        return;
    }
}
