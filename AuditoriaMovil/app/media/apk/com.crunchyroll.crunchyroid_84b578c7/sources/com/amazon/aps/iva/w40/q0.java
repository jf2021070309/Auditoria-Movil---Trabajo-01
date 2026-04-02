package com.amazon.aps.iva.w40;

import com.amazon.aps.iva.w40.b0;
import com.ellation.crunchyroll.model.simulcast.SimulcastSeason;
import java.util.List;
/* compiled from: SimulcastViewModel.kt */
/* loaded from: classes2.dex */
public final class q0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends SimulcastSeason>>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<SimulcastSeason>>, com.amazon.aps.iva.kb0.q> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(b0.c cVar) {
        super(1);
        this.h = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends SimulcastSeason>> gVar) {
        com.amazon.aps.iva.ez.g<? extends List<? extends SimulcastSeason>> gVar2 = gVar;
        if (gVar2 != null) {
            this.h.invoke(gVar2);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
