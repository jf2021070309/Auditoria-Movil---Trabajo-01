package com.amazon.aps.iva.xw;

import android.text.SpannableStringBuilder;
/* compiled from: SpannableUtil.kt */
/* loaded from: classes2.dex */
public final class o0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<SpannableStringBuilder, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(int i) {
        super(1);
        this.h = i;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(SpannableStringBuilder spannableStringBuilder) {
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        com.amazon.aps.iva.yb0.j.f(spannableStringBuilder2, "$this$sizeInDip");
        com.amazon.aps.iva.yb0.j.e(spannableStringBuilder2.append('\n'), "append('\\n')");
        m0.c(spannableStringBuilder2, this.h, n0.h);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
