package com.amazon.aps.iva.ue0;
/* compiled from: Produce.kt */
/* loaded from: classes4.dex */
public final class p<E> extends g<E> implements q<E> {
    @Override // com.amazon.aps.iva.se0.a, com.amazon.aps.iva.se0.o1, com.amazon.aps.iva.se0.j1
    public final boolean isActive() {
        return super.isActive();
    }

    @Override // com.amazon.aps.iva.se0.a
    public final void w0(Throwable th, boolean z) {
        if (!this.d.r(th) && !z) {
            com.amazon.aps.iva.se0.i.c(this.c, th);
        }
    }

    @Override // com.amazon.aps.iva.se0.a
    public final void x0(com.amazon.aps.iva.kb0.q qVar) {
        this.d.r(null);
    }

    @Override // com.amazon.aps.iva.ue0.q
    public final p C() {
        return this;
    }
}
