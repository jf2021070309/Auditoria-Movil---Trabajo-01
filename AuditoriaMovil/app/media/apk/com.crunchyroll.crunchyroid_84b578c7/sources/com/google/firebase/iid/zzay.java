package com.google.firebase.iid;

import android.text.TextUtils;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
public final class zzay {
    private static final long zzb = TimeUnit.DAYS.toMillis(7);
    final String zza;
    private final String zzc;
    private final long zzd;

    private zzay(String str, String str2, long j) {
        this.zza = str;
        this.zzc = str2;
        this.zzd = j;
    }

    public static zzay zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                c cVar = new c(str);
                return new zzay(cVar.getString("token"), cVar.getString("appVersion"), cVar.getLong("timestamp"));
            } catch (b e) {
                new StringBuilder(String.valueOf(e).length() + 23);
                return null;
            }
        }
        return new zzay(str, null, 0L);
    }

    public final boolean zzb(String str) {
        if (System.currentTimeMillis() <= this.zzd + zzb && str.equals(this.zzc)) {
            return false;
        }
        return true;
    }

    public static String zza(String str, String str2, long j) {
        try {
            c cVar = new c();
            cVar.put("token", str);
            cVar.put("appVersion", str2);
            cVar.put("timestamp", j);
            return cVar.toString();
        } catch (b e) {
            new StringBuilder(String.valueOf(e).length() + 24);
            return null;
        }
    }

    public static String zza(zzay zzayVar) {
        if (zzayVar == null) {
            return null;
        }
        return zzayVar.zza;
    }
}
