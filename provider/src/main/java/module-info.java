import com.example.consumer.provider.QuotesEurSek;
import com.example.consumer.provider.QuotesUsdSek;
import com.example.consumer.service.Converter;

module provider {
    exports com.example.consumer.provider;
    provides Converter with QuotesEurSek, QuotesUsdSek;
    requires service;

}