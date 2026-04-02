package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzdlv implements zzgla<zzavz> {
    private final zzgln<zzcgz> zza;
    private final zzgln<String> zzb;

    public zzdlv(zzgln<zzcgz> zzglnVar, zzgln<String> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcgz zza = ((zzcox) this.zza).zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzavz(UUID.randomUUID().toString(), zza, "native", new JSONObject(), false, true);
    }
}
