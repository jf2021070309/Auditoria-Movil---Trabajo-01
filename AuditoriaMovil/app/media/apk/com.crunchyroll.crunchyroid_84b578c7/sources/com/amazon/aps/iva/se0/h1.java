package com.amazon.aps.iva.se0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: JobSupport.kt */
/* loaded from: classes4.dex */
public final class h1 extends l1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(h1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;
    public final com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> f;

    /* JADX WARN: Multi-variable type inference failed */
    public h1(com.amazon.aps.iva.xb0.l<? super Throwable, com.amazon.aps.iva.kb0.q> lVar) {
        this.f = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        q(th);
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.se0.y
    public final void q(Throwable th) {
        if (g.compareAndSet(this, 0, 1)) {
            this.f.invoke(th);
        }
    }
}
