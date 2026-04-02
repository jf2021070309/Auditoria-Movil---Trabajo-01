package com.amazon.aps.iva.a6;

import com.amazon.aps.iva.q5.r0;
/* compiled from: PlaylistTimeline.java */
/* loaded from: classes.dex */
public final class m1 extends com.amazon.aps.iva.o6.o {
    public final r0.d h;

    public m1(com.amazon.aps.iva.q5.r0 r0Var) {
        super(r0Var);
        this.h = new r0.d();
    }

    @Override // com.amazon.aps.iva.o6.o, com.amazon.aps.iva.q5.r0
    public final r0.b h(int i, r0.b bVar, boolean z) {
        r0.b h = super.h(i, bVar, z);
        if (o(h.d, this.h).b()) {
            h.j(bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, com.amazon.aps.iva.q5.c.h, true);
        } else {
            h.g = true;
        }
        return h;
    }
}
