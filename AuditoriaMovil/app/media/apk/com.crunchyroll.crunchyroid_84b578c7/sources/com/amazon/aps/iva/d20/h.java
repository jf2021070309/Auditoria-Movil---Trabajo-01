package com.amazon.aps.iva.d20;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: MatureFlowPresenter.kt */
/* loaded from: classes2.dex */
public final class h extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ i h;
    public final /* synthetic */ PlayableAsset i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, PlayableAsset playableAsset) {
        super(0);
        this.h = iVar;
        this.i = playableAsset;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        i iVar = this.h;
        iVar.e = null;
        iVar.d.f(iVar);
        iVar.getView().K();
        iVar.b.k0(this.i, new e(iVar), new f(iVar), new g(iVar));
        return q.a;
    }
}
