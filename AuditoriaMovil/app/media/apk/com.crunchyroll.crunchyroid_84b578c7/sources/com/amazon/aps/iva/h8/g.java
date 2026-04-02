package com.amazon.aps.iva.h8;

import com.amazon.aps.iva.o0.u0;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class g implements u0 {
    public final /* synthetic */ com.amazon.aps.iva.g8.f a;
    public final /* synthetic */ androidx.lifecycle.j b;

    public g(com.amazon.aps.iva.g8.f fVar, androidx.lifecycle.j jVar) {
        this.a = fVar;
        this.b = jVar;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        this.a.i.removeObserver(this.b);
    }
}
