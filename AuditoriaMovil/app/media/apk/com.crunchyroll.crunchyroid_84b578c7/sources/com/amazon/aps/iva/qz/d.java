package com.amazon.aps.iva.qz;

import com.ellation.crunchyroll.api.cms.model.Season;
/* compiled from: AssetListViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.assets.AssetListViewModelImpl", f = "AssetListViewModel.kt", l = {234, 235, 236}, m = "loadAssetListUpdateData")
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.qb0.c {
    public c h;
    public Season i;
    public /* synthetic */ Object j;
    public final /* synthetic */ c k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, com.amazon.aps.iva.ob0.d<? super d> dVar) {
        super(dVar);
        this.k = cVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return c.O8(this.k, null, this);
    }
}
