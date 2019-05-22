package com.ChadBoswell.Service.Impl;

import com.ChadBoswell.Domain.worker.Address;
import com.ChadBoswell.Repository.Address.Impl.AddressRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepositoryImpl repository;

    private AddressServiceImpl()
    {
        this.repository = AddressRepositoryImpl.Address();
    }

    @Override
    public Set<Address> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Address create(Address address) {
        return this.create(address);
    }

    @Override
    public Address read(String string) {
        return this.repository.read(string);
    }

    @Override
    public Address update(Address address) {
        return this.update(address);
    }

    @Override
    public void delete(String string) {this.repository.delete(string);
    }

}
