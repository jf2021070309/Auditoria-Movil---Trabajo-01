package com.amazon.aps.iva.b4;

import android.content.SharedPreferences;
import com.amazon.aps.iva.yb0.j;
import java.util.Set;
/* compiled from: SharedPreferencesMigration.kt */
/* loaded from: classes.dex */
public final class d {
    public final SharedPreferences a;
    public final Set<String> b;

    public d(SharedPreferences sharedPreferences, Set<String> set) {
        j.f(sharedPreferences, "prefs");
        this.a = sharedPreferences;
        this.b = set;
    }
}
