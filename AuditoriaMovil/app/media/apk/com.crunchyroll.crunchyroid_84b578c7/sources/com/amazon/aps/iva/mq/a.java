package com.amazon.aps.iva.mq;

import com.amazon.aps.iva.yb0.j;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: CombinedLogHandler.kt */
/* loaded from: classes2.dex */
public final class a implements e {
    public a() {
        throw null;
    }

    @Override // com.amazon.aps.iva.mq.e
    public final void e(int i, String str, Throwable th, LinkedHashMap linkedHashMap, CopyOnWriteArraySet copyOnWriteArraySet, Long l) {
        j.f(str, "message");
        j.f(copyOnWriteArraySet, "tags");
        throw null;
    }
}
