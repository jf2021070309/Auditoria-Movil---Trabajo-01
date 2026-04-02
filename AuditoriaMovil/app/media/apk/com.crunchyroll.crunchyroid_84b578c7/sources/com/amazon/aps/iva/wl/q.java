package com.amazon.aps.iva.wl;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.ve0.a0;
import java.util.List;
/* compiled from: SubtitlesSettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class q extends f0 implements o {
    public final o b;
    public final o c;
    public final com.amazon.aps.iva.ye.f d;
    public final com.amazon.aps.iva.dz.a<com.amazon.aps.iva.jh.f> e;
    public final com.amazon.aps.iva.dz.a<List<com.amazon.aps.iva.jh.f>> f;

    public q(com.amazon.aps.iva.xl.i iVar, f fVar, com.amazon.aps.iva.ye.f fVar2) {
        com.amazon.aps.iva.yb0.j.f(fVar2, "castStateProvider");
        this.b = iVar;
        this.c = fVar;
        this.d = fVar2;
        this.e = new com.amazon.aps.iva.dz.a<>();
        this.f = new com.amazon.aps.iva.dz.a<>();
        com.amazon.aps.iva.dg.b.A(w.D(this), new a0(fVar2.getCastStateFlow(), new p(this, null)));
    }

    @Override // com.amazon.aps.iva.wl.o
    public final void C3(String str, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, "language");
        if (this.d.isTryingToCast()) {
            this.b.C3(str, z);
        } else {
            this.c.C3(str, z);
        }
    }

    @Override // com.amazon.aps.iva.wl.o
    public final void O(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "newLanguage");
        if (this.d.isTryingToCast()) {
            this.b.O(str);
        } else {
            this.c.O(str);
        }
    }

    @Override // com.amazon.aps.iva.wl.o
    public final LiveData S2() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.wl.o
    public final LiveData w() {
        return this.e;
    }
}
