package com.google.crypto.tink.jwt;

import com.google.crypto.tink.internal.JsonParser;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class JsonUtil {
    private JsonUtil() {
    }

    public static boolean isValidString(String str) {
        return JsonParser.isValidString(str);
    }

    public static JsonObject parseJson(String str) throws JwtInvalidException {
        try {
            return JsonParser.parse(str).getAsJsonObject();
        } catch (JsonParseException | IOException | IllegalStateException e) {
            throw new JwtInvalidException("invalid JSON: " + e);
        }
    }

    public static JsonArray parseJsonArray(String str) throws JwtInvalidException {
        try {
            return JsonParser.parse(str).getAsJsonArray();
        } catch (JsonParseException | IOException | IllegalStateException e) {
            throw new JwtInvalidException("invalid JSON: " + e);
        }
    }
}
