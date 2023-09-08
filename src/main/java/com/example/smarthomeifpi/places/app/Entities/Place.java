package com.example.smarthomeifpi.places.app.Entities;

import com.example.smarthomeifpi.rooms.app.entities.Room;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Place {
    @Id
    @GeneratedValue
    private Long Id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String owner;

    @Column(nullable = false)
    @OneToMany
    private List<Room> rooms;
}
