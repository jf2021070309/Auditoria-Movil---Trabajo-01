package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzaql {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzaux zzf;
    private final zzaux zzg;
    private int zzh;
    private int zzi;

    public zzaql(zzaux zzauxVar, zzaux zzauxVar2, boolean z) {
        this.zzg = zzauxVar;
        this.zzf = zzauxVar2;
        this.zze = z;
        zzauxVar2.zzi(12);
        this.zza = zzauxVar2.zzu();
        zzauxVar.zzi(12);
        this.zzi = zzauxVar.zzu();
        zzaup.zze(zzauxVar.zzr() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzv() : this.zzf.zzp();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzu();
            this.zzg.zzj(4);
            int i2 = this.zzi - 1;
            this.zzi = i2;
            this.zzh = i2 > 0 ? (-1) + this.zzg.zzu() : -1;
        }
        return true;
    }
}
