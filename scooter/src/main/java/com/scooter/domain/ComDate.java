package com.scooter.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class ComDate {
    private Integer company_id;
    private Integer kickboard_id;
    private String date;
    private String table;

    public ComDate() {
    }

    public ComDate(Integer company_id, Integer kickboard_id, String date) {
        this.company_id = company_id;
        this.kickboard_id = kickboard_id;
        this.date = date;
    }
}
