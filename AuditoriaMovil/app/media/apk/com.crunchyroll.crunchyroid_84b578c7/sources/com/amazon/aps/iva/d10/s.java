package com.amazon.aps.iva.d10;

import android.content.Intent;
/* compiled from: DownloadsAnalytics.kt */
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Intent, Boolean> {
    public static final s h = new s();

    public s() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(Intent intent) {
        Intent intent2 = intent;
        com.amazon.aps.iva.yb0.j.f(intent2, "it");
        com.amazon.aps.iva.zv.b bVar = com.amazon.aps.iva.sv.e.e;
        if (bVar != null) {
            return Boolean.valueOf(bVar.b(intent2));
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }
}
