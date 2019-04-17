package worker;

public class Qualifications {

    private String qualType,
            qualAmt;

    private Qualifications(){}

    private Qualifications(Qualifications.Builder builder) {
        this.qualType = builder.qualType;
        this.qualAmt = builder.qualAmt;
    }

    public String getQualType() {
        return qualType;
    }

    public String getQualAmt() {
        return qualAmt;
    }

    public static class Builder{

        private String qualType, qualAmt;

        public Qualifications.Builder QualType(String qualType) {
            this.qualType = qualType;
            return this;
        }

        public Qualifications.Builder QualAmt(String qualAmt) {
            this.qualAmt = qualAmt;
            return this;
        }

        public Qualifications build() {
            return new Qualifications(this);
        }

    }
}
