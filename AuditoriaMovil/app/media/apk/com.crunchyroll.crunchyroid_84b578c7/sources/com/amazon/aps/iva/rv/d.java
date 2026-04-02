package com.amazon.aps.iva.rv;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.aps.iva.yb0.j;
import java.util.UUID;
/* compiled from: DeviceIdProvider.kt */
/* loaded from: classes2.dex */
public final class d implements c {
    public final SharedPreferences a;

    public d(Context context) {
        j.f(context, "context");
        this.a = context.getSharedPreferences("device_id_store", 0);
    }

    @Override // com.amazon.aps.iva.rv.c
    public final String getDeviceId() {
        SharedPreferences sharedPreferences = this.a;
        if (!sharedPreferences.contains("device_id")) {
            sharedPreferences.edit().putString("device_id", UUID.randomUUID().toString()).apply();
        }
        String string = sharedPreferences.getString("device_id", "");
        if (string == null) {
            return "";
        }
        return string;
    }
}
