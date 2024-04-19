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


                ServiceLoader<Converter> loader;
                Converter converter;
                switch (choice) {
                        case 1:

                                System.out.println("Enter amount of EUR to convert to SEK: ");
                                value = sc.nextDouble();

                                loader = ServiceLoader.load(Converter.class);
                                if(loader.iterator().hasNext()){
                                        converter = loader.iterator().next();
                                        System.out.println(converter.convert(value) + " SEK");
                                }
                                else
                                        System.out.println("No converter found for EURSEK");

                                break;

                        case 2:

                                System.out.println("Enter amount of USD to convert to SEK: ");
                                value = sc.nextDouble();

                                loader = ServiceLoader.load(Converter.class);
                                if(loader.iterator().hasNext()){
                                        converter = loader.iterator().next();
                                        System.out.println(converter.convert(value) + " SEK");
                                }
                                else
                                        System.out.println("No converter found for USDSEK");

                                break;
                        default:
                                System.out.println("Invalid choice");
                                System.exit(1);
                }

        }
}
