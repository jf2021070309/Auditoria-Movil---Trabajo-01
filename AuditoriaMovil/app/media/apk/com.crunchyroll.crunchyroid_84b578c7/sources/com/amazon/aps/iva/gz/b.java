package com.amazon.aps.iva.gz;

import android.content.SharedPreferences;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.lb0.m0;
import com.amazon.aps.iva.yb0.j;
import java.util.Set;
/* compiled from: NotificationStateStore.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final SharedPreferences a;

    public b(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    @Override // com.amazon.aps.iva.gz.a
    public final void a(String str, String str2) {
        j.f(str, "userId");
        j.f(str2, "notification");
        this.a.edit().putStringSet(str, m0.O(c(str), str2)).apply();
    }

    @Override // com.amazon.aps.iva.gz.a
    public final void b(String str, String str2) {
        j.f(str, "userId");
        j.f(str2, "notification");
        this.a.edit().putStringSet(str, m0.R(c(str), str2)).apply();
    }

    @Override // com.amazon.aps.iva.gz.a
    public final Set<String> c(String str) {
        j.f(str, "userId");
        b0 b0Var = b0.b;
        Set<String> stringSet = this.a.getStringSet(str, b0Var);
        if (stringSet != null) {
            return stringSet;
        }
        return b0Var;
    }
}
