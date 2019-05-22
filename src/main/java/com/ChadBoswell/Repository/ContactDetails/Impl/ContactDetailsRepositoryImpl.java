package com.ChadBoswell.Repository.ContactDetails.Impl;

import com.ChadBoswell.Domain.Workplace.ContactDetails;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;


@Repository
public class
ContactDetailsRepositoryImpl implements ContactDetailsRepository {

    private static ContactDetailsRepositoryImpl repository = null;
    Set<ContactDetails> contactInfo;

    private ContactDetailsRepositoryImpl (){
        this.cInfo = new HashSet<>();
    }

    public static ContactDetailsRepositoryImpl getContactDetails(){
        if(repository == null) repository = new ContactDetailsRepositoryImpl();
        return repository;
    }

    @Override
    public ContactDetails create(ContactDetails contactInfo) {
        cInfo.add(ContactInfo);
        return contactInfo;
    }

    @Override
    public ContactDetails read(String s) {
        return search(s);
    }

    @Override
    public ContactDetails update(ContactDetails contactInfo) {
        ContactDetails find = search(contactInfo.getEmail());
        if(cInfo.contains(find)){
            cInfo.remove(find);
            cInfo.add(contactInfo);
        }
        return contactInfo;
    }

    @Override
    public void delete(String s) {
        cInfo.remove(search(s));
    }

    @Override
    public Set<ContactDetails> getAll() {
        return cInfo;
    }

    public ContactDetails search(String email){
        return cInfo.stream().filter(cInfo -> cInfo.Email() == email).findAny().orElse(null);
    }
}
