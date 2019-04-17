package worker;

public class Contract {

    private String contractID,
                   initiated;
    private int    length;



    private Contract() {
    }

    private Contract(Contract.Builder builder) {
        this.contractID = builder.contractID;
        this.length = builder.length;
        this.initiated = builder.initiated;
    }

    public String getContractID() {
        return contractID;
    }

    public String getInitiated() {
        return initiated;
    }


    public int getLength() {
        return length;
    }

    public static class Builder {

        private String contractID,
                initiated;
        private int length;


        public Contract.Builder contractID(String contractID) {
            this.contractID = contractID;
            return this;
        }

        public Contract.Builder Initiated(String initiated) {
            this.initiated = initiated;
            return this;
        }

        public Contract.Builder length(int length) {
            this.length = length;
            return this;
        }

        public Contract build() {
            return new Contract(this);
        }
    }
}
