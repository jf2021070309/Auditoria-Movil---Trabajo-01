package com.amazon.aps.iva.kf0;

import com.amazon.aps.iva.jf0.b0;
import com.amazon.aps.iva.jf0.f;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
/* compiled from: GsonConverterFactory.java */
/* loaded from: classes4.dex */
public final class a extends f.a {
    public final Gson a;

    public a(Gson gson) {
        this.a = gson;
    }

    public static a c(Gson gson) {
        if (gson != null) {
            return new a(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // com.amazon.aps.iva.jf0.f.a
    public final f a(Type type) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.a;
        return new b(gson, gson.getAdapter(typeToken));
    }

    @Override // com.amazon.aps.iva.jf0.f.a
    public final f<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.a;
        return new c(gson, gson.getAdapter(typeToken));
    }
}
