package com.ChadBoswell.Controller.Workplace;

import com.ChadBoswell.Domain.Workplace.Location;
import com.ChadBoswell.Services.;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/location")


public class LocationController {
    @Autowired

    private LocationService service;

    @PostMapping("/create")
    @ResponseBody
    public Location create(Location location)
    {
        return service.create(location);

    }

    @PostMapping("/update")
    @ResponseBody
    public Location update(Location location)
    {
        return service.create(location);

    }

    @GetMapping("/delete/{locationID}")
    @ResponseBody
    public void delete(@PathVariable String locationID)
    {
        service.delete(locationID);

    }

}


