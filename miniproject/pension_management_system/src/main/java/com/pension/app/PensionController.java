package com.pension.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PensionController {

    @Autowired
    PensionRepository pensionRepository;

    @Autowired
    PensionService pensionService;
    private Object Pension;

    @GetMapping("/checkApplication/{id}")
    public String checkApplication(@PathVariable int id)
    {
        return pensionService.checkApplication(id);
    }
    @PostMapping("/create/applicant")
    public @ResponseBody
    String store(@RequestBody final Pension pension)
    {
        return pensionService.save(pension);
    }
    @GetMapping("/checkStatus/{id}")
    public String checkStatus(@PathVariable int id)
    {
        return pensionService.checkStatus(id);

    }
    @GetMapping("/checkBalance/{id}")
    public String checkBalance(@PathVariable int id)
    {
        return pensionService.checkBalance(id);

    }
    @GetMapping("/issuepension")
    public void issuepension()
    {
        pensionService.issuepension();
    }

    //to load pension
    @GetMapping("/loadpension")
    public void loadpension()
    {
        pensionService.loadpension();
    }



}

