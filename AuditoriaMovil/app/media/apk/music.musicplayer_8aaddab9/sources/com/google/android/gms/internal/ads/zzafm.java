package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzafm {
    public zzahd zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    public boolean zze;
    public int zzf;
    private boolean zzg;

    public zzafm(zzahd zzahdVar) {
        this.zza = zzahdVar;
    }

    public final void zzb(int i2) {
        this.zzg = 1 == ((this.zzg ? 1 : 0) | i2);
        this.zzb += i2;
    }

    public final void zzc(zzahd zzahdVar) {
        this.zzg |= this.zza != zzahdVar;
        this.zza = zzahdVar;
    }

    public final void zzd(int i2) {
        if (this.zzc && this.zzd != 5) {
            zzakt.zza(i2 == 5);
            return;
        }
        this.zzg = true;
        this.zzc = true;
        this.zzd = i2;
    }

    public final void zze(int i2) {
        this.zzg = true;
        this.zze = true;
        this.zzf = i2;
    }
}
