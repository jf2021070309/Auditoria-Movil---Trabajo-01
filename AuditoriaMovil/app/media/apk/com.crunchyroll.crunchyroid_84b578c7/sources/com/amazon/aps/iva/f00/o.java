package com.amazon.aps.iva.f00;

import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: PlayableAssetItemView.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<PlayableAsset> {
    public final /* synthetic */ p h;
    public final /* synthetic */ q i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, q qVar) {
        super(0);
        this.h = pVar;
        this.i = qVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final PlayableAsset invoke() {
        return this.h.b.b().invoke(this.i.b);
    }
}
