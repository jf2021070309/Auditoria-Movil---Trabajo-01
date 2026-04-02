package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzate extends zzanx {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;

    public zzate(long j2, boolean z) {
        this.zzc = j2;
        this.zzd = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final zzanw zzb(int i2, zzanw zzanwVar, boolean z, long j2) {
        zzaup.zzc(i2, 0, 1);
        zzanwVar.zza = this.zzd;
        return zzanwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final zzanv zzd(int i2, zzanv zzanvVar, boolean z) {
        zzaup.zzc(i2, 0, 1);
        Object obj = z ? zzb : null;
        long j2 = this.zzc;
        zzanvVar.zza = obj;
        zzanvVar.zzb = obj;
        zzanvVar.zzc = j2;
        return zzanvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final int zze(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }
}
