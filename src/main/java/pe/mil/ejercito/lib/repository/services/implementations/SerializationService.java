package pe.mil.ejercito.lib.repository.services.implementations;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import pe.mil.ejercito.lib.repository.services.contracts.ISerializationService;
import pe.mil.ejercito.lib.utils.services.base.ReactorServiceBase;

import java.lang.reflect.Type;

/**
 * SerializationService
 * <p>
 * SerializationService class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BACSYSTEM APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
@Log4j2
@Service
public class SerializationService extends ReactorServiceBase implements ISerializationService {

    private final Gson gson;

    public SerializationService() {
        super("SerializationService");
        this.gson = new GsonBuilder().create();

    }

    @Override
    public <T> T serializedFromObject(Object source, Class<T> classOfDestination) {
        log.debug("1 method object source: {}", source.toString());
        log.debug("1 method classOfDestination to serialize: {}", classOfDestination.toString());
        return gson.fromJson(gson.toJson(source), classOfDestination);

    }

    @Override
    public <T> T serializedFromObject(Object source, Class<T> classOfDestination, Gson gsonCustomDeserializer) {
        log.debug("2 method object source: {}", source.toString());
        log.debug("2 method classOfDestination to serialize: {}", classOfDestination.toString());
        return gsonCustomDeserializer.fromJson(gson.toJson(source), classOfDestination);

    }

    @Override
    public <T> T serializedFromObject(Object source, Type type) {
        log.debug("3 method object source: {}", source.toString());
        log.debug("3 method type to serialize: {}", type.toString());
        return gson.fromJson(gson.toJson(source), type);

    }

    @Override
    public <T> T serializedFromObject(Object source, Type type, Gson gsonCustomDeserializer) {
        log.debug("4 method object source: {}", source.toString());
        log.debug("4 method type to serialize: {}", type.toString());
        return gsonCustomDeserializer.fromJson(gson.toJson(source), type);

    }

    @Override
    public <T> T serializedFromJson(String json, Type type) {
        log.debug("5 method json source: {}", json);
        log.debug("5 method type to serialize: {}", type.toString());
        return gson.fromJson(json, type);

    }

    @Override
    public <T> T serializedFromJson(String json, Type type, Gson gsonCustomDeserializer) {
        log.debug("6 method json source: {}", json);
        log.debug("6 method type to serialize: {}", type.toString());
        return gsonCustomDeserializer.fromJson(json, type);

    }

    @Override
    public String serializedToJson(Object source) {
        return gson.toJson(source);

    }
}


