package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzejb implements zzdcl {
    boolean zza = false;
    final /* synthetic */ zzeef zzb;
    final /* synthetic */ zzchl zzc;
    final /* synthetic */ zzejc zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
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
    public final void zzb(int i) {
        if (this.zza) {
            return;
        }
        zze(new zzbcz(i, zzejc.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final synchronized void zzc(int i, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzejc.zze(this.zzb.zza, i);
        }
        zze(new zzbcz(i, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final synchronized void zzd(zzbcz zzbczVar) {
        this.zza = true;
        zze(zzbczVar);
    }
}
