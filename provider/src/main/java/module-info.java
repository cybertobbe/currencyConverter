import com.example.consumer.provider.Quotes;
import com.example.consumer.service.Converter;

module provider {
    provides Converter with Quotes;
    requires service;

}