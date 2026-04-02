package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.amazon.aps.iva.dd.g;
import com.amazon.aps.iva.ec.h;
import com.amazon.aps.iva.hd.f;
import com.amazon.aps.iva.nc.m;
import com.bumptech.glide.a;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;
/* compiled from: GlideContext.java */
/* loaded from: classes.dex */
public final class c extends ContextWrapper {
    public static final com.amazon.aps.iva.ec.a k = new com.amazon.aps.iva.ec.a();
    public final com.amazon.aps.iva.oc.b a;
    public final f b;
    public final com.amazon.aps.iva.hb.e c;
    public final a.InterfaceC0942a d;
    public final List<g<Object>> e;
    public final Map<Class<?>, h<?, ?>> f;
    public final m g;
    public final d h;
    public final int i;
    public com.amazon.aps.iva.dd.h j;

    public c(Context context, com.amazon.aps.iva.oc.b bVar, com.amazon.aps.iva.ec.e eVar, com.amazon.aps.iva.hb.e eVar2, b.a aVar, com.amazon.aps.iva.x.a aVar2, List list, m mVar, d dVar, int i) {
        super(context.getApplicationContext());
        this.a = bVar;
        this.c = eVar2;
        this.d = aVar;
        this.e = list;
        this.f = aVar2;
        this.g = mVar;
        this.h = dVar;
        this.i = i;
        this.b = new f(eVar);
    }

    public final com.amazon.aps.iva.ec.d a() {
        return (com.amazon.aps.iva.ec.d) this.b.get();
    }
}
