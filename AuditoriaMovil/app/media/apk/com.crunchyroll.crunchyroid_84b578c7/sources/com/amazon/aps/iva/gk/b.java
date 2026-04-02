package com.amazon.aps.iva.gk;

import com.amazon.aps.iva.ik.c;
import com.amazon.aps.iva.ik.e;
import com.amazon.aps.iva.ik.f;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.v0;
import com.amazon.aps.iva.qj.h;
import com.amazon.aps.iva.s6.g;
import com.amazon.aps.iva.yb0.j;
/* compiled from: PlayerTrackSelector.kt */
/* loaded from: classes.dex */
public final class b extends a implements l0.c, c, com.amazon.aps.iva.hk.b {
    public final c e;
    public final com.amazon.aps.iva.hk.b f;

    public b(e eVar, com.amazon.aps.iva.hk.c cVar, g gVar) {
        super(gVar);
        this.e = eVar;
        this.f = cVar;
    }

    @Override // com.amazon.aps.iva.ik.c
    public final void G(f fVar) {
        this.e.G(fVar);
    }

    @Override // com.amazon.aps.iva.hk.b
    public final void a() {
        this.f.a();
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void b(v0 v0Var) {
        j.f(v0Var, "tracks");
        this.e.b(v0Var);
        this.f.b(v0Var);
    }

    @Override // com.amazon.aps.iva.hk.b
    public final void f(h hVar) {
        this.f.f(hVar);
    }
}
