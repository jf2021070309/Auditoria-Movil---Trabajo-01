package com.amazon.aps.iva.gy;

import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
/* compiled from: HomeFeedInteractor.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<HomeFeedItemRaw, Integer> {
    public final /* synthetic */ h h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar) {
        super(1);
        this.h = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Integer invoke(HomeFeedItemRaw homeFeedItemRaw) {
        HomeFeedItemRaw homeFeedItemRaw2 = homeFeedItemRaw;
        com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw2, "rawPanelItem");
        return Integer.valueOf(this.h.g.indexOf(homeFeedItemRaw2));
    }
}
