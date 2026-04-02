package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzpx implements zznx {
    private final long zzb;
    private final zznx zzc;

    public zzpx(long j2, zznx zznxVar) {
        this.zzb = j2;
        this.zzc = zznxVar;
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final zzox zzB(int i2, int i3) {
        return this.zzc.zzB(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final void zzC() {
        this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final void zzD(zzot zzotVar) {
        this.zzc.zzD(new zzpw(this, zzotVar));
    }
}
