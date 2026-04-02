package com.amazon.aps.iva.mh;

import android.content.SharedPreferences;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
/* compiled from: AcceptedTosStore.kt */
/* loaded from: classes.dex */
public final class d implements c {
    public final SharedPreferences a;

    public d(CrunchyrollApplication crunchyrollApplication) {
        SharedPreferences sharedPreferences = crunchyrollApplication.getSharedPreferences("terms_of_service", 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…e\", Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }

    @Override // com.amazon.aps.iva.mh.c
    public final String a() {
        String string = this.a.getString("accepted_tos_version", "");
        if (string == null) {
            return "";
        }
        return string;
    }

    @Override // com.amazon.aps.iva.mh.c
    public final void b(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "newTermsDate");
        this.a.edit().putString("accepted_tos_version", str).apply();
    }

    @Override // com.amazon.aps.iva.mh.c
    public final boolean c() {
        return this.a.contains("accepted_tos_version");
    }
}
