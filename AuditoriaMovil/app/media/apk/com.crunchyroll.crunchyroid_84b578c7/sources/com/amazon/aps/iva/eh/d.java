package com.amazon.aps.iva.eh;

import android.app.Application;
import android.content.SharedPreferences;
import com.amazon.aps.iva.yb0.j;
/* compiled from: EventsCountStore.kt */
/* loaded from: classes.dex */
public class d implements c {
    public final SharedPreferences a;

    public d(Application application, String str) {
        j.f(application, "context");
        this.a = application.getSharedPreferences(str, 0);
    }

    @Override // com.amazon.aps.iva.eh.c
    public final void a(int i) {
        this.a.edit().putInt("events_count", i).apply();
    }

    @Override // com.amazon.aps.iva.eh.c
    public final int b() {
        return this.a.getInt("events_count", 0);
    }

    @Override // com.amazon.aps.iva.eh.c
    public final void clear() {
        this.a.edit().clear().apply();
    }
}
