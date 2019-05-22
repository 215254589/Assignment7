package com.ChadBoswell.Service.Address;

import com.ChadBoswell.Domain.worker.Address;
import com.ChadBoswell.Services.IService;

import java.util.Set;

public interface AddressService extends IService<Address, String> {
    Set<Address> getAll();
}
