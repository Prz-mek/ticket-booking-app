package com.cinema.app.screening;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "api/screening")
public class ScreeningController {

    @Autowired
    private ScreeningService screeningService;

    @GetMapping(path = "/date-between")
    public List<ScreeningVM> getAllScreeningsBetweenDates(@RequestParam("start") LocalDateTime start, @RequestParam("end") LocalDateTime end) {
        return screeningService.getScreeningsByData(start, end).stream().map(s -> new ScreeningVM(s)).collect(Collectors.toList());
    }

    @GetMapping(path = "/{screeningId}")
    public ScreeningVM getScreeningDetails(@PathVariable("screeningId") long screeningId) {
        return new ScreeningVM(screeningService.getScreeningDetails(screeningId));
    }

}
