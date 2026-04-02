package com.amazon.aps.iva.n4;

import android.view.View;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: DefaultSpecialEffectsController.kt */
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Map.Entry<String, View>, Boolean> {
    public final /* synthetic */ Collection<String> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Collection<String> collection) {
        super(1);
        this.h = collection;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(Map.Entry<String, View> entry) {
        Map.Entry<String, View> entry2 = entry;
        com.amazon.aps.iva.yb0.j.f(entry2, "entry");
        WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
        return Boolean.valueOf(com.amazon.aps.iva.lb0.x.m0(this.h, g0.i.k(entry2.getValue())));
    }
}
