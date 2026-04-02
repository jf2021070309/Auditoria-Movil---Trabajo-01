package com.amazon.aps.iva.nr;

import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.qr.a;
import com.amazon.aps.iva.yb0.j;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: DdSpanToSpanEventMapper.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.lp.b<com.amazon.aps.iva.ur.a, com.amazon.aps.iva.qr.a> {
    public final com.amazon.aps.iva.cq.c a;
    public final com.amazon.aps.iva.rp.c b;
    public final com.amazon.aps.iva.oq.d c;
    public final com.amazon.aps.iva.aq.b d;

    public a(com.amazon.aps.iva.cq.c cVar, com.amazon.aps.iva.rp.c cVar2, com.amazon.aps.iva.oq.b bVar, com.amazon.aps.iva.aq.b bVar2) {
        j.f(cVar, "timeProvider");
        j.f(cVar2, "networkInfoProvider");
        j.f(bVar, "userInfoProvider");
        j.f(bVar2, "appVersionProvider");
        this.a = cVar;
        this.b = cVar2;
        this.c = bVar;
        this.d = bVar2;
    }

    @Override // com.amazon.aps.iva.lp.b
    public final com.amazon.aps.iva.qr.a a(Object obj) {
        Long l;
        String l2;
        a.f fVar;
        String l3;
        String l4;
        boolean z;
        String str;
        long j;
        com.amazon.aps.iva.ur.a aVar = (com.amazon.aps.iva.ur.a) obj;
        j.f(aVar, "model");
        long i = this.a.i();
        String str2 = null;
        if (aVar.b.f.longValue() == 0) {
            l = 1L;
        } else {
            l = null;
        }
        Map<String, Number> c = aVar.b.c();
        j.e(c, "event.metrics");
        a.d dVar = new a.d(l, c);
        com.amazon.aps.iva.eq.a g = this.b.g();
        Long l5 = g.c;
        String str3 = g.b;
        if (l5 == null && str3 == null) {
            fVar = null;
        } else {
            if (l5 == null) {
                l2 = null;
            } else {
                l2 = l5.toString();
            }
            fVar = new a.f(l2, str3);
        }
        Long l6 = g.f;
        if (l6 == null) {
            l3 = null;
        } else {
            l3 = l6.toString();
        }
        Long l7 = g.e;
        if (l7 == null) {
            l4 = null;
        } else {
            l4 = l7.toString();
        }
        Long l8 = g.d;
        if (l8 != null) {
            str2 = l8.toString();
        }
        a.e eVar = new a.e(new a.C0654a(fVar, l3, l4, str2, g.a.toString()));
        com.amazon.aps.iva.eq.b b = this.c.b();
        a.i iVar = new a.i(b.a, b.b, b.c, b.d);
        String version = this.d.getVersion();
        a.b bVar = new a.b(com.amazon.aps.iva.lp.a.r);
        a.g gVar = new a.g();
        a.h hVar = new a.h(com.amazon.aps.iva.lp.a.s);
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : aVar.b.c.entrySet()) {
            hashMap.put((String) entry.getKey(), (String) entry.getValue());
        }
        for (Map.Entry<String, Object> entry2 : aVar.h().entrySet()) {
            hashMap.put(entry2.getKey(), String.valueOf(entry2.getValue()));
        }
        a.c cVar = new a.c(version, bVar, gVar, hVar, iVar, eVar, hashMap);
        BigInteger bigInteger = aVar.b.d;
        j.e(bigInteger, "model.traceId");
        String S = w.S(bigInteger);
        BigInteger bigInteger2 = aVar.b.e;
        j.e(bigInteger2, "model.spanId");
        String S2 = w.S(bigInteger2);
        BigInteger bigInteger3 = aVar.b.f;
        j.e(bigInteger3, "model.parentId");
        String S3 = w.S(bigInteger3);
        com.amazon.aps.iva.ur.b bVar2 = aVar.b;
        if (bVar2.i != null && !bVar2.i.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = bVar2.i;
        } else {
            str = bVar2.j;
        }
        String str4 = str;
        String str5 = aVar.b.j;
        String str6 = aVar.b.h;
        long j2 = aVar.e.get();
        long j3 = aVar.d;
        if (j3 <= 0) {
            j3 = TimeUnit.MICROSECONDS.toNanos(aVar.c);
        }
        long j4 = j3 + i;
        Boolean valueOf = Boolean.valueOf(aVar.b.k);
        j.e(valueOf, "model.isError");
        if (valueOf.booleanValue()) {
            j = 1;
        } else {
            j = 0;
        }
        j.e(str4, "resourceName");
        j.e(str5, "operationName");
        j.e(str6, "serviceName");
        return new com.amazon.aps.iva.qr.a(S, S2, S3, str4, str5, str6, j2, j4, j, dVar, cVar);
    }
}
