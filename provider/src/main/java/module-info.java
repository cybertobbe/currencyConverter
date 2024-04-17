import com.example.provider.Quotes;

module provider {
    provides com.example.service.Converter with Quotes;
    requires service;

}