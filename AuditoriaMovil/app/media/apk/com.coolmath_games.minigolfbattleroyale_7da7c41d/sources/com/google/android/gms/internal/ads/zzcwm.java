package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcwm implements zzgla<Boolean> {
    private final zzgln<zzfar> zza;

    public zzcwm(zzgln<zzfar> zzglnVar) {
        this.zza = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final Boolean zzb() {
        boolean z = true;
        if (((zzdat) this.zza).zza().zza() == null) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzdQ)).booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
