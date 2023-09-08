package com.example.smarthomeifpi.rooms.app.entities;

import com.example.smarthomeifpi.devices.app.entities.Device;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String description;

    @OneToMany
    private List<Device> deviceList;
}