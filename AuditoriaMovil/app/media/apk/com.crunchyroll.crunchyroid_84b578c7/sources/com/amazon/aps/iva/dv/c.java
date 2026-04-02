package com.amazon.aps.iva.dv;

import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: CrunchylistAdapter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ a h;
    public final /* synthetic */ d i;
    public final /* synthetic */ RecyclerView.f0 j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, d dVar, RecyclerView.f0 f0Var, com.amazon.aps.iva.xb0.a<q> aVar2, int i) {
        super(2);
        this.h = aVar;
        this.i = dVar;
        this.j = f0Var;
        this.k = aVar2;
        this.l = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            a aVar = this.h;
            com.amazon.aps.iva.yb0.j.e(aVar, "model");
            d dVar = this.i;
            defpackage.d.a((g) aVar, dVar.c, dVar.b, ((j) this.j).f, this.k, iVar2, Panel.$stable | 4096 | ((this.l << 12) & 57344), 0);
        }
        return q.a;
    }
}
