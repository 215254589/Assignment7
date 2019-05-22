package com.ChadBoswell.Repository.ContactDetails;

import com.ChadBoswell.Repository.IRepository;
import com.ChadBoswell.Domain.Workplace.ContactDetails;

import java.util.Set;

public interface ContactDetailsRepository extends IRepository<ContactDetails, String>
{

    Set<ContactDetails> getAll();

}