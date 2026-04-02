package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.facebook.appevents.AppEventsConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbjo {
    private final String zza = zzbkt.zzb.zze();
    private final Map<String, String> zzb;
    private final Context zzc;
    private final String zzd;

    public zzbjo(Context context, String str) {
        String packageName;
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        this.zzb.put("v", "3");
        this.zzb.put("os", Build.VERSION.RELEASE);
        this.zzb.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.zzb;
        com.google.android.gms.ads.internal.zzt.zzc();
        map.put("device", com.google.android.gms.ads.internal.util.zzs.zzx());
        Map<String, String> map2 = this.zzb;
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        map2.put("app", packageName);
        Map<String, String> map3 = this.zzb;
        com.google.android.gms.ads.internal.zzt.zzc();
        map3.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzH(context) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1");
        Future<zzcbo> zzb = com.google.android.gms.ads.internal.zzt.zzn().zzb(this.zzc);
        try {
            this.zzb.put("network_coarse", Integer.toString(zzb.get().zzk));
            this.zzb.put("network_fine", Integer.toString(zzb.get().zzl));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zzb() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzc() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> zzd() {
        return this.zzb;
    }
}
