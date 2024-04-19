package com.example.consumer;

import com.example.consumer.service.Converter;
import java.util.*;

public class Main {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                ServiceLoader<Converter> loader = ServiceLoader.load(Converter.class);
                Iterator<Converter> iterator = loader.iterator();
                double value;
                Converter converters = null;

                System.out.println("Choose currency pair to convert: ");
                int i = 1;
                while (iterator.hasNext()) {
                        Converter converter = iterator.next();
                        System.out.println(i + ". " + converter.getClass().getSimpleName());
                        i++;
                }


        }
}