package com.service.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dashboard", produces = MediaType.APPLICATION_JSON_VALUE)
public class DashboardController {

    @GetMapping(value = "/users")
    public ResponseEntity<?> getUserSummary(@RequestParam(value = "startDate") String startDate,
                                            @RequestParam(value = "endDate") String endDate)
    {
        return ResponseEntity.ok().build();
    }
}
