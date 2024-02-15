package com.scooter.domain;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class SignalTime {
    private String signal;
    private Timestamp time;
    private Integer kickboard_idx;
}
