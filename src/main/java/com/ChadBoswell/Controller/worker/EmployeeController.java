package com.ChadBoswell.Controller.worker;

import com.ChadBoswell.Domain.worker.Employee;
import com.ChadBoswell.Services.;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")


public class EmployeeController {
    @Autowired

    private EmployeeService service;

    @PostMapping("/create")
    @ResponseBody
    public Employee create(Employee employee)
    {
        return service.create(employee);

    }

    @PostMapping("/update")
    @ResponseBody
    public Employee update(Employee employee)
    {
        return service.create(employee);

    }

    @GetMapping("/delete/{empID}")
    @ResponseBody
    public void delete(@PathVariable String empID)
    {
        service.delete(empID);

    }




}
