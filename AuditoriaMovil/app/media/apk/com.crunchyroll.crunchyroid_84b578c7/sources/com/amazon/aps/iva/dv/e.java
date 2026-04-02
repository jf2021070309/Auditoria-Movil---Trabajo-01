package com.amazon.aps.iva.dv;

import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
import com.google.android.gms.ads.AdRequest;
/* compiled from: CrunchylistAdapter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ d h;
    public final /* synthetic */ int i;
    public final /* synthetic */ RecyclerView.f0 j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, int i, RecyclerView.f0 f0Var, com.amazon.aps.iva.xb0.a<q> aVar, int i2) {
        super(2);
        this.h = dVar;
        this.i = i;
        this.j = f0Var;
        this.k = aVar;
        this.l = i2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            d dVar = this.h;
            Object obj = dVar.a.f.get(this.i);
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type com.ellation.crunchyroll.crunchylists.crunchylist.list.CrunchylistUnavailableShowItem");
            defpackage.g.a((m) obj, dVar.b, ((j) this.j).f, this.k, iVar2, ((this.l << 9) & 7168) | AdRequest.MAX_CONTENT_URL_LENGTH, 0);
        }
        return q.a;
    }
}
