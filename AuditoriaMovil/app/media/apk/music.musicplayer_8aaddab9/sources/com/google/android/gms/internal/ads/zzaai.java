package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzaai implements zzfjl {
    public final /* synthetic */ zzfii zza;

    public zzaai(zzfii zzfiiVar) {
        this.zza = zzfiiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    public final void zza(int i2, long j2) {
        this.zza.zzb(i2, System.currentTimeMillis() - j2);
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    public final void zzb(int i2, long j2, String str) {
        this.zza.zzf(i2, System.currentTimeMillis() - j2, str);
    }
}
