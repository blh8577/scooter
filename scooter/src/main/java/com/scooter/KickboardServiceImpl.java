package com.scooter;

import com.scooter.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class KickboardServiceImpl implements KickboardService {
    private final TestMapper testMapper;

    @Override
    public List<SignalTime> getSignalTimeForDate(ComDate comDate) {
        return testMapper.getSignalTimeList(comDate);
    }

    @Override
    public SignalTime getSignalTimeForKick(ComKickboard comKickboard) {
        return testMapper.getSignalTimeOne(comKickboard);
    }
}
