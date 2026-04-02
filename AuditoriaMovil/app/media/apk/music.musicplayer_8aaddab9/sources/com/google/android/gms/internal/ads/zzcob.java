package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzcob {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcob(int i2, int i3, int i4) {
        this.zzc = i2;
        this.zzb = i3;
        this.zza = i4;
    }

    public static zzcob zza(zzbdl zzbdlVar) {
        return zzbdlVar.zzd ? new zzcob(3, 0, 0) : zzbdlVar.zzi ? new zzcob(2, 0, 0) : zzbdlVar.zzh ? zzb() : zzc(zzbdlVar.zzf, zzbdlVar.zzc);
    }

    public static zzcob zzb() {
        return new zzcob(0, 0, 0);
    }

    public static zzcob zzc(int i2, int i3) {
        return new zzcob(1, i2, i3);
    }

    public static zzcob zzd() {
        return new zzcob(4, 0, 0);
    }

    public static zzcob zze() {
        return new zzcob(5, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 2;
    }

    public final boolean zzg() {
        return this.zzc == 3;
    }

    public final boolean zzh() {
        return this.zzc == 0;
    }

    public final boolean zzi() {
        return this.zzc == 4;
    }

    public final boolean zzj() {
        return this.zzc == 5;
    }
}
