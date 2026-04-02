package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbqh implements zzbpr<Object> {
    private final zzbqg zza;

    public zzbqh(zzbqg zzbqgVar) {
        this.zza = zzbqgVar;
    }

    public static void zzb(zzcml zzcmlVar, zzbqg zzbqgVar) {
        zzcmlVar.zzab("/reward", new zzbqh(zzbqgVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if ("grant".equals(str)) {
            zzccl zzcclVar = null;
            try {
                int parseInt = Integer.parseInt(map.get(AppLovinEventParameters.REVENUE_AMOUNT));
                String str2 = map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzcclVar = new zzccl(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                com.google.android.gms.ads.internal.util.zze.zzj("Unable to parse reward amount.", e);
            }
            this.zza.zzb(zzcclVar);
        } else if ("video_start".equals(str)) {
            this.zza.zza();
        } else if ("video_complete".equals(str)) {
            this.zza.zzc();
        }
    }
}
