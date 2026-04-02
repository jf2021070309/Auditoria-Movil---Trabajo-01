package com.amazon.aps.iva.e;

import androidx.activity.OnBackPressedDispatcher;
/* compiled from: OnBackPressedDispatcher.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class t extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public t(Object obj) {
        super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        ((OnBackPressedDispatcher) this.receiver).e();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
