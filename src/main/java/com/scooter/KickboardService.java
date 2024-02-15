package com.scooter;

import com.scooter.domain.*;

import java.util.List;

public interface KickboardService {
    public List<SignalTime> getSignalTimeForDate(ComDate comDate);
    public SignalTime getSignalTimeForKick(ComKickboard comKickboard);
}
