package com.scooter;

import com.scooter.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final KickboardService kickboardService;

    @GetMapping(value = "/scooter/{table}")
    public SignalTime getHelmetWearOne(@PathVariable String table,
                                       ComKickboard comKickboard) {
        comKickboard.setTable(table);
        return kickboardService.getSignalTimeForKick(comKickboard);
    }

    @GetMapping(value = "/scooter{table}/list")
    public List<SignalTime> getHelmetWearList(@PathVariable String table,
                                              ComDate comDate) {
        comDate.setTable(table);
        if(comDate.getDate()==null){
            setSysDate(comDate);
        }
        return kickboardService.getSignalTimeForDate(comDate);
    }

    public void setSysDate(ComDate comDate){
        LocalDate now = LocalDate.now();
        String date = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        comDate.setDate(date);
    }

}
