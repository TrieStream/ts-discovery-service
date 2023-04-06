package com.triestream.tsdiscoveryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zoo")
public class Zoo {
    @GetMapping
    public String ZooGet() {
        return "Zoo GET Response";
    }

    @PostMapping
    public String ZooPost(){
        return "Zoo POST Response";
    }
}
