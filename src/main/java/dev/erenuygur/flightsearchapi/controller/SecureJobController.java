package dev.erenuygur.flightsearchapi.controller;

import dev.erenuygur.flightsearchapi.job.FlightScheduledJob;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/secure")
public class SecureJobController {

    private FlightScheduledJob flightScheduledJob;

    @Operation(summary = "Trigger the flight scheduled job manually.")
    @GetMapping("/triggerJob")
    public String triggerJob() {
        flightScheduledJob.processJsonFile();
        return "Job triggered manually.";
    }
}