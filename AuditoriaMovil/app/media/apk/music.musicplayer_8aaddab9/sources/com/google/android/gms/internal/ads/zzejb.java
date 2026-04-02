package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
/* loaded from: classes.dex */
public final class zzejb implements zzdcl {
    public boolean zza = false;
    public final /* synthetic */ zzeef zzb;
    public final /* synthetic */ zzchl zzc;
    public final /* synthetic */ zzejc zzd;

    public zzejb(zzejc zzejcVar, zzeef zzeefVar, zzchl zzchlVar) {
        this.zzd = zzejcVar;
        this.zzb = zzeefVar;
        this.zzc = zzchlVar;
    }

    private final void zze(zzbcz zzbczVar) {
        this.zzc.zzd(new zzeeg(true == ((Boolean) zzbet.zzc().zzc(zzbjl.zzdM)).booleanValue() ? 3 : 1, zzbczVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final synchronized void zza() {
        this.zzc.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zzb(int i2) {
        if (this.zza) {
            return;
        }
        zze(new zzbcz(i2, zzejc.zze(this.zzb.zza, i2), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final synchronized void zzc(int i2, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzejc.zze(this.zzb.zza, i2);
        }
        zze(new zzbcz(i2, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final synchronized void zzd(zzbcz zzbczVar) {
        this.zza = true;
        zze(zzbczVar);
    }
}
