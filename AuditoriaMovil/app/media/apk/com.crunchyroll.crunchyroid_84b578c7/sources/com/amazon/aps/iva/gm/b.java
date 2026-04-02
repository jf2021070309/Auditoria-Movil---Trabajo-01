package com.amazon.aps.iva.gm;

import com.ellation.crunchyroll.api.etp.assets.model.AssetType;
/* compiled from: AssetSelectionController.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.k5.a, h> {
    public final /* synthetic */ a0 h;
    public final /* synthetic */ AssetType i;
    public final /* synthetic */ com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a0 a0Var, AssetType assetType, com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> bVar) {
        super(1);
        this.h = a0Var;
        this.i = assetType;
        this.j = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final h invoke(com.amazon.aps.iva.k5.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "$this$viewModel");
        return new h(this.h, this.i, this.j);
    }
}
