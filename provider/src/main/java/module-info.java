import com.example.provider.Quotes;

module provider {
    exports com.example.provider;
    requires service;
    provides com.example.service.Converter with Quotes;
}