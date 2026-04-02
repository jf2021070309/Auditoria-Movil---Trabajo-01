package com.amazon.aps.iva.yw;

import android.content.Context;
import com.amazon.aps.iva.a30.a;
/* compiled from: FeaturesProvider.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, String> {
    public final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.amazon.aps.iva.ya0.f fVar) {
        super(1);
        this.h = fVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final String invoke(String str) {
        String str2 = str;
        com.amazon.aps.iva.yb0.j.f(str2, "sku");
        com.amazon.aps.iva.a30.a.Companion.getClass();
        String string = this.h.getString(a.C0100a.a(str2).getTitleResId());
        com.amazon.aps.iva.yb0.j.e(string, "context.getString(CrPlus….fromSku(sku).titleResId)");
        return string;
    }
}
