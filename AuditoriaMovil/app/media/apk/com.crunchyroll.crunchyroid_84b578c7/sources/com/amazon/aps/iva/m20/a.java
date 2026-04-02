package com.amazon.aps.iva.m20;

import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: UpsellCarouselLayout.kt */
/* loaded from: classes2.dex */
public final class a extends l implements q<Float, Integer, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ c h;
    public final /* synthetic */ k i;
    public final /* synthetic */ e j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, k kVar, e eVar) {
        super(3);
        this.h = cVar;
        this.i = kVar;
        this.j = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(Float f, Integer num, Integer num2) {
        float floatValue = f.floatValue();
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        this.h.update(floatValue, Integer.valueOf(intValue), Integer.valueOf(intValue2));
        this.i.update(floatValue, Integer.valueOf(intValue), Integer.valueOf(intValue2));
        this.j.update(floatValue, Integer.valueOf(intValue), Integer.valueOf(intValue2));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
