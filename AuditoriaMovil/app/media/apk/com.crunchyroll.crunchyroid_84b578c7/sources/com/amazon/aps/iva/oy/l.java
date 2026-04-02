package com.amazon.aps.iva.oy;

import android.content.SharedPreferences;
/* compiled from: InAppUpdatesStore.kt */
/* loaded from: classes2.dex */
public final class l implements k {
    public final long a;
    public final com.amazon.aps.iva.xb0.a<Long> b;
    public final SharedPreferences c;

    public l(com.amazon.aps.iva.ya0.f fVar, long j, com.amazon.aps.iva.xb0.a aVar) {
        this.a = j;
        this.b = aVar;
        this.c = fVar.getSharedPreferences("in_app_updates_store", 0);
    }

    @Override // com.amazon.aps.iva.oy.k
    public final void a(int i) {
        this.c.edit().clear().putLong(String.valueOf(i), this.b.invoke().longValue() + this.a).apply();
    }

    @Override // com.amazon.aps.iva.oy.k
    public final boolean b(int i) {
        boolean z;
        Long valueOf = Long.valueOf(this.c.getLong(String.valueOf(i), -1L));
        if (valueOf.longValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null && valueOf.longValue() >= this.b.invoke().longValue()) {
            return true;
        }
        return false;
    }
}
