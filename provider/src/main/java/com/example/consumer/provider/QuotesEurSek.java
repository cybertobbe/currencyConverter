package com.example.consumer.provider;

import com.example.consumer.service.Converter;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class QuotesEurSek implements Converter {


    @Override
    public double convert(double value, double rate) {
        BigDecimal bd = new BigDecimal(Double.toString(value*rate));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();

    }
}
