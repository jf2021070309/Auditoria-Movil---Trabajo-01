package com.amazon.aps.iva.l40;

import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.Images;
/* compiled from: ShowPageViewModel.kt */
/* loaded from: classes2.dex */
public final class p1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<ContentContainer, Images> {
    public static final p1 h = new p1();

    public p1() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Images invoke(ContentContainer contentContainer) {
        ContentContainer contentContainer2 = contentContainer;
        com.amazon.aps.iva.yb0.j.f(contentContainer2, "it");
        return contentContainer2.getImages();
    }
}
