package com.example.smarthomeifpi.devices.api;

import com.example.smarthomeifpi.devices.app.entities.Device;
import com.example.smarthomeifpi.places.app.Dtos.PlaceDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DeviceController {
    @GetMapping("/devices")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Device> listAllDevices(){
        return null;
    }

    @PostMapping("/devices")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewDevice(PlaceDto placeDto){}

    @PutMapping("/devices/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateDevice(@PathVariable Long id, PlaceDto placeDto){}

    @DeleteMapping("/devices/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteDevice(@PathVariable Long id){}
}
