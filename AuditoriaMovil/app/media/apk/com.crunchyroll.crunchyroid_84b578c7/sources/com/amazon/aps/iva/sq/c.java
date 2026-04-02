package com.amazon.aps.iva.sq;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: GlobalRum.kt */
/* loaded from: classes2.dex */
public final class c {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static f c = new l1();
    public static final AtomicReference<com.amazon.aps.iva.vq.a> d = new AtomicReference<>(new com.amazon.aps.iva.vq.a(null, 255));

    public static com.amazon.aps.iva.vq.a a() {
        com.amazon.aps.iva.vq.a aVar = d.get();
        j.e(aVar, "activeContext.get()");
        return aVar;
    }

    public static void b(com.amazon.aps.iva.qq.a aVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.amazon.aps.iva.qq.b) it.next()).a();
        }
    }

    public static void c(com.amazon.aps.iva.vq.a aVar, l lVar) {
        j.f(lVar, "applyOnlyIf");
        AtomicReference<com.amazon.aps.iva.vq.a> atomicReference = d;
        com.amazon.aps.iva.vq.a aVar2 = atomicReference.get();
        j.e(aVar2, "activeContext.get()");
        if (!((Boolean) lVar.invoke(aVar2)).booleanValue()) {
            return;
        }
        atomicReference.set(aVar);
        com.amazon.aps.iva.qq.a aVar3 = new com.amazon.aps.iva.qq.a(new com.amazon.aps.iva.qq.c(aVar.a, aVar.b, aVar.c));
        b(aVar3, com.amazon.aps.iva.tq.c.f.e);
        b(aVar3, com.amazon.aps.iva.fq.b.f.e);
        b(aVar3, com.amazon.aps.iva.jq.a.f.e);
        b(aVar3, com.amazon.aps.iva.lr.a.f.e);
    }
}
