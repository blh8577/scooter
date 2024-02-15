package com.scooter.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComKickboard {
    private Integer company_id;
    private Integer kickboard_id;
    private String table;

    public ComKickboard() {
    }

    public ComKickboard(Integer company_id, Integer kickboard_id) {
        this.company_id = company_id;
        this.kickboard_id = kickboard_id;
    }
}
