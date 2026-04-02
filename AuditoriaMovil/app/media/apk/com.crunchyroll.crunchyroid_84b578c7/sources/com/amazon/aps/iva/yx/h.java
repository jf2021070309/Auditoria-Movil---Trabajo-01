package com.amazon.aps.iva.yx;

import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xx.c;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: PanelItemDelegate.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ RecyclerView.f0 h;
    public final /* synthetic */ com.amazon.aps.iva.xx.l i;
    public final /* synthetic */ i j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(RecyclerView.f0 f0Var, com.amazon.aps.iva.xx.l lVar, i iVar) {
        super(2);
        this.h = f0Var;
        this.i = lVar;
        this.j = iVar;
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
                com.amazon.aps.iva.xx.k kVar = ((c.b) lVar).h;
                com.amazon.aps.iva.jt.a aVar2 = new com.amazon.aps.iva.jt.a(com.amazon.aps.iva.js.k.CARD, aVar.getBindingAdapterPosition());
                i iVar3 = this.j;
                com.amazon.aps.iva.lt.a.a(b, kVar, aVar2, iVar3.b, iVar3.c, iVar3.a, null, iVar2, Panel.$stable | 37376, 64);
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
