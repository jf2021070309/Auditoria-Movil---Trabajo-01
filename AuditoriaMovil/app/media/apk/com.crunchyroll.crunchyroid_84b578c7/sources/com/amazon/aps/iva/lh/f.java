package com.amazon.aps.iva.lh;

import android.content.Context;
import com.amazon.aps.iva.jh.h;
import com.amazon.aps.iva.k.w;
import com.amazon.aps.iva.p60.f;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.GsonHolder;
/* compiled from: SubtitleOptionsModule.kt */
/* loaded from: classes.dex */
public final class f {
    public static c a;
    public static w b;

    public static b a(Context context) {
        j.f(context, "context");
        c cVar = a;
        if (cVar != null) {
            return new b(cVar, new h(com.amazon.aps.iva.o60.e.a(context)), f.a.a(context, GsonHolder.getInstance()));
        }
        j.m("store");
        throw null;
    }
}
