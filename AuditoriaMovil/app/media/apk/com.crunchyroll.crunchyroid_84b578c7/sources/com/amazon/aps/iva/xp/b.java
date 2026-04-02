package com.amazon.aps.iva.xp;

import java.util.LinkedList;
/* compiled from: TrackingConsentProvider.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final LinkedList<com.amazon.aps.iva.rq.b> b = new LinkedList<>();
    public volatile com.amazon.aps.iva.rq.a c;

    public b(com.amazon.aps.iva.rq.a aVar) {
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.xp.a
    public final synchronized void b() {
        this.b.clear();
    }

    @Override // com.amazon.aps.iva.xp.a
    public final synchronized void d(com.amazon.aps.iva.rq.b bVar) {
        this.b.add(bVar);
    }

    @Override // com.amazon.aps.iva.xp.a
    public final com.amazon.aps.iva.rq.a f() {
        return this.c;
    }
}
