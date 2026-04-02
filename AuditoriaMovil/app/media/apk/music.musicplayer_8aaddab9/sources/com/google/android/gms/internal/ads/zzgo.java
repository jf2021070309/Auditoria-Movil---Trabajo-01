package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes.dex */
public final class zzgo implements zzhp, zzfb {
    public final /* synthetic */ zzgq zza;
    private final Object zzb;
    private zzho zzc;
    private zzfa zzd;

    public zzgo(zzgq zzgqVar, Object obj) {
        this.zza = zzgqVar;
        this.zzc = zzgqVar.zzf(null);
        this.zzd = zzgqVar.zzh(null);
        this.zzb = obj;
    }

    private final boolean zza(int i2, zzhf zzhfVar) {
        zzhf zzhfVar2;
        if (zzhfVar != null) {
            zzhfVar2 = this.zza.zzx(this.zzb, zzhfVar);
            if (zzhfVar2 == null) {
                return false;
            }
        } else {
            zzhfVar2 = null;
        }
        zzho zzhoVar = this.zzc;
        if (zzhoVar.zza != i2 || !zzamq.zzc(zzhoVar.zzb, zzhfVar2)) {
            this.zzc = this.zza.zzg(i2, zzhfVar2, 0L);
        }
        zzfa zzfaVar = this.zzd;
        if (zzfaVar.zza == i2 && zzamq.zzc(zzfaVar.zzb, zzhfVar2)) {
            return true;
        }
        this.zzd = this.zza.zzi(i2, zzhfVar2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzC(int i2, zzhf zzhfVar, zzgx zzgxVar, zzhc zzhcVar) {
        if (zza(i2, zzhfVar)) {
            this.zzc.zze(zzgxVar, zzhcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzD(int i2, zzhf zzhfVar, zzgx zzgxVar, zzhc zzhcVar) {
        if (zza(i2, zzhfVar)) {
            this.zzc.zzg(zzgxVar, zzhcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzE(int i2, zzhf zzhfVar, zzgx zzgxVar, zzhc zzhcVar) {
        if (zza(i2, zzhfVar)) {
            this.zzc.zzi(zzgxVar, zzhcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzF(int i2, zzhf zzhfVar, zzgx zzgxVar, zzhc zzhcVar, IOException iOException, boolean z) {
        if (zza(i2, zzhfVar)) {
            this.zzc.zzk(zzgxVar, zzhcVar, iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzG(int i2, zzhf zzhfVar, zzhc zzhcVar) {
        if (zza(i2, zzhfVar)) {
            this.zzc.zzm(zzhcVar);
        }
    }
}
