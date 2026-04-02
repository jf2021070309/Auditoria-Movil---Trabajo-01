package com.amazon.aps.iva.fk;

import com.amazon.aps.iva.o6.u;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.w5.y;
import com.amazon.aps.iva.yb0.j;
/* compiled from: EmptyMediaSource.kt */
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.o6.a {
    public final b0 h;

    public a(b0 b0Var) {
        j.f(b0Var, "mediaItem");
        this.h = b0Var;
    }

    @Override // com.amazon.aps.iva.o6.v
    public final b0 b() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void c(u uVar) {
        j.f(uVar, "mediaPeriod");
    }

    @Override // com.amazon.aps.iva.o6.v
    public final u h(v.b bVar, com.amazon.aps.iva.t6.b bVar2, long j) {
        j.f(bVar2, "allocator");
        throw new UnsupportedOperationException();
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void j() {
    }

    @Override // com.amazon.aps.iva.o6.a
    public final void t() {
    }

    @Override // com.amazon.aps.iva.o6.a
    public final void r(y yVar) {
    }
}
