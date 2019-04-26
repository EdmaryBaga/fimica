package io.bunsan.filmica.model;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

public class GenreDeserializer implements JsonDeserializer<Genre> {
    @Override
    public Genre deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject genreJson = json.getAsJsonObject();
        Set<Map.Entry<String, JsonElement>> genreSet = genreJson.entrySet();
        Map.Entry<String, JsonElement> entry = genreSet.iterator().next();

        String name = entry.getKey();

        JsonElement descriptionJson = entry.getValue();
        JsonObject descriptionObject = descriptionJson.getAsJsonObject();
        String description = descriptionObject.get("description").getAsString();

        return new Genre(name, description);
    }
}
