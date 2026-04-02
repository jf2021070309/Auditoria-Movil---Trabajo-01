package com.amazon.aps.iva.ev;

import android.view.View;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CrunchylistShowOverflowMenuProvider.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<View, q> {
    public final /* synthetic */ i h;
    public final /* synthetic */ com.amazon.aps.iva.dv.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, com.amazon.aps.iva.dv.a aVar) {
        super(1);
        this.h = iVar;
        this.i = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(View view) {
        j.f(view, "it");
        this.h.a.invoke(this.i);
        return q.a;
    }
}
