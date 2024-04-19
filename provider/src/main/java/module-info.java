import com.example.consumer.provider.eurusd;
import com.example.consumer.provider.usdsek;
import com.example.consumer.service.Converter;

module provider {
    //exports com.example.consumer.provider;
    provides Converter with eurusd, usdsek;
    requires service;

}