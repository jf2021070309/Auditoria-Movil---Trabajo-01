package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzqy {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzamf zzf;
    private final zzamf zzg;
    private int zzh;
    private int zzi;

    public zzqy(zzamf zzamfVar, zzamf zzamfVar2, boolean z) throws zzaha {
        this.zzg = zzamfVar;
        this.zzf = zzamfVar2;
        this.zze = z;
        zzamfVar2.zzh(12);
        this.zza = zzamfVar2.zzB();
        zzamfVar.zzh(12);
        this.zzi = zzamfVar.zzB();
        zzny.zza(zzamfVar.zzv() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i2 = this.zzb + 1;
        this.zzb = i2;
        if (i2 == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzD() : this.zzf.zzt();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzB();
            this.zzg.zzk(4);
            int i3 = this.zzi - 1;
            this.zzi = i3;
            this.zzh = i3 > 0 ? (-1) + this.zzg.zzB() : -1;
        }
        return true;
    }
}
