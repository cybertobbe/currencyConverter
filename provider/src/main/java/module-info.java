import com.example.consumer.provider.eursek;
import com.example.consumer.provider.eurusd;
import com.example.consumer.provider.gbpsek;
import com.example.consumer.provider.usdsek;
import com.example.consumer.service.Converter;

module provider {

    provides Converter with eursek, usdsek, gbpsek, eurusd;
    requires service;

}