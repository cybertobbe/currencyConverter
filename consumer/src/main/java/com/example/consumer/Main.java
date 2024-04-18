package com.example.consumer;

import com.example.consumer.service.Converter;

import java.util.ServiceLoader;

public class Main {

        public static void main(String[] args) {

                ServiceLoader<Converter> loader = ServiceLoader.load(Converter.class);
                for (Converter converter : loader) {

                    System.out.println(converter.convert(150.0, 10.2));

                }


        }
}
