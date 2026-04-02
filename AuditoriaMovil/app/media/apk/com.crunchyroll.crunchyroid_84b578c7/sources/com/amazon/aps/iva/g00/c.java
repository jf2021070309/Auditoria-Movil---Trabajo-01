package com.amazon.aps.iva.g00;

import android.view.View;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PlayableAssetItemOverflowMenuProvider.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<View, q> {
    public final /* synthetic */ e h;
    public final /* synthetic */ com.amazon.aps.iva.f00.q i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, com.amazon.aps.iva.f00.q qVar) {
        super(1);
        this.h = eVar;
        this.i = qVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(View view) {
        j.f(view, "it");
        com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oh.a, q> lVar = this.h.a;
        com.amazon.aps.iva.f00.q qVar = this.i;
        lVar.invoke(new com.amazon.aps.iva.oh.a(f1.J(new com.amazon.aps.iva.nz.a(qVar.b, qVar.u)), qVar.s));
        return q.a;
    }
}
