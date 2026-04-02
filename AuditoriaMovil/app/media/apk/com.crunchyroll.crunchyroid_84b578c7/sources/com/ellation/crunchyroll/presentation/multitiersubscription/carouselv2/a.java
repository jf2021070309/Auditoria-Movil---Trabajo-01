package com.ellation.crunchyroll.presentation.multitiersubscription.carouselv2;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: UpsellCarouselLayout.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Integer, q> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(com.amazon.aps.iva.xb0.l<? super Integer, q> lVar) {
        super(1);
        this.h = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Integer num) {
        this.h.invoke(Integer.valueOf(num.intValue()));
        return q.a;
    }
}
