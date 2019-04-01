package com.counter.aplication.dto;

import org.springframework.stereotype.Component;

@Component
public class CounterDto {

    public Long id;


    public String text;

    public CounterDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
