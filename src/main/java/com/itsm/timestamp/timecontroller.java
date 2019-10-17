package com.itsm.timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/all")
public class timecontroller {

    @Autowired
    Tsservice tsservice;


    @PostMapping("/map")
    public String timestamp(@RequestBody Tsclassrequest tsclassrequest)
    {
         return tsservice.timestampost(tsclassrequest);

    }



}
