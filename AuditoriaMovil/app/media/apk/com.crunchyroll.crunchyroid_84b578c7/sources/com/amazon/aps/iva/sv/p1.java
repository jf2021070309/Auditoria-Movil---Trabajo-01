package com.amazon.aps.iva.sv;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: DownloadsMetaRegistry.kt */
/* loaded from: classes2.dex */
public final class p1 implements o1 {
    public final SharedPreferences a;

    public p1(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("downloads_meta_cache", 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…e\", Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }

    @Override // com.amazon.aps.iva.sv.o1
    public final void a(String str) {
        this.a.edit().putString("account_id", str).apply();
    }

    @Override // com.amazon.aps.iva.sv.o1
    public final String b() {
        return this.a.getString("account_id", null);
    }
}
