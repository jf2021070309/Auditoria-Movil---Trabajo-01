package com.google.android.gms.internal.ads;

import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdzh implements zzgla<String> {
    public static zzdzh zza() {
        zzdzh zzdzhVar;
        zzdzhVar = zzdzg.zza;
        return zzdzhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzt.zzc();
        String uuid = UUID.randomUUID().toString();
        zzgli.zzb(uuid);
        return uuid;
    }
}
