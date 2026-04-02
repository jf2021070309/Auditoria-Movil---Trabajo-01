package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
/* loaded from: classes4.dex */
final class zzv {
    private final SharedPreferences zza;

    public zzv(Context context) {
        this.zza = context.getSharedPreferences("com.google.android.gms.appid", 0);
    }

    public final synchronized String zza() {
        return this.zza.getString("topic_operation_queue", "");
    }

    public final synchronized boolean zzb(String str) {
        String str2;
        String zza = zza();
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = ",".concat(valueOf);
        } else {
            str2 = new String(",");
        }
        if (zza.startsWith(str2)) {
            zza(zza.substring(str2.length()));
            return true;
        }
        if (zzu.zzc()) {
            new StringBuilder(zza.length() + 105);
        }
        return false;
    }

    public final synchronized void zza(String str) {
        this.zza.edit().putString("topic_operation_queue", str).apply();
    }
}
