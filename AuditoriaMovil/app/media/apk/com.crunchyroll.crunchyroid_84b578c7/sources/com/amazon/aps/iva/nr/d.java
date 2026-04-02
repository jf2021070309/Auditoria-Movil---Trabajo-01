package com.amazon.aps.iva.nr;

import com.amazon.aps.iva.sp.h;
import com.amazon.aps.iva.yb0.j;
/* compiled from: SpanMapperSerializer.kt */
/* loaded from: classes2.dex */
public final class d implements h<com.amazon.aps.iva.ur.a> {
    public final com.amazon.aps.iva.lp.b<com.amazon.aps.iva.ur.a, com.amazon.aps.iva.qr.a> b;
    public final com.amazon.aps.iva.gq.a<com.amazon.aps.iva.qr.a> c;
    public final h<com.amazon.aps.iva.qr.a> d;

    public d(a aVar, b bVar, c cVar) {
        this.b = aVar;
        this.c = bVar;
        this.d = cVar;
    }

    @Override // com.amazon.aps.iva.sp.h
    public final String serialize(com.amazon.aps.iva.ur.a aVar) {
        com.amazon.aps.iva.ur.a aVar2 = aVar;
        j.f(aVar2, "model");
        com.amazon.aps.iva.qr.a a = this.c.a(this.b.a(aVar2));
        if (a == null) {
            return null;
        }
        return this.d.serialize(a);
    }
}
