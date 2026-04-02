package com.amazon.aps.iva.ue0;

import com.amazon.aps.iva.se0.j0;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes4.dex */
public class x<E> extends v {
    public final E e;
    public final com.amazon.aps.iva.se0.m<com.amazon.aps.iva.kb0.q> f;

    /* JADX WARN: Multi-variable type inference failed */
    public x(Object obj, com.amazon.aps.iva.se0.n nVar) {
        this.e = obj;
        this.f = nVar;
    }

    @Override // com.amazon.aps.iva.ue0.v
    public final void q() {
        this.f.l();
    }

    @Override // com.amazon.aps.iva.ue0.v
    public final E r() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.ue0.v
    public final void s(j<?> jVar) {
        Throwable th = jVar.e;
        if (th == null) {
            th = new l("Channel was closed");
        }
        this.f.resumeWith(com.amazon.aps.iva.ab.x.H(th));
    }

    @Override // com.amazon.aps.iva.ue0.v
    public final com.amazon.aps.iva.xe0.s t() {
        if (this.f.d(com.amazon.aps.iva.kb0.q.a, null) == null) {
            return null;
        }
        return com.amazon.aps.iva.ff0.b.c;
    }

    @Override // com.amazon.aps.iva.xe0.h
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(j0.e(this));
        sb.append('(');
        return defpackage.b.b(sb, this.e, ')');
    }
}
