package com.amazon.aps.iva.mq;

import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ConditionalLogHandler.kt */
/* loaded from: classes2.dex */
public final class b implements e {
    public final e b;
    public final p<Integer, Throwable, Boolean> c;

    public b(f fVar, com.amazon.aps.iva.dq.b bVar) {
        j.f(bVar, "condition");
        this.b = fVar;
        this.c = bVar;
    }

    @Override // com.amazon.aps.iva.mq.e
    public final void e(int i, String str, Throwable th, LinkedHashMap linkedHashMap, CopyOnWriteArraySet copyOnWriteArraySet, Long l) {
        j.f(str, "message");
        j.f(copyOnWriteArraySet, "tags");
        if (this.c.invoke(Integer.valueOf(i), th).booleanValue()) {
            this.b.e(i, str, th, linkedHashMap, copyOnWriteArraySet, l);
        }
    }
}
