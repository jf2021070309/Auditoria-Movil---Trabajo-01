package com.amazon.aps.iva.i2;

import android.view.inputmethod.InputMethodManager;
/* compiled from: InputMethodManager.kt */
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<InputMethodManager> {
    public final /* synthetic */ p h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar) {
        super(0);
        this.h = pVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final InputMethodManager invoke() {
        Object systemService = this.h.a.getContext().getSystemService("input_method");
        com.amazon.aps.iva.yb0.j.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }
}
