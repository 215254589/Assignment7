package com.ChadBoswell.Repository.Location.Impl;

import com.ChadBoswell.Domain.Workplace.Location;

import java.util.HashSet;
import java.util.Set;

public class LocationRepositoryImpl implements LocationRepository {

    private static LocationRepositoryImpl repository = null;
    Set<Location> loc;

    private LocationRepositoryImpl (){
        this.loc = new HashSet<>();
    }

    public static LocationRepositoryImpl getLocation(){
        if(repository == null) repository = new LocationRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Location> getAll() {
        return loc;
    }

    @Override
    public Location create(Location location) {
        loc.add(location);
        return location;
    }

    @Override
    public Location read(Integer s) {
        return search(s);
    }

    @Override
    public Location update(Location location) {
        Location find = search(location.getLocation_id());
        if(loc.contains(find)){
            loc.remove(find);
            loc.add(location);
        }
        return location;
    }

    @Override
    public void delete(Integer s) {
        loc.remove(search(s));
    }

    public Location search(Integer id) {
        return loc.stream().filter(loc -> loc.getLocation_id() == id).findAny().orElse(null);

    }
}