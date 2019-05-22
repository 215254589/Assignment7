package com.ChadBoswell.Repository.Location;

import com.ChadBoswell.Domain.Workplace.Location;
import com.ChadBoswell.Repository.IRepository;

import java.util.Set;


public interface LocationRepository extends IRepository<Location, Integer> {
    Set<Location> getAll();

}
