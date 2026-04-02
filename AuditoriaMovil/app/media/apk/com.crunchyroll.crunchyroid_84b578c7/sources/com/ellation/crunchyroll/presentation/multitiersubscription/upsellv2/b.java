package com.ellation.crunchyroll.presentation.multitiersubscription.upsellv2;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: UpsellV2Activity.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ UpsellV2Activity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(UpsellV2Activity upsellV2Activity) {
        super(0);
        this.h = upsellV2Activity;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        UpsellV2Activity.mi(this.h).b();
        return q.a;
    }
}
