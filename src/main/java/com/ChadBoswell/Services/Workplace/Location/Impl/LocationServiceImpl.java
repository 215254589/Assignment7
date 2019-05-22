package com.ChadBoswell.Services.Workplace.Location.Impl;

import com.ChadBoswell.Domain.Workplace.Location;
import com.ChadBoswell.Repository.Location.Impl.LocationRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepositoryImpl repository;

    private LocationServiceImpl()
    {
        this.repository = LocationRepositoryImpl.Location();
    }

    @Override
    public Set<Location> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Location create(Location location) {
        return this.create(location);
    }

    @Override
    public Location read(int string) {
        return this.repository.read(string);
    }

    @Override
    public Location update(Location location) {
        return this.update(location);
    }

    @Override
    public void delete(int string) {this.repository.delete(string);
    }

}

