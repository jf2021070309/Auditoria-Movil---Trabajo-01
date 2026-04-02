package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbpx implements zzbpr<Object> {
    private final Context zza;

    public zzbpx(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map<String, String> map) {
        char c;
        if (com.google.android.gms.ads.internal.zzt.zzA().zzb(this.zza)) {
            String str = map.get("eventName");
            String str2 = map.get("eventId");
            int hashCode = str.hashCode();
            if (hashCode == 94399) {
                if (str.equals("_aa")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("_ac")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                com.google.android.gms.ads.internal.zzt.zzA().zzn(this.zza, str2);
            } else if (c == 1) {
                com.google.android.gms.ads.internal.zzt.zzA().zzo(this.zza, str2);
            } else if (c == 2) {
                com.google.android.gms.ads.internal.zzt.zzA().zzq(this.zza, str2);
            } else {
                com.google.android.gms.ads.internal.util.zze.zzf("logScionEvent gmsg contained unsupported eventName");
            }
        }
    }
}
