package com.example.consumer;


import com.example.consumer.service.Converter;
import java.util.*;

public class Main {

        public static void main(String[] args) {

                //Menu
                Scanner sc = new Scanner(System.in);
                ServiceLoader<Converter> loader = ServiceLoader.load(Converter.class);
                Iterator<Converter> iterator = loader.iterator();
                double value;
                Converter converters = null;

                System.out.println("Choose currency pair to convert: ");
                int i = 1;
                while (iterator.hasNext()) {
                        Converter converter = iterator.next();
                        System.out.println(i + ". " + converter.getClass().getSimpleName() + " -- Rate: " +  converter.convert(1));
                        i++;
                }

                int choice = sc.nextInt();
                if (choice > 0) {
                        i = 1;
                        for (Converter converter : loader) {
                                if (i == choice) {
                                        converters = converter;
                                        break;
                                }
                                i++;
                        }
                        System.out.println("Enter value to convert: ");
                        value = sc.nextDouble();
                        System.out.println("Converted amount is: " + converters.convert(value) + " " + converters.getCounterCurrency());
                }
                else {
                        System.out.println("Invalid choice");
                        System.exit(1);
                }

        }
}