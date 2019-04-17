package worker;

public class PhoneNumber {
    private String cellNum,
                   workNum;

    private PhoneNumber(){}

    private PhoneNumber(PhoneNumber.Builder builder) {
        this.cellNum = builder.cellNum;
        this.workNum = builder.workNum;
    }

    public String getCellNum() {
        return cellNum;
    }

    public String getWorkNum() {
        return workNum;
    }

    public static class Builder{

        private String cellNum, workNum;

        public PhoneNumber.Builder CellNum(String cellNum) {
            this.cellNum = cellNum;
            return this;
        }

        public PhoneNumber.Builder WorkNum(String workNum) {
            this.workNum = workNum;
            return this;
        }

        public PhoneNumber build() {
            return new PhoneNumber(this);
        }

    }

}
