package com.ChadBoswell.Domain.worker;

public class Address {


    private int address_id, postcode;
    private String area, street;


    private Address(){}

    private Address (Builder builder){
        this.address_id = builder.address_id;
        this.area = builder.area;
        this.street = builder.street;
        this.postcode = builder.postcode;

    }

    public int getAddress() {
        return address_id;
    }

    public void setAddress(int address_id) {
        this.address_id = address_id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }




    public static class Builder {

        private int address_id, postcode;
        private String area, street;


        public Builder address_id (int address_id)
        {
            this.address_id = address_id;
            return this;

        }

        public Builder street (String street)
        {
            this.street = street;
            return this;

        }

        public Builder postcode (int postcode)
        {
            this.postcode = postcode;
            return this;

        }

        public Builder area (String postcode)
        {
            this.area = area;
            return this;

        }


        public Address build() {
            return new Address(this);
        }


    }
}
