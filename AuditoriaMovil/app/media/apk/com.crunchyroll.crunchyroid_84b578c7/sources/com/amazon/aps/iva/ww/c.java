package com.amazon.aps.iva.ww;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ExponentialBackoffExecutor.kt */
/* loaded from: classes2.dex */
public final class c {
    public final l<Long, q> a;
    public final com.amazon.aps.iva.xb0.a<g> b;
    public final ConcurrentHashMap<String, g> c;

    public c() {
        a aVar = a.h;
        j.f(aVar, "delay");
        b bVar = b.h;
        j.f(bVar, "createNewSleepTimeProvider");
        this.a = aVar;
        this.b = bVar;
        this.c = new ConcurrentHashMap<>();
    }
}
