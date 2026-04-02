package com.amazon.aps.iva.f10;

import android.view.View;
import com.amazon.aps.iva.kb0.q;
/* compiled from: DownloadsCardOverflowMenuProvider.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, q> {
    public final /* synthetic */ l h;
    public final /* synthetic */ com.amazon.aps.iva.d10.i i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, com.amazon.aps.iva.d10.i iVar) {
        super(1);
        this.h = lVar;
        this.i = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "it");
        this.h.b.invoke(this.i.a);
        return q.a;
    }
}
