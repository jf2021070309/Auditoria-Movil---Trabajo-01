package com.ellation.crunchyroll.presentation.multitiersubscription.upsellv2;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.i;
/* compiled from: UpsellV2Activity.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class a extends i implements l<Integer, q> {
    public a(UpsellV2Activity upsellV2Activity) {
        super(1, upsellV2Activity, UpsellV2Activity.class, "selectTab", "selectTab(I)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Integer num) {
        int intValue = num.intValue();
        com.amazon.aps.iva.fc0.l<Object>[] lVarArr = UpsellV2Activity.s;
        ((UpsellV2Activity) this.receiver).ni().i.a(intValue);
        return q.a;
    }
}
