package com.google.android.gms.internal.ads;

import com.facebook.internal.AnalyticsEvents;
import java.util.UUID;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzctu implements zzgla<zzavz> {
    private final zzgln<zzezz> zza;
    private final zzgln<zzcgz> zzb;
    private final zzgln<JSONObject> zzc;
    private final zzgln<String> zzd;

    public zzctu(zzgln<zzezz> zzglnVar, zzgln<zzcgz> zzglnVar2, zzgln<JSONObject> zzglnVar3, zzgln<String> zzglnVar4) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        ((zzcxw) this.zza).zza();
        zzcgz zza = ((zzcox) this.zzb).zza();
        JSONObject zzb = this.zzc.zzb();
        String zzb2 = this.zzd.zzb();
        boolean equals = AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE.equals(zzb2);
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzavz(UUID.randomUUID().toString(), zza, zzb2, zzb, false, equals);
    }
}
