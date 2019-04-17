package worker;

import worker.Address;

public class Address {

    private String physicalAddress,
            postalAddress;

    private Address(){}

    private Address(Address.Builder builder) {
        this.physicalAddress = builder.physicalAddress;
        this.postalAddress = builder.postalAddress;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public static class Builder{

        private String physicalAddress, postalAddress;

        public Address.Builder PhysicalAddress(String physicalAddress) {
            this.physicalAddress = physicalAddress;
            return this;
        }

        public Address.Builder PostalAddress(String postalAddress) {
            this.postalAddress = postalAddress;
            return this;
        }

        public Address build() {
            return new Address(this);
        }

    }
}
