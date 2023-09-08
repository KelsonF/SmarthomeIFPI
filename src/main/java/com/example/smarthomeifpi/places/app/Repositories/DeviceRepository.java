package com.example.smarthomeifpi.places.app.Repositories;

import com.example.smarthomeifpi.devices.app.entities.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {}
