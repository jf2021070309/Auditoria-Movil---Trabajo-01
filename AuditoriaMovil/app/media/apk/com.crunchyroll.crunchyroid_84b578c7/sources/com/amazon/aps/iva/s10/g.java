package com.amazon.aps.iva.s10;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.r10.a0;
import com.amazon.aps.iva.r10.y;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
/* compiled from: HistoryAdapter.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.z70.a h;
    public final /* synthetic */ i i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.amazon.aps.iva.z70.a aVar, i iVar) {
        super(2);
        this.h = aVar;
        this.i = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.z70.a aVar = this.h;
            if (aVar.getBindingAdapterPosition() >= 0) {
                int bindingAdapterPosition = aVar.getBindingAdapterPosition();
                i iVar3 = this.i;
                int itemViewType = iVar3.getItemViewType(bindingAdapterPosition);
                if (itemViewType != 301) {
                    if (itemViewType != 302) {
                        iVar2.s(1642747122);
                        iVar2.G();
                    } else {
                        iVar2.s(1642745901);
                        l.a(null, iVar2, 0, 1);
                        iVar2.G();
                    }
                } else {
                    iVar2.s(1642745974);
                    a0 d = iVar3.d(aVar.getBindingAdapterPosition());
                    com.amazon.aps.iva.yb0.j.d(d, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.history.HistoryDataItemUiModel");
                    com.amazon.aps.iva.r10.l lVar = (com.amazon.aps.iva.r10.l) d;
                    y a = iVar3.e.a(lVar);
                    com.amazon.aps.iva.pe0.b p0 = x.p0(iVar3.f.b(lVar.a));
                    k.b(a, x.m0(iVar3.c.a(lVar)), new e(iVar3, lVar), new f(iVar3, lVar, aVar), lVar.c, null, p0, iVar2, LabelUiModel.$stable | Image.$stable | 0, 32);
                    iVar2.G();
                }
            }
        }
        return q.a;
    }
}
