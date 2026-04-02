package com.amazon.aps.iva.p60;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.Gson;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;
/* compiled from: LocaleFallbacksLoader.kt */
/* loaded from: classes2.dex */
public final class d implements c {
    public final Map<String, a> a;

    public d(Context context, Gson gson, String str) {
        j.f(context, "context");
        j.f(gson, "gson");
        InputStream open = context.getAssets().open(str);
        try {
            j.e(open, "it");
            Map<String, a> a = ((b) gson.fromJson((Reader) new InputStreamReader(open, com.amazon.aps.iva.oe0.a.b), (Class<Object>) b.class)).a();
            com.amazon.aps.iva.a60.b.k(open, null);
            this.a = a;
        } finally {
        }
    }

    @Override // com.amazon.aps.iva.p60.c
    public final Map<String, a> a() {
        return this.a;
    }
}
