package com.amazon.aps.iva.v1;

import android.content.Context;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class n0 implements com.amazon.aps.iva.o0.u0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ p0 b;

    public n0(Context context, p0 p0Var) {
        this.a = context;
        this.b = p0Var;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        this.a.getApplicationContext().unregisterComponentCallbacks(this.b);
    }
}
