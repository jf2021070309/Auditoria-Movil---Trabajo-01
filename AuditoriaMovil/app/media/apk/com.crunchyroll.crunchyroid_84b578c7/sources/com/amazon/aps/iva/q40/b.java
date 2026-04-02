package com.amazon.aps.iva.q40;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.uz.h;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: SimilarAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends l implements p<i, Integer, q> {
    public final /* synthetic */ d h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i) {
        super(2);
        this.h = dVar;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            d dVar = this.h;
            int i = this.i;
            int itemViewType = dVar.getItemViewType(i);
            if (itemViewType != 100) {
                if (itemViewType != 101) {
                    iVar2.s(-835336458);
                    iVar2.G();
                } else {
                    iVar2.s(-835336896);
                    Object obj = dVar.a.f.get(i);
                    j.d(obj, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.browse.adapter.BrowseUiModel.PanelBrowseUiModel.SmallPanelBrowseUiModel");
                    h.c.C0774c c0774c = (h.c.C0774c) obj;
                    com.amazon.aps.iva.wz.a.a(c0774c.c, new a(dVar, c0774c, i), dVar.b, null, com.amazon.aps.iva.a00.b.Popularity, iVar2, Panel.$stable | 25088, 8);
                    iVar2.G();
                }
            } else {
                iVar2.s(-835336952);
                com.amazon.aps.iva.wz.b.a(null, iVar2, 0, 1);
                iVar2.G();
            }
        }
        return q.a;
    }
}
