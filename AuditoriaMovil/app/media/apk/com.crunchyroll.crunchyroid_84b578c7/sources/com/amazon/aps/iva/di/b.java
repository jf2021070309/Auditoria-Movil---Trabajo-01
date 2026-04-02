package com.amazon.aps.iva.di;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
import java.util.List;
/* compiled from: FeaturedMusicDataProvider.kt */
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.ei.i>>, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ShowPageActivity.p pVar, ShowPageActivity.o oVar) {
        super(1);
        this.h = pVar;
        this.i = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.ei.i>> gVar) {
        com.amazon.aps.iva.xb0.a<q> aVar;
        com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.ei.i>> gVar2 = gVar;
        com.amazon.aps.iva.yb0.j.f(gVar2, "value");
        if (gVar2 instanceof g.a) {
            aVar = this.h;
        } else {
            aVar = this.i;
        }
        aVar.invoke();
        return q.a;
    }
}
