package com.amazon.aps.iva.c60;

import com.amazon.aps.iva.b60.k;
import com.amazon.aps.iva.b60.s;
import com.amazon.aps.iva.k50.h;
import com.amazon.aps.iva.k50.n;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: WatchlistCarouselViewAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends l implements p<i, Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.z70.a h;
    public final /* synthetic */ d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, com.amazon.aps.iva.z70.a aVar) {
        super(2);
        this.h = aVar;
        this.i = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.z70.a aVar = this.h;
            if (aVar.getBindingAdapterPosition() >= 0) {
                int bindingAdapterPosition = aVar.getBindingAdapterPosition();
                d dVar = this.i;
                int itemViewType = dVar.getItemViewType(bindingAdapterPosition);
                if (itemViewType != 1010) {
                    if (itemViewType != 2020) {
                        iVar2.s(-345612484);
                        iVar2.G();
                    } else {
                        iVar2.s(-345613537);
                        com.amazon.aps.iva.st.d.a(dVar.b, null, iVar2, 0, 2);
                        iVar2.G();
                    }
                } else {
                    iVar2.s(-345613465);
                    s d = dVar.d(aVar.getBindingAdapterPosition());
                    j.d(d, "null cannot be cast to non-null type com.ellation.crunchyroll.watchlist.WatchlistDataItemUiModel");
                    a aVar2 = new a(dVar, aVar);
                    n nVar = dVar.c;
                    j.f(nVar, "watchScreenRouter");
                    h hVar = dVar.d;
                    j.f(hVar, "showPageRouter");
                    com.amazon.aps.iva.ws.f fVar = dVar.e;
                    j.f(fVar, "panelAnalytics");
                    com.amazon.aps.iva.st.c.a((k) d, new com.amazon.aps.iva.st.b(nVar, hVar, fVar, aVar2), null, iVar2, 8, 4);
                    iVar2.G();
                }
            }
        }
        return q.a;
    }
}
