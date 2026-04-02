package com.amazon.aps.iva.xx;

import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
/* compiled from: HomeFeedItem.kt */
/* loaded from: classes2.dex */
public abstract class h extends l {
    public final String b;
    public final String c;
    public final String d;

    public h(HomeFeedItemRaw homeFeedItemRaw) {
        this.b = homeFeedItemRaw.getId();
        this.c = homeFeedItemRaw.getChannelId();
        this.d = homeFeedItemRaw.getTitle();
        homeFeedItemRaw.getDescription();
        homeFeedItemRaw.getLink();
    }

    @Override // com.amazon.aps.iva.xx.l
    public String a() {
        return this.b;
    }
}
