package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfbb {
    private final zzezz zza;
    private final zzfac zzb;
    private final zzedq zzc;
    private final zzffu zzd;

    public zzfbb(zzedq zzedqVar, zzffu zzffuVar, zzezz zzezzVar, zzfac zzfacVar) {
        this.zza = zzezzVar;
        this.zzb = zzfacVar;
        this.zzc = zzedqVar;
        this.zzd = zzffuVar;
    }

    public final void zza(List<String> list) {
        for (String str : list) {
            zzc(str, 2);
        }
    }

    public final void zzb(List<String> list, int i) {
        for (String str : list) {
            zzc(str, i);
        }
    }

    public final void zzc(String str, int i) {
        if (!this.zza.zzaf) {
            this.zzd.zzb(str);
            return;
        }
        this.zzc.zze(new zzeds(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis(), this.zzb.zzb, str, i));
    }
}
