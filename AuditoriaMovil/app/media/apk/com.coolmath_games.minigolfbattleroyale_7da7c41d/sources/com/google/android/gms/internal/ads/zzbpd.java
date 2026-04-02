package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzbpd implements zzbpr {
    static final zzbpr zza = new zzbpd();

    private zzbpd() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map map) {
        zzcnu zzcnuVar = (zzcnu) obj;
        zzbpr<zzcml> zzbprVar = zzbpq.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzaas zzU = zzcnuVar.zzU();
            if (zzU != null) {
                zzU.zzb().zzk(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            com.google.android.gms.ads.internal.util.zze.zzi("Could not parse touch parameters from gmsg.");
        }
    }
}
