package com.learning.spring.business.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

//TODO: entity nie będzie w pakiecie biznesowym, będziemy je po prostu w entity
/**
 * Created by Beata Kalis on 2017-02-08.
 */

//TODO: wiem że Lombok sporo ułatwia, ale raczej się nie spotkałem by się go używało, a niektóre technologie się podejrzewam (jak np. JSF z nim nie współpracują bo działą bezpośrednio podcza kompilacj)
//TODO: osobiście wolałbym go nie używać ale przedyskutujemy to :) 
@Data
@AllArgsConstructor
public class User {

    private String firstName;

    private String lastName;

}
