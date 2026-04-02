package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfvi extends zzfts<zzfzh, zzfze> {
    final /* synthetic */ zzfvj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfvi(zzfvj zzfvjVar, Class cls) {
        super(cls);
        this.zza = zzfvjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ void zzb(zzfzh zzfzhVar) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzfzh zzc(zzgex zzgexVar) throws zzggm {
        return zzfzh.zza(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzfze zzd(zzfzh zzfzhVar) throws GeneralSecurityException {
        zzfzd zze = zzfze.zze();
        zze.zza(0);
        zze.zzb(zzgex.zzt(zzgds.zza(32)));
        return zze.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final Map<String, zzftr<zzfzh>> zze() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new zzftr(zzfzh.zzc(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new zzftr(zzfzh.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }
}
