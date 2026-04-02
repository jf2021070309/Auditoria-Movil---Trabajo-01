package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzhr implements zzhe, zzhd {
    private final zzhe zza;
    private final long zzb;
    private zzhd zzc;

    public zzhr(zzhe zzheVar, long j2) {
        this.zza = zzheVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzb(zzhd zzhdVar, long j2) {
        this.zzc = zzhdVar;
        this.zza.zzb(this, j2 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final zzs zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zze(long j2, boolean z) {
        this.zza.zze(j2 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final void zzf(long j2) {
        this.zza.zzf(j2 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzg() {
        long zzg = this.zza.zzg();
        if (zzg == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzg + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final long zzh() {
        long zzh = this.zza.zzh();
        if (zzh == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzh + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzi(long j2) {
        return this.zza.zzi(j2 - this.zzb) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzj(long j2, zzahz zzahzVar) {
        return this.zza.zzj(j2 - this.zzb, zzahzVar) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final long zzk() {
        long zzk = this.zza.zzk();
        if (zzk == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzk + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final boolean zzl(long j2) {
        return this.zza.zzl(j2 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final boolean zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzn(zzhe zzheVar) {
        zzhd zzhdVar = this.zzc;
        Objects.requireNonNull(zzhdVar);
        zzhdVar.zzn(this);
    }

    @Override // com.google.android.gms.internal.ads.zziv
    public final /* bridge */ /* synthetic */ void zzp(zzhe zzheVar) {
        zzhd zzhdVar = this.zzc;
        Objects.requireNonNull(zzhdVar);
        zzhdVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzq(zzjg[] zzjgVarArr, boolean[] zArr, zziu[] zziuVarArr, boolean[] zArr2, long j2) {
        zziu[] zziuVarArr2 = new zziu[zziuVarArr.length];
        int i2 = 0;
        while (true) {
            zziu zziuVar = null;
            if (i2 >= zziuVarArr.length) {
                break;
            }
            zzhs zzhsVar = (zzhs) zziuVarArr[i2];
            if (zzhsVar != null) {
                zziuVar = zzhsVar.zza();
            }
            zziuVarArr2[i2] = zziuVar;
            i2++;
        }
        long zzq = this.zza.zzq(zzjgVarArr, zArr, zziuVarArr2, zArr2, j2 - this.zzb);
        for (int i3 = 0; i3 < zziuVarArr.length; i3++) {
            zziu zziuVar2 = zziuVarArr2[i3];
            if (zziuVar2 == null) {
                zziuVarArr[i3] = null;
            } else {
                zziu zziuVar3 = zziuVarArr[i3];
                if (zziuVar3 == null || ((zzhs) zziuVar3).zza() != zziuVar2) {
                    zziuVarArr[i3] = new zzhs(zziuVar2, this.zzb);
                }
            }
        }
        return zzq + this.zzb;
    }
}
