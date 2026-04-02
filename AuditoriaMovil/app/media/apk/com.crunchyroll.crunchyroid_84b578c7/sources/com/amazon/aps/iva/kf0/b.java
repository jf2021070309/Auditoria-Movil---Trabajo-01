package com.amazon.aps.iva.kf0;

import com.amazon.aps.iva.ef0.e;
import com.amazon.aps.iva.jf0.f;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.apache.commons.codec.binary.Hex;
/* compiled from: GsonRequestBodyConverter.java */
/* loaded from: classes4.dex */
public final class b<T> implements f<T, RequestBody> {
    public static final MediaType c = MediaType.get("application/json; charset=UTF-8");
    public static final Charset d = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
    public final Gson a;
    public final TypeAdapter<T> b;

    public b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    @Override // com.amazon.aps.iva.jf0.f
    public final RequestBody convert(Object obj) throws IOException {
        e eVar = new e();
        JsonWriter newJsonWriter = this.a.newJsonWriter(new OutputStreamWriter(new com.amazon.aps.iva.ef0.f(eVar), d));
        this.b.write(newJsonWriter, obj);
        newJsonWriter.close();
        return RequestBody.create(c, eVar.h0());
    }
}
