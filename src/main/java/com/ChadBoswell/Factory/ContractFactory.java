package com.ChadBoswell.Factory;

import com.ChadBoswell.Domain.worker.Contract;

public class ContractFactory {

    public static Contract getContract(String contractID, String initiated, int length){

        return new Contract.Builder().contractID(contractID)
                .initiated(initiated)
                .length(length)
                .build();

    }

}
