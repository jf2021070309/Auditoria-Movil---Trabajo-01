package com.amazon.aps.iva.se0;

import com.amazon.aps.iva.se0.j1;
/* compiled from: AbstractCoroutine.kt */
/* loaded from: classes4.dex */
public abstract class a<T> extends o1 implements com.amazon.aps.iva.ob0.d<T>, g0 {
    public final com.amazon.aps.iva.ob0.g c;

    public a(com.amazon.aps.iva.ob0.g gVar, boolean z) {
        super(z);
        e0((j1) gVar.get(j1.b.b));
        this.c = gVar.plus(this);
    }

    @Override // com.amazon.aps.iva.se0.o1
    public final String M() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // com.amazon.aps.iva.se0.o1
    public final void d0(z zVar) {
        i.c(this.c, zVar);
    }

    @Override // com.amazon.aps.iva.ob0.d
    public final com.amazon.aps.iva.ob0.g getContext() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.se0.o1, com.amazon.aps.iva.se0.j1
    public boolean isActive() {
        return super.isActive();
    }

    @Override // com.amazon.aps.iva.se0.o1
    public String j0() {
        return super.j0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.se0.o1
    public final void n0(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            w0(wVar.a, wVar.a());
            return;
        }
        x0(obj);
    }

    @Override // com.amazon.aps.iva.ob0.d
    public final void resumeWith(Object obj) {
        Throwable a = com.amazon.aps.iva.kb0.k.a(obj);
        if (a != null) {
            obj = new w(a, false);
        }
        Object h0 = h0(obj);
        if (h0 == com.amazon.aps.iva.ab.t.e) {
            return;
        }
        y(h0);
    }

    public void x0(T t) {
    }

    public void w0(Throwable th, boolean z) {
    }
}
