package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzil extends zzgi implements zzic {
    private final zzagk zza;
    private final zzagj zzb;
    private final zzai zzc;
    private final zzhw zzd;
    private final zzff zze;
    private final int zzf;
    private boolean zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;
    private zzay zzk;
    private final zzku zzl;

    public /* synthetic */ zzil(zzagk zzagkVar, zzai zzaiVar, zzhw zzhwVar, zzff zzffVar, zzku zzkuVar, int i2, zzik zzikVar, byte[] bArr) {
        zzagj zzagjVar = zzagkVar.zzc;
        Objects.requireNonNull(zzagjVar);
        this.zzb = zzagjVar;
        this.zza = zzagkVar;
        this.zzc = zzaiVar;
        this.zzd = zzhwVar;
        this.zze = zzffVar;
        this.zzl = zzkuVar;
        this.zzf = i2;
        this.zzg = true;
        this.zzh = -9223372036854775807L;
    }

    private final void zzv() {
        long j2 = this.zzh;
        boolean z = this.zzi;
        boolean z2 = this.zzj;
        zzagk zzagkVar = this.zza;
        zziy zziyVar = new zziy(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j2, j2, 0L, 0L, z, false, false, null, zzagkVar, z2 ? zzagkVar.zzd : null);
        zze(this.zzg ? new zzih(this, zziyVar) : zziyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzA(zzhe zzheVar) {
        ((zzig) zzheVar).zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final zzhe zzC(zzhf zzhfVar, zzko zzkoVar, long j2) {
        zzaj zza = this.zzc.zza();
        zzay zzayVar = this.zzk;
        if (zzayVar != null) {
            zza.zza(zzayVar);
        }
        Uri uri = this.zzb.zza;
        zzhx zza2 = this.zzd.zza();
        zzff zzffVar = this.zze;
        zzfa zzh = zzh(zzhfVar);
        zzku zzkuVar = this.zzl;
        zzho zzf = zzf(zzhfVar);
        String str = this.zzb.zzf;
        return new zzig(uri, zza, zza2, zzffVar, zzh, zzkuVar, zzf, this, zzkoVar, null, this.zzf, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zza(zzay zzayVar) {
        this.zzk = zzayVar;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzb(long j2, boolean z, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.zzh;
        }
        if (!this.zzg && this.zzh == j2 && this.zzi == z && this.zzj == z2) {
            return;
        }
        this.zzh = j2;
        this.zzi = z;
        this.zzj = z2;
        this.zzg = false;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzu() {
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final zzagk zzz() {
        return this.zza;
    }
}
