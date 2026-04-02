package com.amazon.aps.iva.u9;

import androidx.work.impl.WorkDatabase;
/* compiled from: WorkForegroundUpdater.java */
/* loaded from: classes.dex */
public final class p implements com.amazon.aps.iva.k9.h {
    public final com.amazon.aps.iva.w9.a a;
    public final com.amazon.aps.iva.s9.a b;
    public final com.amazon.aps.iva.t9.q c;

    static {
        com.amazon.aps.iva.k9.m.e("WMFgUpdater");
    }

    public p(WorkDatabase workDatabase, com.amazon.aps.iva.s9.a aVar, com.amazon.aps.iva.w9.a aVar2) {
        this.b = aVar;
        this.a = aVar2;
        this.c = workDatabase.n();
    }
}
