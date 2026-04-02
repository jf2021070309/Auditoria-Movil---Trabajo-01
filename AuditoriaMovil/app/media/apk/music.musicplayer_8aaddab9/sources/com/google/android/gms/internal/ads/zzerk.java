package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class zzerk implements zzerx<Bundle> {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final Long zze;

    public zzerk(String str, String str2, String str3, String str4, Long l2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l2;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzfbd.zze(bundle2, "gmp_app_id", this.zza);
        zzfbd.zze(bundle2, "fbs_aiid", this.zzb);
        zzfbd.zze(bundle2, "fbs_aeid", this.zzc);
        zzfbd.zze(bundle2, "apm_id_origin", this.zzd);
        Long l2 = this.zze;
        if (l2 != null) {
            bundle2.putLong("sai_timeout", l2.longValue());
        }
    }
}
