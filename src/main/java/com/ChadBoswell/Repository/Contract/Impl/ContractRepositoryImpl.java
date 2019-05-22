package com.ChadBoswell.Repository.Contract.Impl;

import com.ChadBoswell.Domain.worker.Contract;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;


@Repository
public class
ContractRepositoryImpl implements ContractRepository {

    private static ContractRepositoryImpl repository = null;
    Set<Contract> contracts;

    private ContractRepositoryImpl (){
        this.con = new HashSet<>();
    }

    public static ContractRepositoryImpl getContract(){
        if(repository == null) repository = new ContractRepositoryImpl();
        return repository;
    }

    @Override
    publicContract create(Contract companies) {
        con.add(contracts);
        return contracts;
    }

    @Override
    public Contract read(String s) {
        return search(s);
    }

    @Override
    public Contract update(Contract contracts) {
        Contract find = search(contracts.getContractID());
        if(con.contains(find)){
            con.remove(find);
            con.add(contracts);
        }
        return contracts;
    }

    @Override
    public void delete(String s) {
        con.remove(search(s));
    }

    @Override
    public Set<Contract> getAll() {
        return con;
    }

    public Contract search(final String compID){
        return con.stream().filter(comp -> comp.ContractID == contractID).findAny().orElse(null);
    }
}

