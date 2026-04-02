package com.amazon.aps.iva.l40;

import com.ellation.crunchyroll.model.ContentContainer;
/* compiled from: ShowPageViewModel.kt */
/* loaded from: classes2.dex */
public final class l1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<ContentContainer, com.amazon.aps.iva.di.d> {
    public static final l1 h = new l1();

    public l1() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.di.d invoke(ContentContainer contentContainer) {
        ContentContainer contentContainer2 = contentContainer;
        com.amazon.aps.iva.yb0.j.f(contentContainer2, "it");
        return new com.amazon.aps.iva.di.d(contentContainer2.getId());
    }
}
