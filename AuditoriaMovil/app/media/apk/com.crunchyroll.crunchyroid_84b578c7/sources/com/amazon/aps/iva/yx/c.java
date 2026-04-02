package com.amazon.aps.iva.yx;

import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xx.c;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.UpNext;
/* compiled from: PanelItemDelegate.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ RecyclerView.f0 h;
    public final /* synthetic */ com.amazon.aps.iva.xx.l i;
    public final /* synthetic */ d j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RecyclerView.f0 f0Var, com.amazon.aps.iva.xx.l lVar, d dVar) {
        super(2);
        this.h = f0Var;
        this.i = lVar;
        this.j = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.z70.a aVar = (com.amazon.aps.iva.z70.a) this.h;
            if (aVar.getBindingAdapterPosition() >= 0) {
                com.amazon.aps.iva.xx.l lVar = this.i;
                com.amazon.aps.iva.yb0.j.d(lVar, "null cannot be cast to non-null type com.ellation.crunchyroll.feed.adapter.item.BasePanelItem");
                Panel b = ((com.amazon.aps.iva.xx.c) lVar).b();
                c.a aVar2 = (c.a) lVar;
                UpNext upNext = aVar2.i;
                com.amazon.aps.iva.xx.k kVar = aVar2.h;
                d dVar = this.j;
                com.amazon.aps.iva.kt.c.a(b, upNext, kVar, dVar.b, new com.amazon.aps.iva.jt.a(com.amazon.aps.iva.js.k.CARD, aVar.getBindingAdapterPosition()), dVar.a, null, iVar2, 36864 | Panel.$stable | (UpNext.$stable << 3), 64);
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
