package com.ChadBoswell.Factory;

import com.ChadBoswell.Domain.Workplace.ContactDetails;

public class ContactDetailsFactory {

    public static ContactDetails getContactDetails(String email, String phoneNum, String socialMedia){

        return new ContactDetails.Builder()
                .email(email)
                .phoneNum(phoneNum)
                .socialMedia(socialMedia)
                .build();


    }
}
}
