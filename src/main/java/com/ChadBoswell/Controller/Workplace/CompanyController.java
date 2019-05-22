package com.ChadBoswell.Controller.Workplace;

import com.ChadBoswell.Domain.Workplace.Company;
import com.ChadBoswell.Services.;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")


public class CompanyController {
    @Autowired

    private CompanyService service;

    @PostMapping("/create")
    @ResponseBody
    public Company create(Company company)
    {
        return service.create(company);

    }

    @PostMapping("/update")
    @ResponseBody
    public Company update(Company company)
    {
        return service.create(company);

    }

    @GetMapping("/delete/{companyID}")
    @ResponseBody
    public void delete(@PathVariable String companyID)
    {
        service.delete(companyID);

    }

}

