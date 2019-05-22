package com.ChadBoswell.Repository.Address.Impl;

import com.ChadBoswell.Domain.worker.Address;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;


@Repository
public class
AddressRepositoryImpl implements AddressRepository {

    private static AddressRepositoryImpl repository = null;
    Set<Address> addresses;

    private AddressRepositoryImpl (){
        this.add = new HashSet<>();
    }

    public static AddressRepositoryImpl getAddress(){
        if(repository == null) repository = new AddressRepositoryImpl();
        return repository;
    }

    @Override
    public Address create(Address addresses) {
        add.add(addresses);
        return addresses;
    }

    @Override
    public Address read(String s) {
        return search(s);
    }

    @Override
    public Address update(Address addresses) {
        Address find = search(addresses.getAddress());
        if(add.contains(find)){
            add.remove(find);
            add.add(addresses);
        }
        return addresses;
    }

    @Override
    public void delete(String s) {
        add.remove(search(s));
    }

    @Override
    public Set<Address> getAll() {
        return add;
    }

    public Address search(final String address_id){
        return add.stream().filter(comp -> add.Address() == address_id).findAny().orElse(null);
    }
}
