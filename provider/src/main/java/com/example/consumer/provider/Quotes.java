package com.example.consumer.provider;

import com.example.consumer.service.Converter;


public class Quotes implements Converter {


    @Override
    public double convert(double value, double rate) {
        return value * rate;
    }
}
