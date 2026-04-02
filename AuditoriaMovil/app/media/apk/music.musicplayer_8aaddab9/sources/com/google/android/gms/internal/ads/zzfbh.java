package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
/* loaded from: classes.dex */
public final class zzfbh {
    public static void zza(int i2, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(i2);
        zzcgt.zzh(sb.toString());
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i2 == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzg().zzl(th, str);
    }

    public static void zzb(Context context, boolean z) {
        if (z) {
            zzcgt.zzh("This request is sent from a test device.");
            return;
        }
        zzber.zza();
        String zzt = zzcgm.zzt(context);
        StringBuilder sb = new StringBuilder(String.valueOf(zzt).length() + FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH);
        sb.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb.append(zzt);
        sb.append("\")) to get test ads on this device.");
        zzcgt.zzh(sb.toString());
    }
}
