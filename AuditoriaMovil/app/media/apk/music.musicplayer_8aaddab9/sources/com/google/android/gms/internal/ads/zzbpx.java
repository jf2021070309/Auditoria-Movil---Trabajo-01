package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzbpx implements zzbpr<Object> {
    private final Context zza;

    public zzbpx(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map<String, String> map) {
        char c2;
        if (com.google.android.gms.ads.internal.zzt.zzA().zzb(this.zza)) {
            String str = map.get("eventName");
            String str2 = map.get("eventId");
            int hashCode = str.hashCode();
            if (hashCode == 94399) {
                if (str.equals("_aa")) {
                    c2 = 2;
                }
                c2 = 65535;
            } else if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c2 = 1;
                }
                c2 = 65535;
            } else {
                if (str.equals("_ac")) {
                    c2 = 0;
                }
                c2 = 65535;
            }
            if (c2 == 0) {
                com.google.android.gms.ads.internal.zzt.zzA().zzn(this.zza, str2);
            } else if (c2 == 1) {
                com.google.android.gms.ads.internal.zzt.zzA().zzo(this.zza, str2);
            } else if (c2 != 2) {
                zzcgt.zzf("logScionEvent gmsg contained unsupported eventName");
            } else {
                com.google.android.gms.ads.internal.zzt.zzA().zzq(this.zza, str2);
            }
        }
    }
}
