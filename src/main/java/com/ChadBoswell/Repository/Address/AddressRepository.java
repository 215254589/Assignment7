package com.ChadBoswell.Repository.Address;

import com.ChadBoswell.Repository.IRepository;
import com.ChadBoswell.Domain.worker.Address;

import java.util.Set;

public interface AddressRepository extends IRepository<Address, String>
{

    Set<Address> getAll();

}
