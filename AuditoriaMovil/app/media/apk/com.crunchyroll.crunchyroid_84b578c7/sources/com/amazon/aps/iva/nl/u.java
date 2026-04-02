package com.amazon.aps.iva.nl;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.i5.d0;
import com.amazon.aps.iva.ve0.a0;
import java.util.List;
/* compiled from: AudioSettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class u extends com.amazon.aps.iva.ez.b implements q {
    public final com.amazon.aps.iva.tl.c b;
    public final q c;
    public final q d;
    public final com.amazon.aps.iva.ye.f e;
    public final com.amazon.aps.iva.dz.a<List<a>> f;
    public final com.amazon.aps.iva.i5.u g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.amazon.aps.iva.tl.b bVar, com.amazon.aps.iva.ol.f fVar, q qVar, com.amazon.aps.iva.ye.f fVar2) {
        super(new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(bVar, "settingsMonitor");
        com.amazon.aps.iva.yb0.j.f(fVar2, "castStateProvider");
        this.b = bVar;
        this.c = fVar;
        this.d = qVar;
        this.e = fVar2;
        com.amazon.aps.iva.dz.a<List<a>> aVar = new com.amazon.aps.iva.dz.a<>();
        this.f = aVar;
        this.g = d0.b(aVar, t.h);
        com.amazon.aps.iva.dg.b.A(w.D(this), new a0(fVar2.getCastStateFlow(), new r(this, null)));
        com.amazon.aps.iva.dg.b.A(w.D(this), new a0(com.amazon.aps.iva.dg.b.m(com.amazon.aps.iva.i5.j.a(qVar.O5())), new s(this, null)));
    }

    @Override // com.amazon.aps.iva.nl.q
    public final LiveData A7() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.nl.q
    public final LiveData<a> O5() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.nl.q
    public final void m2(a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "option");
        if (this.e.isTryingToCast()) {
            this.d.m2(aVar);
            return;
        }
        q qVar = this.c;
        if (qVar != null) {
            qVar.m2(aVar);
        }
    }
}
