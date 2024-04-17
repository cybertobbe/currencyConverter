package com.example.service.consumer;

import com.example.service.Converter;

import java.util.ServiceLoader;

public class Main {

        public static void main(String[] args) {

                ServiceLoader<Converter> loader = ServiceLoader.load(Converter.class);
                for (Converter converter : loader) {

                    System.out.println(converter.convert(100.00, 10.12));

                }


        }
}
