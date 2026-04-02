package com.amazon.aps.iva.b4;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: SharedPreferencesMigration.kt */
/* loaded from: classes.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.a<SharedPreferences> {
    public final /* synthetic */ Context h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str) {
        super(0);
        this.h = context;
        this.i = str;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final SharedPreferences invoke() {
        SharedPreferences sharedPreferences = this.h.getSharedPreferences(this.i, 0);
        j.e(sharedPreferences, "context.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
