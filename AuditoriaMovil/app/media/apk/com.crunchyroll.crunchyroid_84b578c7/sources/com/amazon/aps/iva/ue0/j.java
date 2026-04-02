package com.amazon.aps.iva.ue0;

import com.amazon.aps.iva.se0.j0;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes4.dex */
public final class j<E> extends v implements t<E> {
    public final Throwable e;

    public j(Throwable th) {
        this.e = th;
    }

    @Override // com.amazon.aps.iva.ue0.t
    public final com.amazon.aps.iva.xe0.s a(Object obj) {
        return com.amazon.aps.iva.ff0.b.c;
    }

    @Override // com.amazon.aps.iva.ue0.v
    public final com.amazon.aps.iva.xe0.s t() {
        return com.amazon.aps.iva.ff0.b.c;
    }

    @Override // com.amazon.aps.iva.xe0.h
    public final String toString() {
        return "Closed@" + j0.e(this) + '[' + this.e + ']';
    }

    public final Throwable v() {
        Throwable th = this.e;
        if (th == null) {
            return new k();
        }
        return th;
    }

    @Override // com.amazon.aps.iva.ue0.t
    public final Object b() {
        return this;
    }

    @Override // com.amazon.aps.iva.ue0.v
    public final void q() {
    }

    @Override // com.amazon.aps.iva.ue0.v
    public final Object r() {
        return this;
    }

    @Override // com.amazon.aps.iva.ue0.t
    public final void e(E e) {
    }

    @Override // com.amazon.aps.iva.ue0.v
    public final void s(j<?> jVar) {
    }
}
