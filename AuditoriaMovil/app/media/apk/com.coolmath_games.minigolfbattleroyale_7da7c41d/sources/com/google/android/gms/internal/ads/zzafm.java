package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    public final void zzb(int i) {
        this.zzg = 1 == ((this.zzg ? 1 : 0) | i);
        this.zzb += i;
    }

    public final void zzc(zzahd zzahdVar) {
        this.zzg |= this.zza != zzahdVar;
        this.zza = zzahdVar;
    }

    public final void zzd(int i) {
        if (this.zzc && this.zzd != 5) {
            zzakt.zza(i == 5);
            return;
        }
        this.zzg = true;
        this.zzc = true;
        this.zzd = i;
    }

    public final void zze(int i) {
        this.zzg = true;
        this.zze = true;
        this.zzf = i;
    }
}
