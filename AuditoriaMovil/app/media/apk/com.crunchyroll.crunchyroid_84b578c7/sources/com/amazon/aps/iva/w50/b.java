package com.amazon.aps.iva.w50;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: UserConsentStore.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final SharedPreferences a;

    public b(Context context) {
        this.a = context.getSharedPreferences("USER_CONSENT", 0);
    }

    @Override // com.amazon.aps.iva.w50.a
    public final void a(boolean z) {
        this.a.edit().putBoolean("IS_CONSENT_TO_ALL_PURPOSES", !z).apply();
    }

    public final boolean b() {
        return !this.a.getBoolean("IS_CONSENT_TO_ALL_PURPOSES", true);
    }
}
