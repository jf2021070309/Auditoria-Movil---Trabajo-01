package com.amazon.aps.iva.sl;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xw.m0;
/* compiled from: QualityTitleFormatter.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements p<String, String, SpannableStringBuilder> {
    public final /* synthetic */ Context h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, int i) {
        super(2);
        this.h = context;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final SpannableStringBuilder invoke(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        com.amazon.aps.iva.yb0.j.f(str3, "$this$null");
        com.amazon.aps.iva.yb0.j.f(str4, "it");
        return m0.b(com.amazon.aps.iva.d3.a.getColor(this.h, this.i), str3, str4);
    }
}
