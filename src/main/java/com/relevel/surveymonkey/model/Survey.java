package com.relevel.surveymonkey.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Survey {

    @Id
    private long survey_id;
}
