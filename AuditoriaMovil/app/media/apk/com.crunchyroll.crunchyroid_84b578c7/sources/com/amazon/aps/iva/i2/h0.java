package com.amazon.aps.iva.i2;

import android.view.inputmethod.BaseInputConnection;
/* compiled from: TextInputServiceAndroid.android.kt */
/* loaded from: classes.dex */
public final class h0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<BaseInputConnection> {
    public final /* synthetic */ g0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(g0 g0Var) {
        super(0);
        this.h = g0Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.h.a, false);
    }
}
