package com.scooter;

import com.scooter.domain.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<SignalTime> getSignalTimeList(ComDate com);
    SignalTime getSignalTimeOne(ComKickboard comKickboard);
}
