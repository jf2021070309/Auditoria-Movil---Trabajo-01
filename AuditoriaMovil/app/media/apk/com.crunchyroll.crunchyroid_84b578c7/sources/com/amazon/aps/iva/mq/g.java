package com.amazon.aps.iva.mq;

import com.amazon.aps.iva.o6.h;
import com.amazon.aps.iva.yb0.j;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: TelemetryLogHandler.kt */
/* loaded from: classes2.dex */
public final class g implements e {
    public final h b;

    public g(h hVar) {
        j.f(hVar, "telemetry");
        this.b = hVar;
    }

    @Override // com.amazon.aps.iva.mq.e
    public final void e(int i, String str, Throwable th, LinkedHashMap linkedHashMap, CopyOnWriteArraySet copyOnWriteArraySet, Long l) {
        j.f(str, "message");
        j.f(copyOnWriteArraySet, "tags");
        com.amazon.aps.iva.ar.a aVar = null;
        h hVar = this.b;
        if (i != 5 && i != 6) {
            hVar.getClass();
            com.amazon.aps.iva.sq.f fVar = com.amazon.aps.iva.sq.c.c;
            if (fVar instanceof com.amazon.aps.iva.ar.a) {
                aVar = (com.amazon.aps.iva.ar.a) fVar;
            }
            if (aVar == null) {
                aVar = new com.amazon.aps.iva.ar.d();
            }
            aVar.h(str);
            return;
        }
        hVar.getClass();
        com.amazon.aps.iva.sq.f fVar2 = com.amazon.aps.iva.sq.c.c;
        if (fVar2 instanceof com.amazon.aps.iva.ar.a) {
            aVar = (com.amazon.aps.iva.ar.a) fVar2;
        }
        if (aVar == null) {
            aVar = new com.amazon.aps.iva.ar.d();
        }
        aVar.n(str, th);
    }
}
