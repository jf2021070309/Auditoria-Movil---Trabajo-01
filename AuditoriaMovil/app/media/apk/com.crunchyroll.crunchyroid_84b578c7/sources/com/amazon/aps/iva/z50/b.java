package com.amazon.aps.iva.z50;

import android.content.SharedPreferences;
import com.amazon.aps.iva.yb0.j;
/* compiled from: SessionStateStore.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final SharedPreferences a;

    public b(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    @Override // com.amazon.aps.iva.z50.a
    public final void a(String str) {
        j.f(str, "userId");
        SharedPreferences sharedPreferences = this.a;
        sharedPreferences.edit().putInt(str, sharedPreferences.getInt(str, 0) + 1).apply();
    }

    @Override // com.amazon.aps.iva.z50.a
    public final boolean b(String str) {
        j.f(str, "userId");
        return !this.a.contains(str);
    }
}
