package com.ChadBoswell.Repository.Contract;

import com.ChadBoswell.Repository.IRepository;
import com.ChadBoswell.Domain.worker.Contract;

import java.util.Set;

public interface ContractRepository extends IRepository<Contract, String>
{

    Set<Contract> getAll();

}
