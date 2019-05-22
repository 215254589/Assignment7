package com.ChadBoswell.Controller.worker;

import com.ChadBoswell.Domain.worker.Address;
import com.ChadBoswell.Services.;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")


public class AddressController {
    @Autowired

    private AddressService service;

    @PostMapping("/create")
    @ResponseBody
    public Address create(Address address)
    {
        return service.create(address);

    }

    @PostMapping("/update")
    @ResponseBody
    public Address update(Address address)
    {
        return service.create(address);

    }

    @GetMapping("/delete/{addressID}")
    @ResponseBody
    public void delete(@PathVariable String addressID)
    {
        service.delete(addressID);

    }

}
