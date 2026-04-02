package com.amazon.aps.iva.p60;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.Gson;
import java.util.Locale;
/* compiled from: LocaleProvider.kt */
/* loaded from: classes2.dex */
public interface f {

    /* compiled from: LocaleProvider.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static g a(Context context, Gson gson) {
            j.f(context, "context");
            j.f(gson, "gson");
            e eVar = e.h;
            j.f(eVar, "systemLocale");
            return new g(eVar, new d(context, gson, "index.i18n.json"));
        }
    }

    Locale a();
}
