package com.amazon.aps.iva.dw;

import com.ellation.crunchyroll.downloading.e0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ExoDownloadsProvider.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends e0>> {
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(0);
        this.h = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final List<? extends e0> invoke() {
        d dVar = this.h;
        List<com.amazon.aps.iva.m6.c> invoke = dVar.b.invoke();
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(invoke));
        for (com.amazon.aps.iva.m6.c cVar : invoke) {
            arrayList.add(dVar.c.a(cVar));
        }
        return arrayList;
    }
}
