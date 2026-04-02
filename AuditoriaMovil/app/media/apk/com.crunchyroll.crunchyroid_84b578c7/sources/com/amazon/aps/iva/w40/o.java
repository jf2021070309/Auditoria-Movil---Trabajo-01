package com.amazon.aps.iva.w40;

import android.content.Intent;
/* compiled from: SimulcastAnalytics.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Intent, Boolean> {
    public static final o h = new o();

    public o() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(Intent intent) {
        Intent intent2 = intent;
        com.amazon.aps.iva.yb0.j.f(intent2, "it");
        return Boolean.valueOf(com.amazon.aps.iva.gr.n.w(intent2));
    }
}
