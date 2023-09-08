package com.example.smarthomeifpi.places.app.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaceDto {
    private String name;
    private String description;
    private String owner;
}
