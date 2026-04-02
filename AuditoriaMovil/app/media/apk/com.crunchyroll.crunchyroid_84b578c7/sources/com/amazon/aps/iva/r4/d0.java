package com.amazon.aps.iva.r4;

import android.content.Context;
import android.os.Bundle;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.h2;
/* compiled from: GlanceAppWidget.kt */
/* loaded from: classes.dex */
public final class d0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ Context h;
    public final /* synthetic */ b i;
    public final /* synthetic */ Bundle j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ long l;
    public final /* synthetic */ z m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, b bVar, Bundle bundle, Object obj, long j, z zVar) {
        super(2);
        this.h = context;
        this.i = bVar;
        this.j = bundle;
        this.k = obj;
        this.l = j;
        this.m = zVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.o0.l0.a(new h2[]{com.amazon.aps.iva.p4.h.b.b(this.h), com.amazon.aps.iva.p4.h.d.b(this.i), i.a.b(this.j), com.amazon.aps.iva.p4.h.c.b(this.k), com.amazon.aps.iva.p4.h.a.b(new com.amazon.aps.iva.o2.g(this.l))}, com.amazon.aps.iva.v0.b.b(iVar2, -274307977, new c0(this.m)), iVar2, 56);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
