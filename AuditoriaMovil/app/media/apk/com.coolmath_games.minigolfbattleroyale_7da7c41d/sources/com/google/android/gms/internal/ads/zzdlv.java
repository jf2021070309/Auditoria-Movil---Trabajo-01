package com.google.android.gms.internal.ads;

import com.facebook.internal.AnalyticsEvents;
import java.util.UUID;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
        return new zzavz(UUID.randomUUID().toString(), zza, AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE, new JSONObject(), false, true);
    }
}
