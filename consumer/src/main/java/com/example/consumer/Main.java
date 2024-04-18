package com.example.consumer;

import com.example.consumer.service.Converter;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Choose currency pair to convert: 1. EURSEK 2. USDSEK");
                int choice = sc.nextInt();
                double value = 0.0;
                double rate = 0.0;
                
                ServiceLoader<Converter> loader;
                Converter converter = null;
                switch (choice) {
                        case 1:
                                rate = 11.65;
                                System.out.println("1 EUR is " + rate + " SEK: ");
                                System.out.println("Enter amount of EUR to convert to SEK: ");
                                value = sc.nextDouble();


                                loader = ServiceLoader.load(Converter.class);
                                converter = loader.stream()
                                        .filter(provider -> provider.type().getName().equals("com.example.consumer.provider.QuotesEurSek"))
                                        .findFirst()
                                        .orElseThrow(() -> new IllegalArgumentException("No suitable converter found"))
                                        .get();
                                break;
                        case 2:

                                rate = 10.90;
                                System.out.println("1 USD is " + rate + " SEK: ");
                                System.out.println("Enter amount of USD to convert to SEK: ");
                                value = sc.nextDouble();


                                loader = ServiceLoader.load(Converter.class);
                                converter = loader.stream()
                                        .filter(provider -> provider.type().getName().equals("com.example.consumer.provider.QuotesUsdSek"))
                                        .findFirst()
                                        .orElseThrow(() -> new IllegalArgumentException("No suitable converter found"))
                                        .get();
                                break;
                        default:
                                System.out.println("Invalid choice");
                                System.exit(1);
                }


                        System.out.println(converter.convert(value, rate) + " SEK");




        }
}
