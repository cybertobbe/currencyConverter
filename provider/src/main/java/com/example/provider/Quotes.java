package com.example.provider;

import com.example.service.Converter;



public class Quotes implements Converter {


    @Override
    public double convert(double value, double rate) {
        return value * rate;
    }
}
