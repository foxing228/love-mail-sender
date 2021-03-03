package com.dima.loveyousender.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@RequestMapping("")
public class LoveController {

    @GetMapping()
    public String love() {
        return "Anya, i love u";
    }
}
