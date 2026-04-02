package com.amazon.aps.iva.kh;

import android.content.Context;
import com.amazon.aps.iva.jh.h;
import com.amazon.aps.iva.jh.i;
import com.amazon.aps.iva.p60.f;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.GsonHolder;
/* compiled from: AudioLanguageOptionsModule.kt */
/* loaded from: classes.dex */
public final class d {
    public i a;

    public final f a(Context context) {
        j.f(context, "context");
        return new f(b(), new h(com.amazon.aps.iva.o60.e.a(context)), f.a.a(context, GsonHolder.getInstance()));
    }

    public final i b() {
        i iVar = this.a;
        if (iVar != null) {
            return iVar;
        }
        j.m("store");
        throw null;
    }
}
