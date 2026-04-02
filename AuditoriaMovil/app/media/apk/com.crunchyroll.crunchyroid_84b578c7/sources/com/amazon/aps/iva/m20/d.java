package com.amazon.aps.iva.m20;

import android.view.View;
import com.amazon.aps.iva.yb0.l;
/* compiled from: UpsellCarouselLayout.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.n20.a, View> {
    public static final d h = new d();

    public d() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final View invoke(com.amazon.aps.iva.n20.a aVar) {
        com.amazon.aps.iva.n20.a aVar2 = aVar;
        if (aVar2 != null) {
            return aVar2.getItemContainer();
        }
        return null;
    }
}
