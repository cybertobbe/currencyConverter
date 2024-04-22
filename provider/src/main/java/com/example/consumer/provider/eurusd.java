package com.example.consumer.provider;

import com.example.consumer.service.Converter;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class eurusd  implements Converter {

    @Override
    public BigDecimal convert(double value) {
        double rate = 1.08;
        BigDecimal bd = new BigDecimal(Double.toString(value*rate));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd;

    }
    @Override
    public String getCounterCurrency() {
        return "USD";
    }
}
