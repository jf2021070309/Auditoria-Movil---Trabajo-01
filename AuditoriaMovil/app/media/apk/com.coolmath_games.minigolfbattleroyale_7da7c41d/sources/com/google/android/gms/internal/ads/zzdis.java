package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdis {
    private final List<String> zza;
    private final zzffu zzb;
    private boolean zzc;

    public zzdis(zzezz zzezzVar, zzffu zzffuVar) {
        this.zza = zzezzVar.zzp;
        this.zzb = zzffuVar;
    }

    public final void zza() {
        if (this.zzc) {
            return;
        }
        this.zzb.zza(this.zza);
        this.zzc = true;
    }
}
