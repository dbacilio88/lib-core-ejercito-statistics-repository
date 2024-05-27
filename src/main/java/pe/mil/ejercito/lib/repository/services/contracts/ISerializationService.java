package pe.mil.ejercito.lib.repository.services.contracts;

import com.google.gson.Gson;

import java.lang.reflect.Type;

/**
 * ISerializationService
 * <p>
 * ISerializationService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BACSYSTEM APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface ISerializationService {

    <T> T serializedFromObject(Object source, Class<T> classOfDestination);

    <T> T serializedFromObject(Object source, Class<T> classOfDestination, Gson gsonCustomDeserializer);

    <T> T serializedFromObject(Object source, Type type);

    <T> T serializedFromObject(Object source, Type type, Gson gsonCustomDeserializer);

    <T> T serializedFromJson(String json, Type type);

    <T> T serializedFromJson(String json, Type type, Gson gsonCustomDeserializer);

    String serializedToJson(Object source);

}
