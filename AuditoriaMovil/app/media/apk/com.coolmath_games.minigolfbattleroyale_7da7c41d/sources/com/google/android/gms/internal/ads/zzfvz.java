package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfvz extends zzfts<zzfzb, zzfyy> {
    final /* synthetic */ zzfwa zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfvz(zzfwa zzfwaVar, Class cls) {
        super(cls);
        this.zza = zzfwaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ void zzb(zzfzb zzfzbVar) throws GeneralSecurityException {
        zzfzb zzfzbVar2 = zzfzbVar;
        if (zzfzbVar2.zza() == 64) {
            return;
        }
        int zza = zzfzbVar2.zza();
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(zza);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidAlgorithmParameterException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzfzb zzc(zzgex zzgexVar) throws zzggm {
        return zzfzb.zzc(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzfyy zzd(zzfzb zzfzbVar) throws GeneralSecurityException {
        zzfyx zze = zzfyy.zze();
        zze.zzb(zzgex.zzt(zzgds.zza(zzfzbVar.zza())));
        zze.zza(0);
        return zze.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final Map<String, zzftr<zzfzb>> zze() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzfza zzd = zzfzb.zzd();
        zzd.zza(64);
        hashMap.put("AES256_SIV", new zzftr(zzd.zzah(), 1));
        zzfza zzd2 = zzfzb.zzd();
        zzd2.zza(64);
        hashMap.put("AES256_SIV_RAW", new zzftr(zzd2.zzah(), 3));
        return Collections.unmodifiableMap(hashMap);
    }
}
