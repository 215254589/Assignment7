package com.ChadBoswell;

public class Company {
    private String companyId,
                   companyName;

    private Company(){}

    private Company(Builder builder) {
        this.companyId = builder.companyId;
        this.companyName = builder.courseName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public static class Builder{

        private String companyId, courseName;

        public Builder CompanyId(String companyId) {
            this.companyId = companyId;
            return this;
        }

        public Builder CompanyName(String companyName) {
            this.courseName = companyName;
            return this;
        }

        public Company build() {
            return new Company(this);
        }

    }
}
