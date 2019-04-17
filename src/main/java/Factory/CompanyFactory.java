package Factory;

import Workplace.Company;

public class CompanyFactory {

    public static Company AddCompany(String companyID){
        return new Company.Builder().CompanyId( companyID).build();
    }
}
