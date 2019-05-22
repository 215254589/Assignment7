package com.ChadBoswell.Domain.Workplace;

public class ContactDetails {

    private String email,
            phoneNum,
            socialMedia;

    private ContactDetails () {
    }

    private ContactDetails (ContactDetails .Builder builder) {
        this.email = builder.email;
        this.phoneNum = builder.phoneNum;
        this.socialMedia = builder.socialMedia;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String socialMedia() {
        return socialMedia;
    }

    public static class Builder {

       private String email,
                phoneNum,
                socialMedia;

        public ContactDetails .Builder Email(String empId) {
            this.email = email;
            return this;
        }

        public ContactDetails .Builder PhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }

        public ContactDetails .Builder SocialMedia(String socialMedia) {
            this.socialMedia = socialMedia;
            return this;
        }

        public ContactDetails  build() {
            return new ContactDetails (this);
        }
    }
}
