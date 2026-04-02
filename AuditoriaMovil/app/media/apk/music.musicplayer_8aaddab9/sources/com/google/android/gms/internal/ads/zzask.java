package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes.dex */
public final class zzask implements zzatb {
    public final /* synthetic */ zzasl zza;
    private final int zzb;

    public zzask(zzasl zzaslVar, int i2) {
        this.zza = zzaslVar;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final boolean zzb() {
        return this.zza.zzs(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void zzc() throws IOException {
        this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final int zzd(zzann zzannVar, zzapg zzapgVar, boolean z) {
        return this.zza.zzu(this.zzb, zzannVar, zzapgVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void zze(long j2) {
        this.zza.zzv(this.zzb, j2);
    }
}
