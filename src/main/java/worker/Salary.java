package worker;

public class Salary {

    private double monthly;

    private Salary(){}

    private Salary(Salary.Builder builder) {
        this.monthly = builder.monthly;

    }

    public Double getMonthly() {
        return monthly;
    }

    public static class Builder{

        private double monthly;

        public Salary.Builder Monthly(double monthly) {
            this.monthly = monthly;
            return this;
        }

        public Salary build() {
            return new Salary(this);
        }

    }
}
