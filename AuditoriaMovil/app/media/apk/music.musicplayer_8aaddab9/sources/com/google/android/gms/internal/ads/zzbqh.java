package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.Map;
/* loaded from: classes.dex */
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
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zza();
                return;
            } else if ("video_complete".equals(str)) {
                this.zza.zzc();
                return;
            } else {
                return;
            }
        }
        zzccl zzcclVar = null;
        try {
            int parseInt = Integer.parseInt(map.get(AppLovinEventParameters.REVENUE_AMOUNT));
            String str2 = map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzcclVar = new zzccl(str2, parseInt);
            }
        } catch (NumberFormatException e2) {
            zzcgt.zzj("Unable to parse reward amount.", e2);
        }
        this.zza.zzb(zzcclVar);
    }
}
