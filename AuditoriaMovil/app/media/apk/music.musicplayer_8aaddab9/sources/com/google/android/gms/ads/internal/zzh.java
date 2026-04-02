package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfii;
import com.google.android.gms.internal.ads.zzfjl;
/* loaded from: classes.dex */
public final class zzh implements zzfjl {
    public final /* synthetic */ zzi zza;

    public zzh(zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    public final void zza(int i2, long j2) {
        zzfii zzfiiVar;
        zzfiiVar = this.zza.zzi;
        zzfiiVar.zzb(i2, System.currentTimeMillis() - j2);
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    public final void zzb(int i2, long j2, String str) {
        zzfii zzfiiVar;
        zzfiiVar = this.zza.zzi;
        zzfiiVar.zzf(i2, System.currentTimeMillis() - j2, str);
    }
}
