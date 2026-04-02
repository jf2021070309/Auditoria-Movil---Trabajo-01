package com.amazon.aps.iva.mq;

import com.amazon.aps.iva.yb0.j;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: InternalLogHandler.kt */
/* loaded from: classes2.dex */
public final class d implements e {
    public final e b;
    public final e c;

    public d(e eVar, g gVar) {
        this.b = eVar;
        this.c = gVar;
    }

    @Override // com.amazon.aps.iva.mq.e
    public final void e(int i, String str, Throwable th, LinkedHashMap linkedHashMap, CopyOnWriteArraySet copyOnWriteArraySet, Long l) {
        boolean z;
        j.f(str, "message");
        j.f(copyOnWriteArraySet, "tags");
        int i2 = i & (-33);
        this.b.e(i2, str, th, linkedHashMap, copyOnWriteArraySet, l);
        if ((i & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.c.e(i2, str, th, linkedHashMap, copyOnWriteArraySet, l);
        }
    }
}
