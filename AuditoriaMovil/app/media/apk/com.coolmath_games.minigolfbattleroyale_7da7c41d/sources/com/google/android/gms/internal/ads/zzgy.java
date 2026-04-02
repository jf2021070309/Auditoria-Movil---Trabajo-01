package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgy implements zzhe, zzhd {
    public final zzhf zza;
    private final long zzb;
    private zzhh zzc;
    private zzhe zzd;
    private zzhd zze;
    private long zzf = -9223372036854775807L;
    private final zzko zzg;

    public zzgy(zzhf zzhfVar, zzko zzkoVar, long j, byte[] bArr) {
        this.zza = zzhfVar;
        this.zzg = zzkoVar;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzf;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzb(zzhd zzhdVar, long j) {
        this.zze = zzhdVar;
        zzhe zzheVar = this.zzd;
        if (zzheVar != null) {
            zzheVar.zzb(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzc() throws IOException {
        try {
            zzhe zzheVar = this.zzd;
            if (zzheVar != null) {
                zzheVar.zzc();
                return;
            }
            zzhh zzhhVar = this.zzc;
            if (zzhhVar != null) {
                zzhhVar.zzu();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final zzs zzd() {
        zzhe zzheVar = this.zzd;
        int i = zzamq.zza;
        return zzheVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zze(long j, boolean z) {
        zzhe zzheVar = this.zzd;
        int i = zzamq.zza;
        zzheVar.zze(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final void zzf(long j) {
        zzhe zzheVar = this.zzd;
        int i = zzamq.zza;
        zzheVar.zzf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzg() {
        zzhe zzheVar = this.zzd;
        int i = zzamq.zza;
        return zzheVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final long zzh() {
        zzhe zzheVar = this.zzd;
        int i = zzamq.zza;
        return zzheVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzi(long j) {
        zzhe zzheVar = this.zzd;
        int i = zzamq.zza;
        return zzheVar.zzi(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzj(long j, zzahz zzahzVar) {
        zzhe zzheVar = this.zzd;
        int i = zzamq.zza;
        return zzheVar.zzj(j, zzahzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final long zzk() {
        zzhe zzheVar = this.zzd;
        int i = zzamq.zza;
        return zzheVar.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final boolean zzl(long j) {
        zzhe zzheVar = this.zzd;
        return zzheVar != null && zzheVar.zzl(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final boolean zzm() {
        zzhe zzheVar = this.zzd;
        return zzheVar != null && zzheVar.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzn(zzhe zzheVar) {
        zzhd zzhdVar = this.zze;
        int i = zzamq.zza;
        zzhdVar.zzn(this);
    }

    public final void zzo(long j) {
        this.zzf = j;
    }

    @Override // com.google.android.gms.internal.ads.zziv
    public final /* bridge */ /* synthetic */ void zzp(zzhe zzheVar) {
        zzhd zzhdVar = this.zze;
        int i = zzamq.zza;
        zzhdVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzq(zzjg[] zzjgVarArr, boolean[] zArr, zziu[] zziuVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.zzf;
        if (j3 == -9223372036854775807L || j != this.zzb) {
            j2 = j;
        } else {
            this.zzf = -9223372036854775807L;
            j2 = j3;
        }
        zzhe zzheVar = this.zzd;
        int i = zzamq.zza;
        return zzheVar.zzq(zzjgVarArr, zArr, zziuVarArr, zArr2, j2);
    }

    public final long zzr() {
        return this.zzf;
    }

    public final void zzs(zzhh zzhhVar) {
        zzakt.zzd(this.zzc == null);
        this.zzc = zzhhVar;
    }

    public final void zzt(zzhf zzhfVar) {
        long zzv = zzv(this.zzb);
        zzhh zzhhVar = this.zzc;
        if (zzhhVar == null) {
            throw null;
        }
        zzhe zzC = zzhhVar.zzC(zzhfVar, this.zzg, zzv);
        this.zzd = zzC;
        if (this.zze != null) {
            zzC.zzb(this, zzv);
        }
    }

    public final void zzu() {
        zzhe zzheVar = this.zzd;
        if (zzheVar != null) {
            zzhh zzhhVar = this.zzc;
            if (zzhhVar != null) {
                zzhhVar.zzA(zzheVar);
                return;
            }
            throw null;
        }
    }
}
