package com.ChadBoswell.Services.Workplace.Location;

import com.ChadBoswell.Domain.Workplace.Location;
import com.ChadBoswell.Services.IService;

import java.util.Set;

public interface LocationService extends IService<Location, String> {
    Set<Location> getAll();
}
