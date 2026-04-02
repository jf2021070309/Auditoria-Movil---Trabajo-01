package com.amazon.aps.iva.yh;

import androidx.lifecycle.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: MusicFeature.kt */
/* loaded from: classes.dex */
public final class h extends l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.di.p> {
    public final /* synthetic */ com.amazon.aps.iva.di.e h;
    public final /* synthetic */ i i;
    public final /* synthetic */ androidx.fragment.app.h j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.amazon.aps.iva.di.f fVar, i iVar, androidx.fragment.app.h hVar) {
        super(1);
        this.h = fVar;
        this.i = iVar;
        this.j = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.di.p invoke(p pVar) {
        j.f(pVar, "it");
        return new com.amazon.aps.iva.di.p(this.h, new com.amazon.aps.iva.at.f(new g(this.i)), new d(new b(this.j)));
    }
}
