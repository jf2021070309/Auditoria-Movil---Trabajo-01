package com.amazon.aps.iva.hy;

import android.view.View;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xw.f0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yx.g;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: ContinueWatchingOverflowMenuProvider.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<View, q> {
    public final /* synthetic */ e h;
    public final /* synthetic */ g i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, g gVar) {
        super(1);
        this.h = eVar;
        this.i = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(View view) {
        j.f(view, "it");
        com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oh.a, q> lVar = this.h.a;
        g gVar = this.i;
        String id = gVar.a.getId();
        Panel panel = gVar.a;
        lVar.invoke(new com.amazon.aps.iva.oh.a(f1.J(new com.amazon.aps.iva.nz.a(id, f0.a(panel))), w.w(panel)));
        return q.a;
    }
}
