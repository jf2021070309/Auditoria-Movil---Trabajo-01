package com.amazon.aps.iva.lh;

import android.content.Context;
import com.amazon.aps.iva.jh.j;
import com.amazon.aps.iva.jh.n;
import com.amazon.aps.iva.jh.o;
import com.google.gson.Gson;
import java.util.List;
/* compiled from: SubtitleOptionsModule.kt */
/* loaded from: classes.dex */
public final class c extends j {
    public c(Context context, Gson gson, d dVar, e eVar) {
        super(context, gson, dVar, eVar, "subtitle_options");
    }

    @Override // com.amazon.aps.iva.jh.j
    public final com.amazon.aps.iva.jh.e a(String str, List list) {
        com.amazon.aps.iva.yb0.j.f(str, "language");
        com.amazon.aps.iva.yb0.j.f(list, "fallbacks");
        return new o(str, list);
    }

    @Override // com.amazon.aps.iva.jh.j
    public final com.amazon.aps.iva.jh.f b(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "language");
        com.amazon.aps.iva.yb0.j.f(str2, "title");
        return new n(str, str2);
    }
}
