package com.amazon.aps.iva.oo;

import android.content.Context;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ij.o;
import com.amazon.aps.iva.qo.w;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.ve0.z;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import java.io.IOException;
/* compiled from: WatchScreenPlayerViewModelImpl.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.ez.b implements f, o {
    public final com.amazon.aps.iva.cj.i b;
    public final com.amazon.aps.iva.po.e c;
    public final w d;
    public final long e;
    public final j f;
    public final com.amazon.aps.iva.az.d g;
    public final com.amazon.aps.iva.az.d h;
    public final v0 i;
    public final v0 j;
    public final k k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.amazon.aps.iva.cj.i iVar, com.amazon.aps.iva.po.f fVar, w wVar, c cVar, boolean z, Context context) {
        super(new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(iVar, "player");
        this.b = iVar;
        this.c = fVar;
        this.d = wVar;
        this.e = System.currentTimeMillis();
        this.f = new j(com.amazon.aps.iva.xy.m.a(wVar.P1()), this);
        z zVar = new z(com.amazon.aps.iva.xy.m.a(wVar.L8()));
        this.g = new com.amazon.aps.iva.az.d(null, new l(this, null), com.amazon.aps.iva.e.w.D(this), zVar);
        com.amazon.aps.iva.xy.b a = com.amazon.aps.iva.xy.m.a(wVar.P1());
        this.h = new com.amazon.aps.iva.az.d(null, new i(this, null), com.amazon.aps.iva.e.w.D(this), a);
        this.i = x.e(new Playhead(0L, false, null, null, 15, null));
        this.j = x.e(null);
        this.k = new k(com.amazon.aps.iva.xy.m.a(wVar.L8()), this);
        com.amazon.aps.iva.dg.b.A(com.amazon.aps.iva.e.w.D(this), new a0(com.amazon.aps.iva.xy.m.a(wVar.P1()), new g(this, null)));
        iVar.R(this, new com.amazon.aps.iva.gj.a(true, z, true), cVar, context);
        iVar.O(true);
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new h(this, null), 3);
    }

    @Override // com.amazon.aps.iva.ij.o
    public final com.amazon.aps.iva.ve0.f A4() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.oo.f
    public final void O1(long j) {
        this.j.setValue(Long.valueOf(j));
    }

    @Override // com.amazon.aps.iva.ij.o
    public final com.amazon.aps.iva.az.b V2() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.ij.o
    public final com.amazon.aps.iva.ve0.f<com.amazon.aps.iva.kj.e> f2() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.ij.o
    public final com.amazon.aps.iva.az.b f5() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.oo.f
    public final void k() {
        IOException iOException;
        boolean z;
        com.amazon.aps.iva.az.d dVar = this.h;
        com.amazon.aps.iva.kj.c cVar = (com.amazon.aps.iva.kj.c) dVar.c.c;
        if (cVar != null) {
            iOException = cVar.d();
        } else {
            iOException = null;
        }
        if (iOException == null) {
            z = true;
        } else {
            z = false;
        }
        dVar.e(z);
    }

    @Override // com.amazon.aps.iva.ez.b, com.amazon.aps.iva.i5.f0
    public final void onCleared() {
        super.onCleared();
        this.b.release();
    }

    @Override // com.amazon.aps.iva.oo.f
    public final void u2(String str) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        com.amazon.aps.iva.cj.i iVar = this.b;
        long x = com.amazon.aps.iva.gr.n.x(iVar.T());
        iVar.Q().f();
        Long valueOf = Long.valueOf(x - 10);
        long j = 0;
        if (valueOf.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            j = valueOf.longValue();
        }
        this.d.V7(j, str);
    }

    @Override // com.amazon.aps.iva.ij.o
    public final com.amazon.aps.iva.ve0.f<com.amazon.aps.iva.kj.e> u3() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.ij.o
    public final com.amazon.aps.iva.ve0.f x2() {
        return this.j;
    }
}
