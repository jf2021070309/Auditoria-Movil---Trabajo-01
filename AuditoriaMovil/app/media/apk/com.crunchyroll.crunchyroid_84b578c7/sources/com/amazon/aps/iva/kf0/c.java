package com.amazon.aps.iva.kf0;

import com.amazon.aps.iva.jf0.f;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.ResponseBody;
/* compiled from: GsonResponseBodyConverter.java */
/* loaded from: classes4.dex */
public final class c<T> implements f<ResponseBody, T> {
    public final Gson a;
    public final TypeAdapter<T> b;

    public c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    @Override // com.amazon.aps.iva.jf0.f
    public final Object convert(ResponseBody responseBody) throws IOException {
        ResponseBody responseBody2 = responseBody;
        JsonReader newJsonReader = this.a.newJsonReader(responseBody2.charStream());
        try {
            T read = this.b.read(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody2.close();
        }
    }
}
