package com.google.android.gms.internal.ads;

import java.util.UUID;
/* loaded from: classes.dex */
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
