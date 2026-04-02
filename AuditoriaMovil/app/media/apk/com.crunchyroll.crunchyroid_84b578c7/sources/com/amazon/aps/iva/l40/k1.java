package com.amazon.aps.iva.l40;

import com.ellation.crunchyroll.model.ContentContainer;
/* compiled from: ShowPageViewModel.kt */
/* loaded from: classes2.dex */
public final class k1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<ContentContainer, com.amazon.aps.iva.m50.b> {
    public static final k1 h = new k1();

    public k1() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.m50.b invoke(ContentContainer contentContainer) {
        ContentContainer contentContainer2 = contentContainer;
        com.amazon.aps.iva.yb0.j.f(contentContainer2, "it");
        return new com.amazon.aps.iva.m50.b(contentContainer2.getId(), contentContainer2.getResourceType(), contentContainer2.getTitle(), contentContainer2.getChannelId(), contentContainer2.getImages());
    }
}
