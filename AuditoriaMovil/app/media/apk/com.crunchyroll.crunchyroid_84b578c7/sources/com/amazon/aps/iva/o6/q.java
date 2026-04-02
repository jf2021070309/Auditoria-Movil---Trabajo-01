package com.amazon.aps.iva.o6;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: LoadEventInfo.java */
/* loaded from: classes.dex */
public final class q {
    public static final AtomicLong e = new AtomicLong();
    public final long a;
    public final Uri b;
    public final Map<String, List<String>> c;
    public final long d;

    public q(long j, com.amazon.aps.iva.w5.i iVar, long j2) {
        this(j, iVar.a, Collections.emptyMap(), 0L);
    }

    public static long a() {
        return e.getAndIncrement();
    }

    public q(long j, Uri uri, Map map, long j2) {
        this.a = j;
        this.b = uri;
        this.c = map;
        this.d = j2;
    }
}
