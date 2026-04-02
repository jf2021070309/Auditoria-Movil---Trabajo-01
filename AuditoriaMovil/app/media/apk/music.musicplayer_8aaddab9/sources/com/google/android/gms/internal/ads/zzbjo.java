package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public final class zzbjo {
    private final String zza = zzbkt.zzb.zze();
    private final Map<String, String> zzb;
    private final Context zzc;
    private final String zzd;

    public zzbjo(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzc();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzs.zzx());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.zzt.zzc();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzH(context) ? "0" : "1");
        Future<zzcbo> zzb = com.google.android.gms.ads.internal.zzt.zzn().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(zzb.get().zzk));
            linkedHashMap.put("network_fine", Integer.toString(zzb.get().zzl));
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.zzt.zzg().zzk(e2, "CsiConfiguration.CsiConfiguration");
        }
    }

    public final String zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final Map<String, String> zzd() {
        return this.zzb;
    }
}
