package com.amazon.aps.iva.kh;

import android.content.Context;
import com.amazon.aps.iva.jh.j;
import com.amazon.aps.iva.jh.l;
import com.google.gson.Gson;
import java.util.List;
/* compiled from: AudioLanguageOptionsModule.kt */
/* loaded from: classes.dex */
public final class a extends j {
    public a(Context context, Gson gson, b bVar, c cVar) {
        super(context, gson, bVar, cVar, "audio_language_options");
    }

    @Override // com.amazon.aps.iva.jh.j
    public final com.amazon.aps.iva.jh.e a(String str, List list) {
        com.amazon.aps.iva.yb0.j.f(str, "language");
        com.amazon.aps.iva.yb0.j.f(list, "fallbacks");
        return new com.amazon.aps.iva.jh.a(str);
    }

    @Override // com.amazon.aps.iva.jh.j
    public final com.amazon.aps.iva.jh.f b(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "language");
        com.amazon.aps.iva.yb0.j.f(str2, "title");
        return new l(str, str2);
    }
}
