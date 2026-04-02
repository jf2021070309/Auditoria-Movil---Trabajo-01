package com.amazon.aps.iva.e;

import androidx.activity.OnBackPressedDispatcher;
/* compiled from: OnBackPressedDispatcher.kt */
/* loaded from: classes.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ OnBackPressedDispatcher h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(OnBackPressedDispatcher onBackPressedDispatcher) {
        super(0);
        this.h = onBackPressedDispatcher;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        this.h.c();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
