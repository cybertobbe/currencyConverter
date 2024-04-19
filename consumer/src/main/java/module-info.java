import com.example.consumer.service.Converter;

module consumer {
    requires service;
    requires provider;
    uses Converter;

}