package com.amazon.aps.iva.te0;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.m;
import com.amazon.aps.iva.se0.n;
/* compiled from: Runnable.kt */
/* loaded from: classes4.dex */
public final class d implements Runnable {
    public final /* synthetic */ m b;
    public final /* synthetic */ f c;

    public d(n nVar, f fVar) {
        this.b = nVar;
        this.c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.v(this.c, q.a);
    }
}
