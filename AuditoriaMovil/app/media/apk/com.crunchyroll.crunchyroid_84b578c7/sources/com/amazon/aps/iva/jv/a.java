package com.amazon.aps.iva.jv;

import android.content.Context;
import com.amazon.aps.iva.j8.h;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xu.f;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: CrunchylistSearchAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends l implements p<i, Integer, q> {
    public final /* synthetic */ c h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i) {
        super(2);
        this.h = cVar;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        com.amazon.aps.iva.iv.b bVar;
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar2 = e0.a;
            c cVar = this.h;
            int i = this.i;
            int itemViewType = cVar.getItemViewType(i);
            if (itemViewType != 601) {
                if (itemViewType != 602) {
                    iVar2.s(865128698);
                    iVar2.G();
                } else {
                    iVar2.s(865128277);
                    com.amazon.aps.iva.iv.d.a(iVar2, 0);
                    iVar2.G();
                }
            } else {
                iVar2.s(865128351);
                com.amazon.aps.iva.j8.a<T> aVar = cVar.a;
                h hVar = aVar.f;
                if (hVar == null) {
                    hVar = aVar.e;
                }
                if (hVar != null) {
                    bVar = (com.amazon.aps.iva.iv.b) hVar.get(i);
                } else {
                    bVar = null;
                }
                j.d(bVar, "null cannot be cast to non-null type com.ellation.crunchyroll.crunchylists.crunchylistsearch.item.CrunchylistSearchItemUiModel");
                com.amazon.aps.iva.iv.c cVar2 = (com.amazon.aps.iva.iv.c) bVar;
                f fVar = com.amazon.aps.iva.e1.d.f;
                if (fVar != null) {
                    Context context = cVar.c;
                    f.a(cVar2, cVar.b, fVar.d.invoke(context), iVar2, Panel.$stable);
                    iVar2.G();
                } else {
                    j.m("dependencies");
                    throw null;
                }
            }
        }
        return q.a;
    }
}
